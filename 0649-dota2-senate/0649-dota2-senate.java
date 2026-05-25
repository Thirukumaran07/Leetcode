class Solution 
{
    public String predictPartyVictory(String senate) 
    {
        Queue<Integer> rad = new LinkedList<>();
        Queue<Integer> dir = new LinkedList<>();
        for(int i=0;i<senate.length();i++)
        {
            if(senate.charAt(i)=='R')
            {
                rad.offer(i);
            }
            else
            {
                dir.offer(i);
            }
        }
        while(!rad.isEmpty() && !dir.isEmpty())
        {
            int r = rad.poll();
            int d = dir.poll();
            if(r<d)
            {
                rad.offer(r+senate.length());
            }
            else
            {
                dir.offer(d+senate.length());
            }
        }
        return rad.isEmpty()?"Dire":"Radiant";
    }
}