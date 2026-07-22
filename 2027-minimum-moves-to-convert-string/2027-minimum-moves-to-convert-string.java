class Solution {
    public int minimumMoves(String s) {
        int n = s.length();
        int moves = 0;
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(c == 'X'){
                i = i+2;
                moves++;
            }
        }
        return moves;
    }
}