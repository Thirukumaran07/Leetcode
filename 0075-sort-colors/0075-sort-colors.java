class Solution {
    public void sortColors(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int flag=0;
            for(int j=1;j<nums.length-i;j++){
                if(nums[j-1]>nums[j]){
                    int y = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = y;
                    flag = 1;
                }
            }
            if(flag == 0){
                break;
            }
        }
        return;
    }
}