class Solution {
    int mod = 1000000007;
    public int distinctSubseqII(String s) {
        int res = 0;
        int dp[] = new int[26];
        for(char i:s.toCharArray()){
            int c = i-97;
            int add = (res - dp[c] + mod) % mod;
            dp[c] = 1+res;
            res = (dp[c]+add) % mod;
        }
        return res;
    }
}