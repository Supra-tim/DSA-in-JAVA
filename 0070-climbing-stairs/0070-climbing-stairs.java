class Solution {
    public int f(int dp[], int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=f(dp, n-1)+f(dp, n-2);
        return dp[n];
    }
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        int ans=f(dp,n);
        return ans;
    }
}