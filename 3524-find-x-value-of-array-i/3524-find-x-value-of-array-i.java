class Solution {
        int[] nums;
    int k;

    long[][][] dp;
    boolean[][] vis;

    private long[] solve(int i, int rem) {
        if (i == nums.length) {
            return new long[k];
        }
        if (vis[i][rem]) {
            return dp[i][rem];
        }
        vis[i][rem] = true;
        long[] res = new long[k];
        int newRem = (int)((long) rem * (nums[i] % k) % k);
        res[newRem]++;
        long[] next = solve(i + 1, newRem);
        for (int r = 0; r < k; r++) {
            res[r] += next[r];
        }
        return dp[i][rem] = res;
    }
    public long[] resultArray(int[] nums, int k) {
        this.nums = nums;
        this.k = k;
        int n = nums.length;
        dp = new long[n][k][k];
        vis = new boolean[n][k];
        long[] ans = new long[k];
        for (int i = 0; i < n; i++) {
            long[] temp = solve(i, 1 % k);
            for (int r = 0; r < k; r++) {
                ans[r] += temp[r];
            }
        }
        return ans;
    }
}