class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int neww[] = new int[n+m];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                neww[k++] = nums1[i++];
            }
            else {
                neww[k++] = nums2[j++];
            }
        }
        while(i<m){
            neww[k++] = nums1[i++];
        }
        while(j<n){
            neww[k++] = nums2[j++];
        }
        for(int a = 0;a<m+n;a++){
            nums1[a] = neww[a];
        }
        return;
    }
}