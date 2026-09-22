class Solution {
    public void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]>=1 && nums[i]<nums.length && nums[i]!=nums[nums[i]-1]){
                swap(nums,i,nums[i]-1);
            }
            else{
                i++;
            }
        }
        for(int l=0;l<nums.length;l++){
            if(nums[l]!=l+1){
                return nums[l];
            }
        }
        return -1;
    }
}