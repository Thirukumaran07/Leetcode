class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int ar[] = new int[n];
        int idx = 0;
        for(int i=0;i<nums1.length;i++){
            ar[idx++] = nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            ar[idx++] = nums2[i];
        }
        Arrays.sort(ar);
        if(ar.length%2==0){
            return (double)(ar[n/2]+ar[(n/2)-1])/2;
        }
        return ar[n/2];
    }
}