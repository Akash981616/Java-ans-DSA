import java.lang.Thread.State;
import java.util.Arrays;

public class outofBoundry {
  int mod=(int)1e9+7;
    int dirs[][] = { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } };

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {

        int dp[][][] = new int[m + 1][n + 1][maxMove + 1];
        for (int d[][] : dp) {
            for (int x[] : d) {
                Arrays.fill(x, -1);
            }
        }
        return findPathscounts(m, n, maxMove, startRow, startColumn, dp);
    }
    

    private int findPathscounts(int m, int n, int move, int sr, int sc, int dp[][][]) {
        if (sr < 0 || sc < 0 || sr == n || sc == m)
            return move == 0 ? 1 : 0;

        if (move == 0)
            return 0;

        if (dp[sr][sc][move] != 1)
            return dp[sr][sc][move];

        int count = 0;
        for (int dir[] : dirs) {
            count = (count + findPathscounts(m, n, move - 1, sr + dir[0], sc + dir[1], dp)) % mod;
        }

        return dp[n][m][move] = count;
    }
 
}
