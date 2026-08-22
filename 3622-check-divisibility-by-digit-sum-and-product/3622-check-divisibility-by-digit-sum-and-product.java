class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int prod = 1;
        int t = n;
        while(t>0){
            int temp = t%10;
            sum += temp;
            prod *= temp;
            t/=10;
        }
        if(n%(sum+prod)==0){
            return true;
        }
        return false;
    }
}