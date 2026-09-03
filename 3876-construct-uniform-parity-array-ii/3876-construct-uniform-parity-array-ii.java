class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=Integer.MAX_VALUE;
        boolean alleven = true;
        for(int i:nums1){
            n = Math.min(n, i);
            if(i%2==1){
                alleven = false;
            }
        }
        return alleven || n%2==1;
    }
}