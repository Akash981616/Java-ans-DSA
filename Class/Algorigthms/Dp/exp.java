
import java.util.*;



public class exp {
    public interface Car {
        public void show();
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public TreeNode() {
        }
    }

    public static class tesla {
        public static void show() {
            System.out.print("hey this his tesla");

        };

        public static void ShowAll(String s) {
            System.out.print(s);
        };

    };

    /**
    * @param args
    */
    public static void main(String[] args) {

        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> a - b);
        tesla car = new tesla();
        Car c = tesla::show;
        c.show();

    }

    class Job {
        int start, end, profit;

        Job(int s, int e, int p) {
            start = s;
            end = e;
            profit = p;
        }
    }

    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        Job[] arr = new Job[startTime.length]; // group together
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Job(startTime[i], endTime[i], profit[i]);
        }
        Arrays.sort(arr, (v1, v2) -> v1.start - v2.start); // sort by start time
        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);
        return rec(arr, 0, dp); // find the best subset
    }

    private int rec(Job[] arr, int idx, int[] dp) {
        if (idx == arr.length)
            return 0;
        if (dp[idx] != -1)
            return dp[idx];
        int i = idx + 1;
        while (i < arr.length && arr[i].start < arr[i].end) {
            i++;
        }
        return dp[idx] = Math.max(arr[idx].profit + rec(arr, idx, dp), rec(arr, idx + 1, dp));
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return PreOrder(preorder, 0, preorder.length - 1, inorder, 0, inorder.length);

    }

    private TreeNode PreOrder(int[] preorder, int ps, int pe, int[] inorder, int is, int ie) {
        if (ps > pe)
            return null;
        TreeNode root = new TreeNode(preorder[ps]);
        int idx = is;
        while (inorder[idx] != preorder[ps])
            idx++;
        int totalELe = idx - is;
        root.left = PreOrder(preorder, ps + 1, ps + totalELe, inorder, is, idx - 1);
        root.right = PreOrder(preorder, ps + totalELe + 1, pe, inorder, idx + 1, ie);
        return root;
    }

    //maxArea of Islands
    class Solution {
        int[] parent, size;

        public int find(int u) {
            return parent[u] == u ? u : (parent[u] = find(parent[u]));
        }

        public int maxAreaOfIsland(int[][] grid) {
            int n = grid.length;
            int m = grid[0].length;
            int dir[][] = { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } };
            parent = new int[n * m];
            size = new int[n * m];
            for (int i = 0; i < n * m; i++) {
                parent[i] = i;
                size[i] = 1;
            }

            int maxSize = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (grid[i][j] == 1) {
                        int p1 = find(i * m + j);
                        for (int dirs[] : dir) {
                            int r = i + dirs[0];
                            int c = j + dirs[1];
                            if (c >= 0 && r >= 0 && r < n && c < m && grid[r][c] == 1) {
                                int p2 = find(r * m + c);
                                if (p1 != p2) {
                                    parent[p2] = p1;
                                    size[p1] += size[p2];
                                }
                            }
                        }
                        maxSize = Math.max(maxSize, size[p1]);
                    }
                }
            }
            return maxSize;
        }
    }

    //minSwap
    class Solution {
        public int minSwaps(int nums[]) {
            int n = nums.length;
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                map.put(nums[i], i);
            }
            boolean visited[] = new boolean[n];
            Arrays.sort(nums);
            int ans = 0;
            for (int i = 0; i < n; i++) {
                if (map.get(nums[i]) == i || visited[i])
                    continue;
                int j = i;
                int cycle = 0;
                while (!visited[j]) {
                    cycle++;
                    visited[j] = true;
                    j = map.get(nums[j]);
                }
                if (cycle > 0)
                    ans += cycle - 1;
            }
            return ans;
        }
    }

    int arr[][] = { { 0, 1, 2, 4 },
            { 3, 4, 5, 4 },
            { 6, 7, 8, 6 },
            { 2, 3, 4, 6 },
            { 1, 3, 4, 5 } };
    int m = arr.length;
    int n = arr[0].length;

    //sliding puzzle
    class Solution {
        public int slidingPuzzle(int[][] board) {
            int[][] dirs = new int[][] { { 1, 3 }, { 0, 2, 4 },
                    { 1, 5 }, { 0, 4 }, { 1, 3, 5 }, { 2, 4 } };
            String target = "123450";
            String start = "";
            HashSet<String> set = new HashSet<>();
            int n = board.length;
            int m = board[0].length;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    start += board[i][j];
                }
            }
            LinkedList<String> q = new LinkedList<>();
            set.add(start);
            q.add(start);
            int swap = 0;
            while (!q.isEmpty()) {
                int size = q.size();
                while (size-- > 0) {
                    String curr = q.remove();
                    if (curr.equals(target))
                        return swap;
                    int zero = cur.indexOf('0');
                    for (int dir : dirs[zero]) {
                        String next = swap(curr, zero, dir);
                        if (visited.contains(next))
                            continue;

                        set.add(next);
                        queue.offer(next);
                    }
                }
                swap++;
            }
            return -1;
        }

        public void swap(String str, int i, int j) {
            StringBuilder sb = new StringBuilder(str);
            sb.setCharAt(i, str.charAt(j));
            sb.setCharAt(j, str.charAt(i));
            return sb.toString();

        }
    }

    //out of boundary
    class Solution {
        int mod = (int) 1e9 + 7;
        int dirs[][] = { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } };

        public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
            int dp[][][] = new int[m + 1][n + 1][maxMove + 1];
            for (int dpp[][] : dp) {
                for (int d[] : dpp)
                    Arrays.fill(d, -1);
            }
            return paths(m, n, maxMove, startRow, startColumn, dp);
        }

        public int path(int m, int n, int k, int sr, int sc, int dp[][][]) {
            if (sr == m || sc == n || sr < 0 || sc < 0)
                return 1;
            if (dp[sr][sc][k] != -1)
                return dp[sr][sc][k];

            if (k == 0)
                return 0;
            int count = 0;
            for (int d[] : dirs) {
                int x = sr + dir[0];
                int y = sc + dir[1];
                count = (count + path(m, n, k - 1, x, y, dp)) % mod;
            }
            return dp[sr][sc][k] = count;
        }

    }

    //    827. Making A Large Island
    class Solution {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n;
        int m;
        int dirs[][] = { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } };

        public int largestIsland(int[][] grid) {
            n = grid.length;
            m = grid[0].length;
            int island = 2, max = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (grid[i][j] == 1) {
                        int size = getConnectedComponet(grid, i, j, island);
                        max = Math.max(size, max);
                        map.put(island++, size);
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (grid[i][j] == 0) {
                        HashSet<Integer> set = new HashSet<>();
                        for (int d[] : dirs) {
                            int x = i + d[0];
                            int y = j + d[1];
                            if (x >= 0 && y >= 0 && x < n && y < m && grid[x][y] != 0) {
                                set.add(grid[x][y]);
                            }
                        }
                        int sum = 1;
                        for (int ele : set)
                            sum += map.get(ele);
                        max = Math.max(max, sum);
                    }
                }
            }

            return max;
        }

        public int getConnectedComponet(int[][] grid, int i, int j, int island) {
            grid[i][j] = island;
            int count = 0;
            for (int dir[] : dirs) {
                int x = i + dir[0];
                int y = j + dir[1];
                if (x >= 0 && y >= 0 && x < grid.length && y < grid[0].length && grid[x][y] == 1)
                    count += getConnectedComponet(grid, x, y, island);

            }
            return count + 1;

        }
    }

    class Solution {
        public int[] numberOfPairs(int[] nums) {
            int res[] = new int[2];
            int map[] = new int[101];
            for (int ele : nums)
                map[ele]++;
            int i = 0;
            for (i = 0; i < 101; i++) {
                if (i == 0 && map[i] <= 1)
                    continue;
                if (map[i] % 2 == 0) {
                    res[i++] = i;
                }

            }
            return res;
        }
    }

    class Solution {
        public int numSubmatrixSumTarget(int[][] matrix, int target) {
            int row = matrix.length;
            int col = matrix[0].length;
            int res = 0;
            //int[][] sum = new int[row][col];

            for (int i = 0; i < row; i++) {
                for (int j = 1; j < col; j++) {
                    //sum[i][j] =sum[i][j-1] + matrix[i][j-1];
                    matrix[i][j] += matrix[i][j - 1];
                }
            }

            for (int start = 0; start < col; start++) {
                for (int end = start; end < col; end++) {
                    int subMatrixSum = 0;

                    Map<Integer, Integer> countElm = new HashMap<Integer, Integer>();
                    countElm.put(0, 1);

                    for (int k = 0; k < row; k++) {
                        //subMatrixSum += sum[k][end] - sum[k][start];
                        int prefixSum = start == 0 ? 0 : matrix[k][start - 1];
                        subMatrixSum += matrix[k][end] - prefixSum;

                        if (countElm.containsKey(subMatrixSum - target))
                            res += countElm.get(subMatrixSum - target);

                        int r = countElm.getOrDefault(subMatrixSum, 0);
                        countElm.put(subMatrixSum, r + 1);
                    }
                }
            }

            return res;
        }
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> curr = new ArrayList<>(Arrays.asList(1));
            for (int j = 1; j < i; j++) {
                curr.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
            }
            if (i > 0)
                curr.add(1);
            res.add(curr);
        }
        return res;
    }

    class Solution {
        int parent[];

        public int makeConnected(int n, int[][] connections) {
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
            int component = n;
            for (int con[] : connections) {
                int p1 = find(con[0]);
                int p2 = find(con[1]);
                if (p1 != p2) {
                    parent[p1] = p2;
                    component--;
                }

            }
            return component;
        }

        public int find(int u) {
            return parent[u] == u ? u : (parent[u] = find(parent[u]));
        }
    }

    class Solution {
        public int carFleet(int target, int[] position, int[] speed) {
            int n = position.length;
            double[][] carInfo = new double[][];
            for (int i = 0; i < n; i++) {
                carInfo[i][0] = position[i] * 1d;
                carInfo[i][1] = (target - position[i] * 1d) / speed[i];
            }
            Arrays.sort(carInfo, (a, b) -> a[0] - b[0]);
            int fleet = 0;
            double tt = carInfo[n - 1][1];
            for (int i = n - 2; i >= 0; i--) {
                if (carInfo[i][1] > tt) {
                    tt = carInfo[i][1];
                    fleet++;
                }
            }
            return fleet + 1;
        }
    }

    class Solution {
        //s = "abcde", words = ["a","bb","acd","ace"]
        //output =3

        public int numMatchingSubseq(String s, String[] words) {
            Map<Character, Queue<String>> map = new HashMap<>();
            int ans = 0;

            for (int i = 0; i < s.length(); ++i)
                map.putIfAbsent(s.charAt(i), new LinkedList<>());

            for (String word : words) {
                char startCh = word.charAt(0);
                if (map.containsKey(startCh))
                    map.get(startCh).offer(word);
            }
            for (int i = 0; i < s.length(); ++i) {
                char startCh = s.charAt(i);
                Queue<String> que = map.get(startCh);
                int size = que.size();
                for (int j = 0; j < size; ++j) {
                    String str = que.poll();
                    if (str.substring(1).length() == 0)
                        ans++;
                    else if (map.containsKey(str.charAt(1)))
                        map.get(str.charAt(1)).add(str.substring(1));
                }
            }
            return ans;
        }

    }

    class Solution {
        public int minDays(int[] bloomDay, int m, int k) {
            int n = bloomDay.length;
            if (bloomDay.length < m * k) {
                return -1;
            }
            int low = 1;
            int high = (int) 1e9;
            for (int ele : bloomDay)
                high = Math.max(high, ele);

            int ans = -1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (isPossible(bloomDay, m, k, mid)) {
                    ans = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            return ans;
        }

        public boolean isPossible(int[] arr, int m, int k, int mid) {
            int flower = 0;
            int days = 0;
            for (int ele : arr) {
                if (ele <= mid) {
                    flower++;
                    if (flower == k) {
                        days++;
                        flower = 0;
                    }
                } else {
                    flower = 0;
                }
            }
            return days >= m;
        }
    }

}





























    

