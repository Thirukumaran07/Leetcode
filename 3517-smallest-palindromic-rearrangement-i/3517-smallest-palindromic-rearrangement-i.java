class Solution {
    public String smallestPalindrome(String s) {
        if(s.length()==1){
            return s;
        }
        int freq[] = new int [26];
        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }
        String t = "";
        char n = '0';
        for(int i=0;i<freq.length;i++){
            if(freq[i]%2==1){
                n = (char)(i+97);
                freq[i]--;
            }
            int v = freq[i]/2;
            while(v>0){
                char x = (char)(i+97);
                t += String.valueOf(x);
                v--;
            }
        }
        StringBuilder u = new StringBuilder(t);
        u = u.reverse();
        if(n!='0'){
            t+=String.valueOf(n);
        }
        return t+u.toString();
    }
}