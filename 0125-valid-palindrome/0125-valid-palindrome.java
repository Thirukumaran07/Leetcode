class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String c = s.replaceAll("[^A-Za-z0-9]","");
        StringBuilder st = new StringBuilder(c);
        String t = st.reverse().toString();
        if(c.equals(t)){
            return true;
        }
        return false;
    }
}