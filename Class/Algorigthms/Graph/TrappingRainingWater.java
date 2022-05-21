package Class.Algorigthms.Graph;

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

