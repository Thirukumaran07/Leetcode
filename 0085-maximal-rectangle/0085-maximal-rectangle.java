class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix==null || matrix.length==0||matrix[0].length==0){
            return 0;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int[] heights = new int [col+1];
        int max = 0;
        for(char[] ro:matrix){
            for(int i=0;i<col;i++){
                heights[i] = (ro[i]=='1')?heights[i]+1:0;
            }
            int n = heights.length;
            for(int i=0;i<n;i++){
                for(int j=i,minh = Integer.MAX_VALUE;j<n;j++){
                    minh = Math.min(minh,heights[j]);
                    int area = minh * (j-i+1);
                    max = Math.max(max,area);
                }
            }
        }
        return max;
    }
}