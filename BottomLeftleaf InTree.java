class Solution {
    public int findBottomLeftValue(TreeNode root) {
            int ans=-1;
            Queue<TreeNode>q=new LinkedList<>();
            if(root==null)return ans;
            q.add(root);
            while(!q.isEmpty()){
                    int n=q.size();
                    for(int i=0;i<n;i++){
                            TreeNode temp=q.poll();
                            if(i==0){
                                    ans=temp.val;
                            }
                            if(temp.left!=null) q.add(temp.left);
                            if(temp.right!=null)q.add(temp.right);
                    }
            }
            return ans;
    }
}