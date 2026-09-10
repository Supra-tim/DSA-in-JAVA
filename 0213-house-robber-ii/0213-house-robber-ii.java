class Solution {
    public int f(int dp[], int nums[], int indx, int strt){
        if(indx<strt){
            return 0;
        }
        if(indx==strt){
            return nums[strt];
        }
        if(dp[indx]!=-1){
            return dp[indx];
        }
        int pick=nums[indx]+f(dp, nums, indx-2, strt);
        int not=0+f(dp, nums, indx-1, strt);
        return dp[indx]=Math.max(pick, not);
    }
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int dp1[]=new int[nums.length+1];
        int dp2[]=new int[nums.length+1];
        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);
        int case1=f(dp1, nums, nums.length-2, 0);
        int case2=f(dp2, nums, nums.length-1, 1);
        return Math.max(case1, case2);
    }
}