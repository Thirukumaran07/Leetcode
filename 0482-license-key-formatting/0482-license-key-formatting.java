class Solution {
    public String licenseKeyFormatting(String s, int k) {

        s = s.replaceAll("-", "").toUpperCase();
        if (s.length() == 0)
            return "";
        String res = " ";
        for(int i=s.length()-1;i>=0;i--){
            char c = s.charAt(i);
            if(res.length()%(k+1)==0){
                res += "-";
            }
            res += c+"";
        }
        StringBuilder str = new StringBuilder(res);
        System.out.println(str.reverse());
        return str.toString().replace(" ","");
    }
}