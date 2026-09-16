class Solution {
    long M=1000000007;
    public long f(int n, int k, int i, long dp[][]){
        if(k==0){
            return 1;
        }
        if(i>=n){
            return 0;
        }
        if(dp[k][i]!=-1){
            return dp[k][i];
        }
        long take=0;
        for(int j=i+1; j<n; j++){
            take+=f(n, k-1, j, dp)%M;
        }
        long skip=f(n, k, i+1, dp)%M;
        return dp[k][i]=(take+skip)%M;
    }
    public int numberOfSets(int n, int k) {
        if(n-k==1){
            return 1;
        }
        long dp[][]=new long[k+1][n];
        for(int i=0; i<=k; i++){
            Arrays.fill(dp[i], -1);
        }
        long ans=f(n, k, 0, dp)%M;
        return (int)ans;
    }
}