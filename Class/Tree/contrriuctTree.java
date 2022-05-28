public class contrriuctTree {
    //preorder tree from preorder
    public static Scanner scn = new Scanner(System.in);
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }
   static int idx=0;
    public static TreeNode tree(int preorder[],int lb,int rb ){
        if(idx==preorder.length || preorder[idx] <lb || preorder[idx]>rb)return null;
        TreeNode root=new TreeNode(preorder[idx++]);
        root.left=tree(preorder,lb,root.val);
         root.right=tree(preorder,root.val,rb);
        
        return root;
    }
    public static TreeNode bstFromPreorder(int[] preorder) {
        return tree(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    // input_section=================================================

    public static void display(TreeNode node) {
        if (node == null)
            return;

        StringBuilder sb = new StringBuilder();
        sb.append((node.left != null ? node.left.val : "."));
        sb.append(" -> " + node.val + " <- ");
        sb.append((node.right != null ? node.right.val : "."));

        System.out.println(sb.toString());

        display(node.left);
        display(node.right);

    }

    public static void solve() {
        int n = scn.nextInt();
        int[] pre = new int[n];
        for (int i = 0; i < n; i++)
            pre[i] = scn.nextInt();

        TreeNode root = bstFromPreorder(pre);
        display(root);
    }
    

    public static void main(String[] args) {
        solve();
    }

    //preorder tree from preorder
        public static int index;

        public static TreeNode tree(int[] preorder, int lb, int rb) {
            if (index == -1)
                return null;
            else if (preorder[index] < rb && preorder[index] > lb) {
                TreeNode root = new TreeNode(preorder[index]);
                index--;
                root.right = tree(preorder, root.val, rb);
                root.left = tree(preorder, lb, root.val);
                return root;
            }
            return null;
        }

        public static TreeNode bstFromPostorder(int[] preorder) {
            index = preorder.length - 1;
            return tree(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
       // Tree From preOrder and Inorder 
       public static TreeNode Tree(int[] preorder, int[] inorder,int psi,int pei,int isi,int iei){
       if (psi > pei)return null;
        
         TreeNode root=new TreeNode(preorder[psi]);
        int idx = isi;
        while (inorder[idx] != preorder[psi])
            idx++;
            
         int tnel = idx - isi;
         root.left=Tree(preorder,inorder, psi+1 , psi+tnel , isi , idx-1);
         root.right=Tree(preorder,inorder, psi+tnel+1 , pei , idx+1 , iei);
         return root;
        
        
    }
    

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        return Tree(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }
    

    
}
