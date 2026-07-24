class Solution {
    public String decodeString(String s) {
        if (s==null || s.length()==0){
            return s;
        }
        int cur = 0;
        Stack <Integer> in = new Stack<>();
        Stack <String> str = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c >= '0' && c <= '9'){
                cur = (cur*10) + c-'0';
            }
            else{
                if(c=='['){
                    in.push(cur);
                    cur=0;
                    str.push(String.valueOf(c));
                }
                else if(c==']'){
                    String st = "";
                    while(!str.isEmpty() && !str.peek().equals("[")){
                        st = str.pop()+st;
                    }
                    str.pop();
                    int num = in.pop();
                    String res = "";
                    for(int j=0;j<num;j++){
                        res+=st;
                    }
                    str.push(res);
                }
                else{
                    str.push(String.valueOf(c));
                }
            }
        }
        String ans = "";
        while(!str.isEmpty()){
            ans=str.pop()+ans;
        }
        return ans;
    }
}