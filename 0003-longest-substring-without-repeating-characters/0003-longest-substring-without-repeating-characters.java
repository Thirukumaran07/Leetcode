class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int l = 0;
        HashSet<Character> c = new HashSet<>();
        for(int i=0;i<s.length();i++){
            while(c.contains(s.charAt(i))){
                c.remove(s.charAt(l));
                l++;
            }
            c.add(s.charAt(i));
            max = Math.max(max,c.size());
        }
        return max;
    }
}