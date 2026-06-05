import java.util.*;

class Solution {
    public long totalWaviness(long num1, long num2) {
        return count(num2) - count(num1 - 1);
    }

    private String s;
    private HashMap<String, Long> memo;

    private long count(long n) {
        if (n <= 0) return 0;
        s = String.valueOf(n);
        memo = new HashMap<>();
        return dp(0, 0, 0, false, 0);
    }

    private long dp(int idx, int x, int y, boolean smaller, int digitNum) {
        if (idx >= s.length()) {
            return 0;
        }

        String key = idx + "#" + x + "#" + y + "#" + smaller + "#" + digitNum;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        long ans = 0;

        if (smaller) {
            for (int z = 0; z <= 9; z++) {

                if (z == 0 && digitNum == 0) {
                    ans += dp(idx + 1, y, z, true, 0);
                }
                else if (digitNum >= 2 && x > y && z > y) {
                    ans += pow10(s.length() - 1 - idx)
                         + dp(idx + 1, y, z, true, digitNum + 1);
                }
                else if (digitNum >= 2 && x < y && z < y) {
                    ans += pow10(s.length() - 1 - idx)
                         + dp(idx + 1, y, z, true, digitNum + 1);
                }
                else {
                    ans += dp(idx + 1, y, z, true, digitNum + 1);
                }
            }
        } else {
            int upper = s.charAt(idx) - '0';

            for (int z = 0; z <= upper; z++) {
                if (z == 0 && digitNum == 0) {
                    ans += dp(idx + 1, y, z, z < upper, 0);
                }
                else if (digitNum >= 2 && x > y && z > y) {
                    if (z == upper) {
                        long remain = (idx + 1 < s.length())
                                ? Long.parseLong(s.substring(idx + 1)) + 1
                                : 1;
                        ans += remain
                             + dp(idx + 1, y, z, false, digitNum + 1);
                    } else {
                        ans += pow10(s.length() - 1 - idx)
                             + dp(idx + 1, y, z, true, digitNum + 1);
                    }
                }
                else if (digitNum >= 2 && x < y && z < y) {

                    if (z == upper) {
                        long remain = (idx + 1 < s.length())
                                ? Long.parseLong(s.substring(idx + 1)) + 1
                                : 1;
                        ans += remain
                             + dp(idx + 1, y, z, false, digitNum + 1);
                    } else {
                        ans += pow10(s.length() - 1 - idx)
                             + dp(idx + 1, y, z, true, digitNum + 1);
                    }
                }
                else {
                    ans += dp(idx + 1, y, z, z < upper, digitNum + 1);
                }
            }
        }
        memo.put(key, ans);
        return ans;
    }
    private long pow10(int p) {
        long res = 1;
        while (p-- > 0) res *= 10;
        return res;
    }
}