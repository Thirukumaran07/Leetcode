class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
        // int n = 0;
        // int i=1;
        // while(i<nums.length){
        //     if(n!=i){
        //         max = Math.max(max, (nums[i]-1)*(nums[n]-1));
        //         n++;
        //     }
        //     i++;
        // }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++)
            max = Math.max(max,(nums[i]-1)*(nums[j]-1));
        }
        return max;
    }
}