package Class.Algorigthms.Dp;
import java.util.*;
public class EditDistance {
 class Solution {
     public int minDistance(String word1, String word2) {
        int n = word1.length(), m = word2.length();
        int dp[][] = new int[n+1 ][m+1 ];
             for(int d[]:dp)
             Arrays.fill(d,-1);
        return minCost(word1, word2, n, m, dp);
    }

    private int minCost(String s1, String s2, int n, int m, int[][] dp) {
          if (n == 0 || m == 0) {
            return dp[n][m] = n != 0 ? n : m;
           }
          
        if (dp[n][m] !=-1)
            return dp[n][m];

        int insert = minCost(s1, s2, n - 1, m, dp)+1;
        int delete = minCost(s1, s2, n, m - 1, dp)+1;

        int replace = minCost(s1, s2, n - 1, m - 1, dp)+1;
        if (s1.charAt(n-1) == s2.charAt(m-1))
            return dp[n][m] = minCost(s1, s2, n - 1, m - 1, dp);    
        else
            return dp[n][m] = Math.min(insert, Math.min(delete, replace));
    }
}
}
