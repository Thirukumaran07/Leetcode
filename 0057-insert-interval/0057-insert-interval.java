class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> merged = new ArrayList<>(Arrays.asList(intervals));
        merged.add(newInterval);
        Collections.sort(merged, (a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> res = new ArrayList<>();
        int prev[] = merged.get(0);
        for(int i=1;i<merged.size();i++){
            int intr[] = merged.get(i);
            if(prev[1]>=intr[0]){
                prev[1] = Math.max(prev[1],intr[1]);
            }
            else{
                res.add(prev);
                prev = intr;
            }
        }
        res.add(prev);
        return res.toArray(new int[res.size()][]);
    }
}