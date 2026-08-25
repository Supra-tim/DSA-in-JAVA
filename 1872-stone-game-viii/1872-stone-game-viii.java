class Solution {
    public int stoneGameVIII(int[] stones) {
        int n=stones.length;
        int prefix[]=new int[n];
        prefix[0]=stones[0];
        for(int i=1; i<n; i++){
            prefix[i]=prefix[i-1]+stones[i];
        }
        int t[]=new int[n];
        t[n-1]=prefix[n-1];
        for(int i=n-2; i>=1; i--){
            int take=prefix[i]-t[i+1];
            int skip= t[i+1];
            t[i]=Math.max(take,skip);
        }
        int ans=t[1];
        return ans;
    }
}
