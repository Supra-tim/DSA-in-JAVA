class Solution {
    int dp[][];
    public int solve(int piles[], int i, int j){
        if(i>j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int take_i=piles[i]+ Math.min(solve(piles, i+2,j), solve(piles, i+1, j-1));
        int take_j=piles[j]+Math.min(solve(piles, i, j-2), solve(piles, i+1, j-1));
        return dp[i][j]=Math.max(take_i, take_j);
    }
    public boolean stoneGame(int[] piles) {
        int n=piles.length;
        int sum=0;
        dp=new int[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i],-1);
        }
        for(int i=0; i<n; i++){
            sum=sum+piles[i];
        }
        int Alice=solve(piles, 0, n-1);
        int Bob=sum-Alice;
        if(Alice>Bob){
            return true;
        }
        else{
            return false;
        }
    }
}
