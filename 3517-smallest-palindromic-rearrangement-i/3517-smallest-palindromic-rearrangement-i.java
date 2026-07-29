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
        String r = "";
        char n = '0';
        for(int i=0;i<freq.length;i++){
            if(freq[i]%2==1){
                n = (char)(i+97);
                freq[i]--;
            }
            char z = (char)(i+97);
            String u = "";
            u+=z;
            int v = freq[i]/2;
            u = u.repeat(v);
            t += u;
            r = u+r;
            // while(v>0){
            //     char x = (char)(i+97);
            //     t += String.valueOf(x);
            //     u = x+u;
            //     v--;
            // }
        }
        if(n!='0'){
            t+=String.valueOf(n);
        }
        return t+r;
    }
}