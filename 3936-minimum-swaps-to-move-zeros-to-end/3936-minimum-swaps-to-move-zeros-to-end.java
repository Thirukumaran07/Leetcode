class Solution {
    public int minimumSwaps(int[] nums) {
        int moves = 0;
        int index = nums.length-1;
        for(int i=0;i<nums.length;i++){
            while(i<index && nums[index]==0){
                index--;
            }
            if(i<index && nums[i]==0){
                System.out.println(nums[index]);
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index--;
                moves++;
            }
        }
        return moves;
    }
}