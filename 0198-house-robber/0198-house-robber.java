class Solution {
    public int f(int dp[], int nums[], int indx){
        if(indx==0){
            return nums[indx];
        }
        if(indx<0){
            return 0;
        }
        if(dp[indx]!=-1){
            return dp[indx];
        }
        int pick=nums[indx]+f(dp, nums, indx-2);
        int not=0+f(dp, nums, indx-1);
        return dp[indx]=Math.max(pick, not);
    }
    public int rob(int[] nums) {
        int dp[]=new int[nums.length+1];
        Arrays.fill(dp,-1);
        int ans=f(dp, nums, nums.length-1);
        return ans;
    }
}