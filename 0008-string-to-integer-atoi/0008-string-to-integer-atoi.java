class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        long sum = 0;
        int z = 1, i=0;
        if(s.length()==0){
            return 0;
        }
        if(s.charAt(i)=='-'){
            z = -1;
            i++;
        }
        else if(s.charAt(i)=='+'){
            i++;
        }
        while(i<s.length()){
            char c = s.charAt(i);
            if(!Character.isDigit(c)){
                break;
            }
            sum = sum*10 + c-'0';
            if(sum*z>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(sum*z<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int) sum*z;
    }
}