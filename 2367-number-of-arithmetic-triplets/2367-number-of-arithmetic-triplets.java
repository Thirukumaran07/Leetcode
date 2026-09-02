class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        HashMap<Integer, Integer> list = new HashMap<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            list.put(nums[i], i);
        }
        for (int num : nums) {
            if (list.containsKey(num + diff) && list.containsKey(num + 2 * diff)) {
                count++;
            }
        }
        return count;
    }
}