package DataStructure;

public class AvlTree {
     public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        int bal = 0;
        int height = 0;

        TreeNode(int val) {
            this.val = val;
            this.height = 0;
            this.bal = 0;
        }
    }

    // ========================================================================
    

    public static int getMaximum(TreeNode root) {
        if (root == null)
            return 0;
        while (root.right != null) {
            root = root.right;
        }

    }
        public TreeNode getRotation(TreeNode root) {
        if (getBal(root) >= 2) { // ll,lr
            if (getBal(root.left) >= 1) { // ll
                return rightRotation(root);
            } else { // lr
                root.left = leftRotation(root.left);
                return rightRotation(root);
            }

        } else if (getBal(root) <= -2) { // rr,rl
            if (getBal(root.right) <= -1) { // rr
                return leftRotation(root);
            } else { // rl
                root.right = rightRotation(root.right);
                return leftRotation(root);
            }
        }

        return root;
    }

    public static TreeNode getRotation(TreeNode root) {
        return root;
    }

    public static void updataHeightAndBalance(TreeNode root) {
        int lh =root.left? root.left.height:-1;
        int rh =root.right? root.right.height:-1;

    }

    public static TreeNode leftRotation(TreeNode A) {
        TreeNode B = A.left;
        TreeNode BkaRight = B.right;
          
        return A;
    }
   // O(Logn)
    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null)
            return new TreeNode(val);
        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = null;
        for (int i = 1; i <= 100; i++) {
            root = insertIntoBST(root, i * 10);
        }

        display(root);
    }
    
     // O(n)
     public static void display(TreeNode node) {
         if (node == null) {
             return;
         }

         StringBuilder sb = new StringBuilder();
         sb.append((node.left != null ? node.left.val : "."));
         sb.append(" -> " + node.val + " <- ");
         sb.append((node.right != null ? node.right.val : "."));

         System.out.println(sb.toString());

         display(node.left);
         display(node.right);
     }

     public int getHeight(TreeNode node) {
         return node == null ? -1 : Math.max(getHeight(node.left), getHeight(node.right)) + 1;
     }
    
}

