class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int right = 0;
        int i = 0;
        while(right<s.length()){
            char c = s.charAt(right);
            String st = s.substring(i,right);
            if(st.contains(String.valueOf(c))){
                i++;
            }
            else{
            right++;
            max = Math.max(max , right-i);
            }
        }
        return max;
    }
}