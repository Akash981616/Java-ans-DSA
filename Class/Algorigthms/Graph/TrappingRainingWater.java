package Class.Algorigthms.Graph;

import java.util.Arrays;
import java.util.PriorityQueue;

public class TrappingRainingWater {

    class Solution {
        class Pair {
            int r;
            int c;
            int h;

            Pair(int r, int c, int h) {
                this.r = r;
                this.c = c;
                this.h = h;
            }

        }

        public int trapRainWater(int[][] heightMap) {
            int row[] = { 1, -1, 0, 0 };
            int col[] = { 0, 0, 1, -1 };
            int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, 1 }, { 0, -1 } };

            PriorityQueue<Pair> pq = new PriorityQueue<>((Pair a, Pair b) -> {
                return a.h - b.h;
            });

            int n = heightMap.length;
            int m = heightMap[0].length;

            boolean visited[][] = new boolean[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (i == 0 || j == 0 || i == n - 1 || j == m - 1) {
                        pq.add(new Pair(i, j, heightMap[i][j]));
                        visited[i][j] = true;
                    }
                }
            }

            int water = 0;

            while (!pq.isEmpty()) {
                Pair rem = pq.poll();
                for (int dir[] : directions) {

                    int x = rem.r + dir[0];
                    int y = rem.c + dir[1];

                    if (x >= 0 && y >= 0 && x < n && y < m && !visited[x][y]) {
                        water += Math.max(0, rem.h - heightMap[x][y]);
                        if (heightMap[x][y] >= rem.h) {
                            pq.add(new Pair(x, y, heightMap[x][y]));
                        } else {
                            pq.add(new Pair(x, y, rem.h));
                        }
                        visited[x][y] = true;
                    }
                }
            }
            return water;
        }
    }
}

class Solution {
    int dp[][][];

    public int findMaxForm(String[] strs, int m, int n) {

        dp = new int[m + 1][n + 1][strs.length];
        for (int dp2[][] : dp) {
            for (int d1[] : dp2) {
                Arrays.fill(d1, -1);
            }
        }
        return helper(strs, m, n, 0);
    }
    
    
    private int helper(String[] strs, int m, int n, int index) {

        if (index == strs.length || m + n == 0)
            return 0;

        if (dp[m][n][index] != -1)
            return dp[m][n][index];

        int count[] = getCount(strs[index]);
        int select = 0;
        if (m >= count[0] && n >= count[1]) {
            select = 1 + helper(strs, m - count[0], n - count[1], index + 1);
        }
        int notSelect = helper(strs, m, n, index + 1);

        return dp[m][n][index] = Math.max(select, notSelect);
    }
    
    private int[] getCount(String curr) {
        int count[] = new int[2];
        for (char c : curr.toCharArray()) {
            count[c - '0']++;
        }
        return count;
    }
}