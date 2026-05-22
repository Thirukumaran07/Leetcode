class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n!=1 && !set.contains(n)){
            set.add(n);
            int s = 0;
            while(n>0){
                int num = n%10;
                s += num*num;
                n/=10;
            }
            n=s;
        }
        return n==1;
    }
}