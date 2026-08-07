class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder res = new StringBuilder();
        int count = 0;
        for(int i=s.length()-1;i>=0;i--){
            char c = s.charAt(i);
            if(c == '-'){
                continue;
            }
            if(count == k){
                res.append("-");
                count = 0;
            }
            res.append(Character.toUpperCase(c));
            count++;
        }
        return res.reverse().toString();
    }
}