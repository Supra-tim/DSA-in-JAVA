class Solution {
    // public int solve(int arr[], int target, int i, int j, int dp[][]){
    //     if(target==0){
    //         return 0;
    //     }
    //     if(i>j || target<0){
    //         return (int)1e9;
    //     }
    //     if(dp[i][j]!=-1){
    //         return dp[i][j];
    //     }
    //     int left=solve(arr, target-arr[i], i+1, j, dp);
    //     int right=solve(arr, target-arr[j], i, j-1, dp);
    //     return dp[i][j]=1+Math.min(left, right);
    // }
    public int minOperations(int[] nums, int x) {
        // int n=nums.length;
        // int dp[][]=new int[n][n];
        // for(int row[]: dp){
        //     Arrays.fill(row, -1);
        // }
        // int ans=solve(nums, x, 0, n-1, dp);
        // if(ans>=(int)1e9){
        //     return -1;
        // }
        // return ans;
         int n = nums.length;
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        int target = total - x;
        if (target == 0) {
            return n;
        }
        if (target < 0) {
            return -1;
        }
        int left = 0;
        int sum = 0;
        int maxLen = -1;
        for (int right = 0; right < n; right++) {
            sum += nums[right];
            while (sum > target && left <= right) {
                sum -= nums[left];
                left++;
            }
            if (sum == target) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        if (maxLen == -1) {
            return -1;
        }
        return n - maxLen;
    }
}