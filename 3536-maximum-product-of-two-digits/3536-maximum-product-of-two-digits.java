class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> ar = new ArrayList<>();
        while(n!=0){
            ar.add(n%10);
            n/=10;
        }
        int max = 0;
        int smx = 0;
        for(int nn:ar){
            if(nn>max){
                smx = max;
                max = nn;
            }
            else if(nn>smx){
                smx = nn;
            }
        }
        return max*smx;
    }
}