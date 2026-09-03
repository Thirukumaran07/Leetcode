class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=Integer.MAX_VALUE;
        for(int i:nums1){
            if(i%2==1){
                n = Math.min(n, i);
            }
        }
        if(n == Integer.MAX_VALUE){
            return true;
        }
        for(int i:nums1){
            if(i % 2 == 0 && i <= n){
                return false;
            }
        }
        return true;
    }
}