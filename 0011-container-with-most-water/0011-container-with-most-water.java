class Solution {
    public int maxArea(int[] height) {
        int vol = 0;
        int l = 0;
        int r = height.length-1;
        int n = height.length;
        int val = 0;
        while(l<n){
            vol = Math.max(vol, (r-l) * Math.min(height[l],height[r]));
            if(height[l]<=height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return vol;
    }
}