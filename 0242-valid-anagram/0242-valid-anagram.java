class Solution {
    public boolean isAnagram(String s, String t) {
        char a[] = s.toCharArray();
        char b[] = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        s = String.valueOf(a);
        t = String.valueOf(b);
        if(s.equals(t)){
            return true;
        }
        return false;
    }
}