class Solution {
    public String reverseWords(String s) {
        String list[] = s.split(" ");
        StringBuilder x = new StringBuilder();
        for(int i = 0;i<list.length;i++){
            StringBuilder st = new StringBuilder(list[i]);
            x.append(st.reverse());
            if(i!=list.length-1){
                x.append(" ");
            }
        }
        return x.toString();
    }
}