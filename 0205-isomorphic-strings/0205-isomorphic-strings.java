class Solution {
    public boolean isIsomorphic(String s, String t) {
        int st[] = new int[256];
        int ts[] = new int[256];
        for(int i=0;i<s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(st[c1]!=ts[c2]){
                return false;
            }
            st[c1]=i+1;
            ts[c2]=i+1;
        }
        return true;
    }
}