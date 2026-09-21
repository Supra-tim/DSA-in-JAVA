class Solution {
    public int f(int indx, int t, int coins[], int dp[][]){
        if(indx==0){
            if(t%coins[indx]==0){
                return t/coins[indx];
            }
            else{
                return (int)1e9;
            }
        }
        if(dp[indx][t]!=-1){
            return dp[indx][t];
        }
        int not_take=0+f(indx-1, t, coins, dp);
        int take=Integer.MAX_VALUE;
        if(coins[indx]<=t){
            take=1+f(indx, t-coins[indx], coins, dp);
        }
        return dp[indx][t]=Math.min(take, not_take);
    }
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int dp[][]=new int[n][amount+1];
        for(int row[]: dp){
            Arrays.fill(row, -1);
        }
        int ans=f(n-1, amount, coins, dp);
        if(ans==(int)1e9){
            return -1;
        }
        return ans;
    }
}