class Solution {
    public int minSumOfLengths(int[] arr, int target) {
       int n = arr.length;

        int[] best = new int[n];

        Arrays.fill(best, Integer.MAX_VALUE);

        int left = 0;
        int sum = 0;

        int ans = Integer.MAX_VALUE;

        for(int right = 0; right < n; right++) {

            sum += arr[right];

            while(sum > target) {
                sum -= arr[left];
                left++;
            }

            if(sum == target) {

                int len = right - left + 1;

                // Previous non-overlapping subarray
                if(left > 0 && best[left - 1] != Integer.MAX_VALUE) {
                    ans = Math.min(ans, len + best[left - 1]);
                }

                // Best subarray ending at or before right
                if(right == 0) {
                    best[right] = len;
                }
                else {
                    best[right] = Math.min(best[right - 1], len);
                }
            }
            else {

                // No subarray ending at right
                if(right == 0) {
                    best[right] = Integer.MAX_VALUE;
                }
                else {
                    best[right] = best[right - 1];
                }
            }
        }

        if(ans == Integer.MAX_VALUE) {
            return -1;
        }
        else {
            return ans;
        }
    }
}