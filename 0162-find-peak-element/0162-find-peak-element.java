class Solution {
    public int findPeakElement(int[] nums) {
        int max = nums[0];
        int idx = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
                idx = i;
            }
        }
        return idx;
    }
}