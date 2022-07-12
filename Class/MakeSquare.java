import java.util.Arrays;

class Solution {
    public boolean makesquare(int[] nums) {
        if (nums == null || nums.length == 0)
            return false;
        int sum = 0;
        for (int num : nums)
            sum += num;
        if (sum % 4 != 0)
            return false;
        Arrays.sort(nums);
        return dfs(nums, new int[4], nums.length - 1, sum / 4);
    }

    boolean dfs(int[] nums, int[] sums, int index, int target) {
        if (index == -1)
            return true;
        for (int i = 0; i < 4; i++) {
            if ((sums[i] + nums[index] > target) || (i > 0 && sums[i] == sums[i - 1]))
                continue;
            sums[i] += nums[index];
            if (dfs(nums, sums, index - 1, target))
                return true;
            sums[i] -= nums[index];
        }
        return false;
    }
}




