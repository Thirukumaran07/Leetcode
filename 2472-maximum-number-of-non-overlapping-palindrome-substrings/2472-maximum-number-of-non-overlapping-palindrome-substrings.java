class Solution {
    public boolean check(String s, int l, int r){
        while(l<r){
            if(s.charAt(l++)!=s.charAt(r--)){
                return false;
            }
        }
        return true;
    }
    public int maxPalindromes(String s, int k) {
        int n = s.length();
        int st = 0, res = 0;
        for(int r = k-1;r<n;r++){
            int l = r-k+1;
            if(l>=st && check(s,l,r)){
                res++;
                st = r+1;
                continue;
            }
            l=r-k;
            if(l>=st && check(s,l,r)){
                res++;
                st=r+1;
            }
        }
        return res;
    }
}