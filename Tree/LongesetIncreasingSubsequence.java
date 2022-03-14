package Tree;
import java.util.*;
public class LongesetIncreasingSubsequence {
    // O(N^2) Time | O(N) Space
public static int lengthOfLIS1(int[] nums) {

	int[] dp = new int[nums.length];
	Arrays.fill(dp, 1);
	int ans = 1;

	for (int i = 1; i < dp.length; i++) {

		for (int j = 0; j < i; j++) {
		
			if (nums[i] > nums[j]) {
				dp[i] = Math.max(dp[i], dp[j] + 1);
			}
			ans = Math.max(ans, dp[i]);
		}
	}
	return ans;
}
}
