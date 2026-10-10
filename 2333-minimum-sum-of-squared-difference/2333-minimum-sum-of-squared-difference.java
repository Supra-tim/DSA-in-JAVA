class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        int max = 0;
        int[] diff = new int[n];
        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            max = Math.max(max, diff[i]);
        }
        long k = (long) k1 + k2;
        int[] freq = new int[max + 1];
        for (int d : diff) {
            freq[d]++;
        }
        for (int d = max; d > 0 && k > 0; d--) {
            if (freq[d] == 0) {
                continue;
            }
            long canReduce = Math.min(k, (long) freq[d]);
            freq[d] -= canReduce;
            freq[d - 1] += canReduce;
            k -= canReduce;
        }
        long ans = 0;
        for (int d = 1; d <= max; d++) {
            ans += (long) freq[d] * d * d;
        }
        return ans;
    }
}