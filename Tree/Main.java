package Tree;

import java.util.Scanner;

// both solution with pair ans wothout pair


public class Main {
    public static Scanner scn = new Scanner(System.in);

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }
     static int ans = 0;

    public static int[] dfs(TreeNode root) {
        if (root == null)
            return new int[] { -1, -1 };

        int[] left = dfs(root.left);
        int[] right = dfs(root.right);

        ans = Math.max(ans, Math.max(left[1], right[0]) + 1);
        return new int[] { left[1] + 1, right[0] + 1 };
    }
    public static class pair{
        int backSlop=-1;
        int forwSlop=-1;
        int maxLen=0;
    }
    public static pair longestZigZag(TreeNode root){
        if(root==null)return new pair();
        pair left=longestZigZag(root.left);
        pair right=longestZigZag(root.right);
        pair ans=new pair();
        ans.maxLen=Math.max(Math.max(left.maxLen,right.maxLen),Math.max(left.backSlop,right.forwSlop)+1);
    
        ans.forwSlop=left.backSlop+1;
        ans.backSlop=right.forwSlop+1;
        return ans;
    }
    public static int longestZigZagPath(TreeNode root) {
        dfs(root);
        return ans;
        // pair ans=longestZigZag(root);
        // return ans.maxLen;
        
    }

    // input_Section_====================================================================

    public static TreeNode createTree(int[] arr, int[] IDX) {
        if (IDX[0] > arr.length || arr[IDX[0]] == -1){
            IDX[0]++;
            return null;
        }
        TreeNode node = new TreeNode(arr[IDX[0]++]);
        node.left = createTree(arr, IDX);
        node.right = createTree(arr, IDX);

        return node;
    }

    public static void solve() {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int[] IDX = new int[1];
        TreeNode root = createTree(arr, IDX);

        System.out.println(longestZigZagPath(root));
    }

    public static void main(String[] args) {
        solve();
    }
}