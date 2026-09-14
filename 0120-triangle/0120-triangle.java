class Solution {
    public int f(int i, int j,  List<List<Integer>> triangle, int dp[][]){
        int N=triangle.size();
        if(i==N-1){
            return triangle.get(i).get(j);
        }
        if(dp[i][j]!=Integer.MAX_VALUE){
            return dp[i][j];
        }
        int d=triangle.get(i).get(j)+f(i+1, j, triangle, dp);
        int dg=triangle.get(i).get(j)+f(i+1, j+1, triangle, dp);
        return dp[i][j]=Math.min(d,dg);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int dp[][]=new int[n][n];
        for(int row[]:dp){
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        int ans=f(0, 0, triangle, dp);
        return ans;
    }
}