class Solution {
    public static boolean f(int indx, int target, int arr[], Boolean dp[][]){
        if(target==0){
            return true;
        }
        if(indx==0){
            if(arr[indx]==target){
                return true;
            }
            else{
                return false;
            }
        }
        if(dp[indx][target]!=null){
            return dp[indx][target];
        }
        boolean not_take=f(indx-1, target, arr, dp);
        boolean take=false;
        if(target>=arr[indx]){
            take=f(indx-1, target-arr[indx], arr, dp);
        }
        return dp[indx][target]=not_take || take;
    }
    static boolean isSubsetSum(int arr[], int sum) {
        // code here
        int n=arr.length;
        Boolean dp[][]=new Boolean[n][sum+1];
        boolean ans=f(n-1, sum, arr, dp);
        return ans;
    }
}