import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;




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

}









    

