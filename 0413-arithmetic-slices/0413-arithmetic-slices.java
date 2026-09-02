class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int pre = 0;
        int slice = 0;
        for(int i=2;i<nums.length;i++){
            slice += (nums[i]-nums[i-1] == nums[i-1]-nums[i-2]) ? ++pre : (pre=0);
        }
        return slice;
    }
}