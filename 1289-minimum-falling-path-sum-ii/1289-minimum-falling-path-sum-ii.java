class Solution {
    public int f(int i, int j, int grid[][], int dp[][]){
        int n=grid.length;
        int m=grid[0].length;
        if(j<0 || j>=m){
            return 100000;
        }
        if(i==0){
            return grid[i][j];
        }
        // if(n==1 && m==1){
        //     return grid[n][m];
        // }
        if(dp[i][j]!=Integer.MAX_VALUE){
            return dp[i][j];
        }
        int ans=Integer.MAX_VALUE;
        for(int k=0; k<m; k++){
            if(k!=j){
             ans=Math.min(ans, grid[i][j]+f(i-1,k,grid, dp));
            }
        }
        return dp[i][j]=ans;
    }
    public int minFallingPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int dp[][]=new int[n][m];
        for(int row[]:dp){
            Arrays.fill(row,Integer.MAX_VALUE);
        }
        int ans=Integer.MAX_VALUE;
        for(int j=0; j<m; j++){
        ans=Math.min(ans, f(n-1,j, grid, dp));
        }
        return ans;
    }
}