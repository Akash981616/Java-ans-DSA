package Class.Tree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class HouseRobber {
    class Solution {

        class HousePair {
            int withRobbery = 0;
            int withoutRobbery = 0;
        }

        public int rob(TreeNode root) {
            HousePair ans = robMaximumMoney(root);
            return Math.max(ans.withoutRobbery, ans.withRobbery);
        }

        private HousePair robMaximumMoney(TreeNode root) {
            if (root == null)
                return new HousePair();
            HousePair left = robMaximumMoney(root.left);
            HousePair right = robMaximumMoney(root.right);

            HousePair res = new HousePair();
            res.withRobbery = left.withoutRobbery + right.withoutRobbery + root.val;
            res.withoutRobbery = Math.max(left.withRobbery, left.withoutRobbery)
                    + Math.max(right.withRobbery, right.withoutRobbery);
            return res;
        }
    }

}
