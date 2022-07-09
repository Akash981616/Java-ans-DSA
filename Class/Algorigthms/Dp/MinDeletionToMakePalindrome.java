import java.util.Arrays;

public class MinDeletionToMakePalindrome {
     public int minInsertions(String s) {
            int n=s.length();
            int dp[][]=new int[n+1][n+1];
            for(int d[]:dp)Arrays.fill(d,-1);
            return minStep(s,0,n-1,dp);
    }
    
    public int minStep(String s, int start, int end, int dp[][]) {
        if (start >= end) {
            return dp[start][end] = 0;
        }
        if (dp[start][end] != -1) {
            return dp[start][end];
        }

        if (s.charAt(start) == s.charAt(end)) {
            return minStep(s, start + 1, end - 1, dp);
        } else {
            return dp[start][end] = Math.min(minStep(s, start, end, dp), minStep(s, start, end, dp)) + 1;
        }

    }
}
