
 

import java.util.Arrays;

public class CutType {
   public static void main(String[] args) {
        // int arr[] = { 40, 20, 30, 10, 30 };
        // int n = arr.length;
        // int dp[][] = new int[arr.length][arr.length];
        // int ans = mcm_memo(arr, 0, n - 1, dp);

        // display(dp);
        // System.out.print(ans);
        String s = "1+2*3+4*5";

        int n = s.length();
        pairmm dp[][] = new pairmm[n][n];
        pairmm res = minMax(s, 0, n - 1, dp);
        System.out.println(res.min);
        System.out.println(res.max);
        
    }
   public static class pairmm {
        int min = (int) 1e9;
        int max = 0;

        pairmm() {

        }

        pairmm(int val) {
            this.min = this.max = val;
        }
    }

    public static pairmm evaluateMinMax(pairmm leftRes, pairmm rightRes, char operator) {
        pairmm pair = new pairmm();
        if (operator == '+') {
            pair.min = leftRes.min + rightRes.min;
            pair.max = leftRes.max + rightRes.max;
        } else if (operator == '*') {
            pair.min = leftRes.min * rightRes.min;
            pair.max = leftRes.max * rightRes.max;
        }
        return pair;
    }

    public static pairmm minMax(String str, int si, int ei, pairmm[][] dp) {
        if (si == ei) {
            return dp[si][ei] = new pairmm((str.charAt(si) - '0'));
        }

        if (dp[si][ei] != null)
            return dp[si][ei];

        pairmm myRes = new pairmm();
        for (int cut = si + 1; cut < ei; cut += 2) {
            pairmm leftRes = minMax(str, si, cut - 1, dp);
            pairmm rightRes = minMax(str, cut + 1, ei, dp);
            pairmm pair = evaluateMinMax(leftRes, rightRes, str.charAt(cut));

            myRes.min = Math.min(myRes.min, pair.min);
            myRes.max = Math.max(myRes.max, pair.max);
        }

        return dp[si][ei] = myRes;
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

    class Solution {
        public boolean canPartition(int[] nums) {
            int sum = 0, n = nums.length;
            for (int ele : nums)
                sum += ele;
            if (sum % 2 == 1)
                return false;
            boolean dp[][] = new boolean[nums.length + 1][sum / 2 + 1];
            return isPossible(nums, n, sum / 2, dp);
        }

        private boolean isPossible(int[] nums, int n, int target, boolean dp[][]) {
            if (target == 0 || n == 0) {
                return target == 0 ? true : false;
            }
            if (dp[n][target] != 0)
            

                return dp[n][target];


            boolean slect = false;

            boolean notSelect = false;
            
            if (target - nums[n - 1] >= 0) {
                select = isPossible(nums, n - 1, target - nums[n - 1], dp);
                notSelect = isPossible(nums, n - 1, target, dp);
            }
            return dp[n][target] = slect || notSelect;
        }
    }
}