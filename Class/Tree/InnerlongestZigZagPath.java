package Class.Tree;
/**
 * InnerlongestZigZagPath
 */
public class InnerlongestZigZagPath {
  public static class Pair{
    int forward = -1;
    int backward = -1;
    int maxLen = 0;
    }
     public static Pair recursion(TreeNode root)
    {
        if(root == null)
            return new Pair();
        Pair left = recursion(root.left);
        Pair right = recursion(root.right);
        Pair curr = new Pair();
        
        curr.maxLen = Math.max(Math.max(right.maxLen,left.maxLen),Math.max(left.backward,right.forward)+1);
        curr.forward = left.backward +1;
        curr.backward = right.forward+1;
        return curr;
    }
    
    public static int longestZigZagPath(TreeNode root) {
        Pair ans = recursion(root);
        return ans.maxLen;
    }
    
}
 