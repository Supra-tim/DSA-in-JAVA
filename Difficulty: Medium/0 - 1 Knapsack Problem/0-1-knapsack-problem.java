class Solution {
    public int f(int indx, int W, int val[], int wt[], int dp[][]){
        if(indx==0){
            if(wt[0]<=W){
                return val[0];
            }
            else{
                return 0;
            }
        }
        if(dp[indx][W]!=-1){
            return dp[indx][W];
        }
        int not_take=0+f(indx-1, W, val, wt, dp);
        int take=Integer.MIN_VALUE;
        if(wt[indx]<=W){
            take=val[indx]+f(indx-1, W-wt[indx], val, wt, dp);
        }
        return dp[indx][W]=Math.max(take, not_take);
    }
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int n=val.length;
        int dp[][]=new int [n][W+1];
        for(int row[]: dp){
            Arrays.fill(row, -1);
        }
        int ans=f(n-1, W, val, wt, dp);
        return ans;
    }
}
