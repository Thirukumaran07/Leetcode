class Solution {
    public void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]!=nums[nums[i]-1]){
                swap(nums,i,nums[i]-1);
            }
            else{
                i++;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int l=0;l<nums.length;l++){
            if(nums[l]!=l+1){
                list.add(nums[l]);
            }
        }
        return list;   
    }
}