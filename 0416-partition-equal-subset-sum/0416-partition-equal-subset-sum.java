class Solution {
    public boolean f(int indx, int target, int nums[], Boolean dp[][]){
        if(target==0){
            return true;
        }
        if(indx==0){
            if(nums[indx]==target){
                return true;
            }
            else{
                return false;
            }
        }
        if(dp[indx][target]!=null){
            return dp[indx][target];
        }
        boolean not_take=f(indx-1, target, nums, dp);
        boolean take=false;
        if(target>=nums[indx]){
            take=f(indx-1, target-nums[indx], nums, dp);
        }
        return dp[indx][target]= take || not_take;
    }
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0; i<n; i++){
            sum=sum+nums[i];
        }
        if(sum%2!=0){
            return false;
        }
        int target=sum/2;
        Boolean dp[][]=new Boolean[n][target+1];
        boolean ans=f(n-1, target, nums, dp);
        return ans;
    }
}