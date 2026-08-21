class Solution {
    public int maxSum(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        for(int n:nums){
            if(n>0)
            set.add(n);
        }
        if(set.size()==0){
            int max = nums[0];
            for(int n:nums){
                max = Math.max(n,max);
            }
            return max;
        }
        int sum=0; 
        for(int n : set){
            sum = sum + n;
        }
        return sum;
    }
}