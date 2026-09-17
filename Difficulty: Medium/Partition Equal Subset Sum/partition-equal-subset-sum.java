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
        return dp[indx][target]= take || not_take;
    }
    static boolean equalPartition(int arr[]) {
        // code here
        int n=arr.length;
        int sum=0;
        for(int i=0; i<n; i++){
            sum=sum+arr[i];
        }
        if(sum%2!=0){
            return false;
        }
        int target=sum/2;
        Boolean dp[][]=new Boolean[n][target+1];
        boolean ans=f(n-1, target, arr, dp);
        return ans;
    }
}