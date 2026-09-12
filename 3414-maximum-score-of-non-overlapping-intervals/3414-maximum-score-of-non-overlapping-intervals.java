class Solution {
    static class State {
        long score;
        List<Integer> indices;

        State(long score, List<Integer> indices) {
            this.score = score;
            this.indices = indices;
        }
    }

    int n;
    int[] next;
    State[][] dp;
    public int[] maximumWeight(List<List<Integer>> intervals) {
         n = intervals.size();

        // arr[i] = {start, end, weight, originalIndex}
        int[][] arr = new int[n][4];

        for (int i = 0; i < n; i++) {
            arr[i][0] = intervals.get(i).get(0); // start
            arr[i][1] = intervals.get(i).get(1); // end
            arr[i][2] = intervals.get(i).get(2); // weight
            arr[i][3] = i;                       // original index
        }

        Arrays.sort(arr, (a, b) -> {
            if (a[0] != b[0])
                return Integer.compare(a[0], b[0]);

            if (a[1] != b[1])
                return Integer.compare(a[1], b[1]);

            return Integer.compare(a[2], b[2]);
        });
        next = new int[n];

        for (int i = 0; i < n; i++) {
            next[i] = findNext(arr, arr[i][1]);
        }

        dp = new State[n + 1][5];

        State result = solve(arr, 0, 4);

        int[] answer = new int[result.indices.size()];

        for (int i = 0; i < result.indices.size(); i++) {
            answer[i] = result.indices.get(i);
        }

        return answer;
    }

    State solve(int[][] arr, int i, int k) {

        if (i >= n || k == 0) {
            return new State(0, new ArrayList<>());
        }
        if (dp[i][k] != null) {
            return dp[i][k];
        }
        State skip = solve(arr, i + 1, k);

        State nextState = solve(arr, next[i], k - 1);

        long takeScore = arr[i][2] + nextState.score;

        List<Integer> takeIndices =
                new ArrayList<>(nextState.indices);

        takeIndices.add(arr[i][3]);
        Collections.sort(takeIndices);

        State take = new State(takeScore, takeIndices);
        State best;

        if (take.score > skip.score) {
            best = take;
        }
        else if (take.score < skip.score) {
            best = skip;
        }
        else {
            if (compare(take.indices, skip.indices) < 0) {
                best = take;
            }
            else {
                best = skip;
            }
        }

        dp[i][k] = best;

        return best;
    }

    int findNext(int[][] arr, int end) {

        int low = 0;
        int high = n - 1;

        int ans = n;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid][0] > end) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return ans;
    }
    int compare(List<Integer> a, List<Integer> b) {

        int size = Math.min(a.size(), b.size());

        for (int i = 0; i < size; i++) {

            if (!a.get(i).equals(b.get(i))) {
                return Integer.compare(a.get(i), b.get(i));
            }
        }
        return Integer.compare(a.size(), b.size());
    }
}