class Solution {
    public int reverseDegree(String s) {
        int n=s.length();
        int res=0;
        for(int i=0; i<n; i++){
            int re=26-(s.charAt(i)-'a');
            res+=(i+1)*re;
        }
        return res;
    }
}