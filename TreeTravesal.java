import java.util.*;
public class TreeTravesal {
    public class TreeNode{
        int val;
        TreeNode right;
        TreeNode left;
        TreeNode(int val ){
            this.val=val;

            
        }
        TreeNode (TreeNode right,TreeNode left){
            this.right=right;
            this.left=left;
        }
    }
    public static void main(String[] args) {
        /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

//  Preorder

    public List<Integer> preorderTraversal(TreeNode root) {
         ArrayList<Integer>ans=new ArrayList<>();
        if(root==null) return ans;
        Stack<TreeNode>s=new Stack<>();
            s.push(root);
            while(!s.isEmpty()){
                   TreeNode temp=s.pop();
                    ans.add(temp.val);
                    if(temp.right!=null){
                            s.push(temp.right);
                    }
                    if(temp.left!=null){
                            s.push(temp.left);
                    }
                    
            }
            return ans;
    }
    // recursive preOrder
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer>ans=new ArrayList<>();
       if(root==null) return ans;
           path(ans,root);
       return ans;
   }
       public static void path(List<Integer>ans,TreeNode root){
               if(root==null) return;
               ans.add(root.val);
               path(ans,root.left);
               path(ans,root.right);
       }
    




// Inorder traversal
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
            ArrayList<Integer>ans=new ArrayList<>();
            Stack<TreeNode>stack=new Stack<>();
                    if(root==null) return ans;
            TreeNode node=root;
            while(stack.size()!=0||node!=null){
            if(node!=null){
                stack.add(node);
                    node=node.left;
                }else{
                    node=stack.pop();
                    ans.add(node.val);
                    node=node.right;
               }   
            }
            
   return ans;
}}
    //InOrder Traversal recursive
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer>ans=new ArrayList<>();
    if(root==null) return ans;
        inOrder(ans,root);
        return ans;
}
    public static void inOrder(List<Integer>ans,TreeNode root){
            if(root==null) return;
            inOrder(ans,root.left);
            ans.add(root.val);
            inOrder(ans,root.right);
    }




    // preOrder irterative
    class Solution {
        public List<Integer> postorderTraversal(TreeNode root) {
                List<Integer>res=new ArrayList<>();
                Stack<TreeNode>s1=new Stack<>();
                Stack<TreeNode>s2=new Stack<>();
                if(root==null)return res;
                s1.push(root);
                while(!s1.isEmpty()){
                        TreeNode temp=s1.pop();
                       s2.push(temp);
                if(temp.left!=null)s1.push(temp.left);
                if(temp.right!=null)s1.push(temp.right);  
                }
                while(!s2.isEmpty()){
                TreeNode temp=s2.pop();
                        res.add(temp.val);
                }
                return res;
        }
    }
    // preOrder recursive
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>res=new ArrayList<>();
        if(root==null)return res;
            postOrder(res,root);
        return res;
}
    public static void postOrder(List<Integer>res,TreeNode root){
            if(root==null)return;
            postOrder(res,root.left);
            postOrder(res,root.right);
            res.add(root.val);
    }
    // Level Order  Traversal
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
                List<List<Integer>>res=new ArrayList<>();
                if(root==null)return res;
                Queue<TreeNode>q=new LinkedList<>();
                q.add(root);
                while(q.size()!=0){
                        List<Integer>curr=new ArrayList<>();
                        int size=q.size();
                        for(int i=0;i<size;i++){
                                TreeNode temp=q.remove();
                                curr.add(temp.val);
                            if(temp.left!=null) q.add(temp.left);
                            if(temp.right!=null) q.add(temp.right);
                        }
                        res.add(curr);
                }
            return res;
        }
    }
    // zig zag level order Traversal
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>res=new ArrayList<>();
            if(root==null)return res;
        Queue<TreeNode>q=new LinkedList<>();
           q.add(root);
            int level=0;
            while(q.size()!=0){
            List<Integer>currLevel=new ArrayList<>();
            Stack<Integer>stack=new Stack<>();
            int n=q.size();
                 for(int i=0;i<n;i++){
                         TreeNode temp=q.poll();
                         if(level%2==0){
                         currLevel.add(temp.val);
                         }else{
                         stack.add(temp.val);
                         }
                         if(temp.left!=null)q.add(temp.left);
                         if(temp.right!=null)q.add(temp.right);
                 }
                    while(!stack.isEmpty()){
                        currLevel.add(stack.pop());      
                    }
                    level++;
                res.add(currLevel);
            }
       return res;
    }        
}

// depth of tree  ireative;
class Solution {
    public int maxDepth(TreeNode root) {
      if(root == null) {
          return 0;
      }
      Queue<TreeNode> queue = new LinkedList<>();
      queue.add(root);
      int level = 0;
            while(queue.size()!=0){
                    int n=queue.size();
                    for(int i=0;i<n;i++){
                           TreeNode node=queue.poll();
                            if(node.right!=null) queue.add(node.right);
                            if(node.left!=null) queue.add(node.left);
                    }
                    level++;
            }
      
      return level;
  }
  }
//   recursive solution of depth of tree
class Solution {
    public int maxDepth(TreeNode root) {
      if(root == null) {
          return 0;
      }
     int left=maxDepth(root.left);
     int right=maxDepth(root.right);
      return Math.max(left,right)+1;
  }
  }
  


}
