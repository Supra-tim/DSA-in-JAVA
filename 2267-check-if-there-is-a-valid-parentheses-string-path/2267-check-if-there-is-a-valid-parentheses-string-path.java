class Solution {
    public boolean f(int i, int j, int cnt, char[][]grid, Boolean dp[][][]){
        if(grid[i][j]=='('){
            cnt++;
        }
        else{
            cnt--;
        }
        if(cnt<0){
            return false;
        }
        if(i==grid.length-1 && j==grid[0].length-1){
            return cnt==0;
        }
        if(dp[i][j][cnt]!=null){
            return dp[i][j][cnt];
        }
        if(i+1<grid.length){
            if(f(i+1,j, cnt, grid, dp)){
                return dp[i][j][cnt]=true;
            }
        }
        if(j+1<grid[0].length){
            if(f(i, j+1, cnt, grid, dp)){
                return dp[i][j][cnt]=true;
            }
        }
        return dp[i][j][cnt]=false;
    }
    public boolean hasValidPath(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Boolean dp[][][]=new Boolean[n][m][n+m];
        if((n+m-1)%2!=0){
            return false;
        }
        if(grid[0][0]==')'|| grid[n-1][m-1]=='('){
            return false;
        }
        return f(0,0, 0, grid, dp);
    }
}