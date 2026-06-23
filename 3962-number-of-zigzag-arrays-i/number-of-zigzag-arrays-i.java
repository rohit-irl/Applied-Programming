class Solution {
    public int zigZagArrays(int n, int l, int r) {

        long MOD = 1000000007;
        int m = r - l + 1;
        long[][] dp = new long[m][2];

        for(int i = 0; i < m; i++){
            dp[i][0] = 1;
            dp[i][1] = 1;
        }

        for(int len = 2; len <= n; len++){
            long[][] next = new long[m][2];
            long[] prefix = new long[m];
            prefix[0] = dp[0][1];

            for(int i = 1; i < m; i++){
                prefix[i] = (prefix[i-1] + dp[i][1]) % MOD;
            }

            long[] suffix = new long[m];
            suffix[m-1] = dp[m-1][0];

            for(int i = m-2; i >= 0; i--){
                suffix[i] = (suffix[i+1] + dp[i][0]) % MOD;
            }

            for(int cur = 0; cur < m; cur++){
                if(cur > 0){
                    next[cur][0] = prefix[cur-1];
                }
                if(cur < m-1){
                    next[cur][1] = suffix[cur+1];
                }
            }
            dp = next;
        }
        long ans = 0;

        for(int i = 0; i < m; i++){
            ans += dp[i][0];
            ans += dp[i][1];
            ans %= MOD;
        }
        return (int)ans;
    }
}