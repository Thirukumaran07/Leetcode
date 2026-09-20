class Solution {
    public void sortColors(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            max = Math.max(max,num);
        }
        int count[] = new int[max+1];
        for(int num : nums){
            count[num]++;
        }
        int index = 0;
        for(int i=0;i<max+1;i++){
            while(count[i]>0){
                nums[index]=i;
                index++;
                count[i]--;
            }
        }
        return;
    }
}