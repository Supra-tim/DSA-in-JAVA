class Solution {
    public int maxChildren(int[] greed, int[] cookie) {
        // code here
        int n=greed.length;
        int m=cookie.length;
        Arrays.sort(greed);
        Arrays.sort(cookie);
        int l=0, r=0;
        while(l<m &&r<n){
            if(greed[r]<=cookie[l]){
                r=r+1;
            }
            l=l+1;
        }
        return r;
    }
}
