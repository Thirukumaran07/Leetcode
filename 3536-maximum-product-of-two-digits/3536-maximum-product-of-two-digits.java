class Solution {
    public int maxProduct(int n) {
        int max = 0;
        int smx = 0;
        while(n>0){
            int nn = n%10;
            if(nn>max){
                smx = max;
                max = nn;
            }
            else if(nn>smx){
                smx = nn;
            }        
            n /= 10;
        }
        return max*smx;
    }
}