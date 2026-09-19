class Solution {
    public void sortColors(int[] nums) {
        int y=0;
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length-i;j++){
                if(nums[j-1]>nums[j]){
                    y = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = y;
                }
            }
        }
        return;
    }
}