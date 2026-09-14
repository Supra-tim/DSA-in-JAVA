class Solution {
    public int f(int i, int j, int matrix[][], int dp[][]){
        int m=matrix[0].length;
        if(j<0 || j>=m){
            return 1000000;
        }
        if(i==0){
            return matrix[i][j];
        }
        if(dp[i][j]!=Integer.MAX_VALUE){
            return dp[i][j];
        }
        int up=matrix[i][j]+f(i-1,j, matrix, dp);
        int rdg=matrix[i][j]+f(i-1, j+1, matrix, dp);
        int ldg=matrix[i][j]+f(i-1, j-1, matrix, dp);
        return dp[i][j]=Math.min(up, Math.min(rdg, ldg));
    }
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int dp[][]=new int[n][n];
        for(int row[]:dp){
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        int ans=Integer.MAX_VALUE;
        for(int j=0; j<m; j++){
            ans=Math.min(ans,f(n-1, j, matrix, dp));
        }
        return ans;
    }
}