class Solution {
    public int reverse(int x) {
        long ans = 0;
        while(x!=0){
            ans = ans*10 ;
            ans+=x%10;
            x = x/10;
        }
        if(Integer.MIN_VALUE > ans || ans > Integer.MAX_VALUE){
            return 0;
        }
        return (int)ans;
    }
}