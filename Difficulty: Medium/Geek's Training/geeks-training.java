class Solution {
    public int f(int day, int last, int dp[][], int mat[][]){
        if(day==0){
            int max=0;
            for(int i=0; i<3; i++){
                if(i!=last){
                    max=Math.max(max, mat[0][i]);
                }
            }
            return dp[day][last]=max;
        }
        if(dp[day][last]!=-1){
            return dp[day][last];
        }
        int max=0;
        for(int i=0; i<3; i++){
            if(i!=last){
                int activity=mat[day][i]+f(day-1, i, dp, mat);
                max=Math.max(max,activity);
            }
        }
        return dp[day][last]=max;
    }
    public int maximumPoints(int mat[][]) {
        // code here
        int dp[][]=new int[mat.length][4];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        int ans=f(mat.length-1, 3, dp, mat);
        return ans;
    }
}