class Solution {
    // HashSet<String>set=new HashSet<>();
    // StringBuilder curr=new StringBuilder();
    // public void f(int i, String s){
    //     if(i==s.length()){
    //        if(curr.length()>0){
    //         set.add(curr.toString());
    //        }
    //         return;
    //     }
    //     //take
    //     curr.append(s.charAt(i));
    //     f(i+1, s);
    //     curr.deleteCharAt(curr.length()-1);
    //     //dont take
    //     f(i+1, s);
    // }
    public int distinctSubseqII(String s) {
        // f(0,s);
        // return set.size();

            int MOD = 1000000007;
        int n = s.length();

        long[] dp = new long[n + 1];

        dp[0] = 1;

        int[] last = new int[26];
        for (int i = 1; i <= n; i++) {

            char ch = s.charAt(i - 1);
            int idx = ch - 'a';

            dp[i] = (2 * dp[i - 1]) % MOD;

            if (last[idx] != 0) {
                dp[i] = (dp[i] - last[idx] + MOD) % MOD;
            }

            last[idx] = (int) dp[i - 1];
        }

        return (int) ((dp[n] - 1 + MOD) % MOD);
    }
}