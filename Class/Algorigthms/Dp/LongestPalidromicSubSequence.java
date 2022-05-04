package Class.Algorigthms.Dp;

public class LongestPalidromicSubSequence {
    public static void main(String[] args) {
        String str = "geeeksforgeeks";
       System.out.println(longestPalindromeSubseq(str)) ;
    }
           public static int longestPalindromeSubseq(String str) {
            int n=str.length();
            int dp[][] = new int[n][n];
            for (int gap = 0; gap < n; gap++) {
                for (int i = 0, j = gap; j < n; i++, j++) {
                    if (i >= j) {
                        dp[i][j] = i == j ? 1 : 0;
                        continue;
                    }
                    if (str.charAt(i) == str.charAt(j))
                        dp[i][j] = dp[i + 1][j - 1] + 2;
                    else
                        dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
        }
             return dp[0][n-1];
        }

}
