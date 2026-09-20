class Solution {
    int mod=(int)1e9+7;
    public int f(int indx, int target, int arr[], int dp[][]){
        if(indx==arr.length-1){
        if(target==0 && arr[indx]==0){
            return 2;
        }
        if(target==0 || arr[indx]==target){
            return 1;
        }
        return 0;
    }
    if(dp[indx][target]!=-1){
        return dp[indx][target];
    }
    int not_take=f(indx+1, target, arr, dp);
    int take=0;
    if(target>=arr[indx]){
        take=f(indx+1, target-arr[indx], arr, dp);
    }
    return dp[indx][target]=(int)(((long)not_take+take)%mod);
    }
    public int countPartitions(int[] arr, int diff) {
        // code here
        int n=arr.length;
        int sum=0;
        for(int i=0; i<n; i++){
            sum=sum+arr[i];
        }
        int dp[][]=new int[n][sum+1];
        for(int row[]: dp){
            Arrays.fill(row, -1);
        }
        if(sum<diff){
            return 0;
        }
        int ans=0;
        if((sum-diff)>=0 && (sum-diff)%2==0){
            ans=f(0, (sum-diff)/2, arr, dp);
            return ans;
        }
        return ans;
    }
}
