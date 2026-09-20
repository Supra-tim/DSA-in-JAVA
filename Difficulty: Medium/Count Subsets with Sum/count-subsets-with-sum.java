class Solution {
    public static int f(int indx, int target, int arr[], int dp[][]){
        if(indx==arr.length-1){
            if(target==0 && arr[indx]==0){
                return 2;
            }
            if(target==0|| arr[indx]==target){
                return 1;
            }
            return 0;
        }
        if(dp[indx][target]!=-1){
            return dp[indx][target];
        }
        int not_take=f(indx+1, target, arr, dp);
        
        int take=0;
        if(arr[indx]<=target){
            take= f(indx+1, target-arr[indx], arr, dp);
        }
        return dp[indx][target]=take+not_take;
    }
    static int perfectSum(int[] arr, int target) {
        // code here
        int n=arr.length;
        int dp[][]=new int[n][target+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        int ans=f(0, target, arr, dp);
        return ans;
    }
}