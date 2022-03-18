class Solution {
    int count=0;
    public void goodNodes_(TreeNode root,int rootval) {
            if(root==null)return ;
            if(root.val>=rootval)count++;
            rootval=Math.max(rootval,root.val);
            goodNodes_(root.left,rootval);
            goodNodes_(root.right,rootval);
    }

public int goodNodes(TreeNode root) {
        if(root==null)return 0;
        int rootval=root.val;
        goodNodes_(root,rootval);
    return count;
}
}