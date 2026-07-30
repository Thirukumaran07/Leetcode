class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
        int smx = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                smx = max;
                max = nums[i];
            }
            else if(nums[i]>smx){
                smx = nums[i];
            }
        }
        return (max-1) * (smx-1);
    }
}