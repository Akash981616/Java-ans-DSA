package Class.Algorigthms.Dp;

/**
 * LCS
 */
public class LCS {

     public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
       int dp[][]=new int[n][m];

        return getlongestCommonSubsequence(text1,text2,n,m,dp);
    }

    private int getlongestCommonSubsequence(String s1, String s2, int n, int m, int[][] dp) {
        if (n == 0 || m == 0) {
            return dp[n][m] = 0;
        }

        if (dp[n][m] != 0) {
            return dp[n][m];
        }
        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
            return dp[n][m] = 1 + getlongestCommonSubsequence(s2, s2, n - 1, m - 1, dp);
        } else {
            return dp[n][m] = Math.max(getlongestCommonSubsequence(s2, s2, n - 1, m, dp),
                    getlongestCommonSubsequence(s2, s2, n, m - 1, dp));
        }
    }
    class Solution {
   public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length(), n = text2.length();
        int[] dp = new int[n+1];
        
        for (int i = 1; i <= m; i++) {
            char c1 = text1.charAt(i - 1);
            int pre = 0;
            for (int j = 1; j <= n; j++) {
                char c2 = text2.charAt(j - 1);
                int temp = dp[j];
                if (c1 == c2)
                    dp[j] = pre + 1;
                else
                    dp[j] = Math.max(dp[j - 1], dp[j]);
                pre = temp;
            }
        }

        return dp[n];
    }
}
}