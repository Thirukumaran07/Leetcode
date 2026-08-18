class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        int res = 0;
        for(int n: set){
            if(!set.contains(n-1)){
                int cur = 0;
                int len = 0;
                while(set.contains(cur+1)){
                    cur++;
                    len++;
                }
                return cur+1;
            }
        }
        return 0;
    }
}