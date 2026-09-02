class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        char[] st = new char[n];
        int top=0;
        for(int i=0;i<n;i++){
            char dig = num.charAt(i);
            while(top>0 && k>0 && st[top-1]>dig){
                top--;
                k--;
            }
            st[top] = dig;
            top++;
        }
        top = top-k;
        int start = 0;
        while(start<top && st[start]=='0'){
            start++;
        }
        if(start==top){
            return "0";
        }
        return new String(st,start,top-start);
    }
}