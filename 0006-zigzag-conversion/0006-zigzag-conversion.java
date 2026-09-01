class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || numRows>=s.length()){
            return s;
        }
        StringBuilder st = new StringBuilder();
        int n = (numRows-1)*2;
        for(int i = 0;i<numRows;i++){
            for(int j=i;j<s.length();j+=n){
                st.append(s.charAt(j));
                int k = j + n - 2 * i;
                boolean b = i > 0 && i <numRows-1;
                if(b && k < s.length()){
                    st.append(s.charAt(k));
                }
            }
        }
        return st.toString();
    }
}