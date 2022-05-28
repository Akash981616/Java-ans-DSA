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
    
    //  Burint Treee 1;


  public static void burinTime(TreeNode root,int time,TreeNode block){
      if(root==null || root==block)return;
             maxTime=Math.max(maxTime,time);
           burinTime(root.left,time+1,block);
           burinTime(root.right,time+1,block);
           return;
  }
  public static int  burnkdown(TreeNode root,int fireNode){
      if(root==null)return -1;
      if(root.val==fireNode){
          burinTime(root,0,null);
          return 1;
      }
      int lt=burnkdown(root.left,fireNode);
      if(lt!=-1){
          burinTime(root,lt,root.left);
      
          return lt+1;
      }
      int rt=burnkdown(root.right,fireNode);
       if(rt!=-1){
           burinTime(root,rt,root.right);
          return rt+1;
           
       }
      return -1;
  }
  public static int maxTime=0;
  public static int burningTree(TreeNode root, int fireNode) {
      burnkdown(root,fireNode);
      return maxTime;
  }

  // input_section=================================================
  //k down function
  public static void kdown(TreeNode root, int k, TreeNode block, ArrayList<Integer> ans) {
    if (root == null || k < 0 || root == block)
      return;

    if (k == 0) {
      ans.add(root.val);
      return;
    }

    kdown(root.left, k - 1, block, ans);
    kdown(root.right, k - 1, block, ans);
  }

  public static int distanceK(TreeNode root, int target, int k, ArrayList<Integer> ans) {
    if (root == null)
      return -1;

    if (root.val == target) {
      kdown(root, k, null, ans);
      return 1;
    }

    int ld = distanceK(root.left, target, k, ans);
    if (ld != -1) {
      kdown(root, k - ld, root.left, ans);
      return ld + 1;
    }

    int rd = distanceK(root.right, target, k, ans);
    if (rd != -1) {
      kdown(root, k - rd, root.right, ans);
      return rd + 1;
    }

    return -1;
  }

  public static ArrayList<Integer> distanceK(TreeNode root, int target, int k) {
    ArrayList<Integer> ans = new ArrayList<>();
    distanceK(root, target, k, ans);

    return ans;

  }


    
}
