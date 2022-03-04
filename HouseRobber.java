import java.util.Scanner;

public class HouseRobber {
    public static Scanner scn = new Scanner(System.in);

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }
    // public static class housePair{
    //     int withRobbery=0;
    //     int withoutRobbery=0;
    // }
    // public static housePair robber(TreeNode root){
    //     if(root==null)return new housePair();
    //     housePair left=robber(root.left);
    //     housePair right=robber(root.right);
    //     housePair myAns=new housePair();
    //     myAns.withRobbery=left.withoutRobbery+root.val+right.withoutRobbery;
    //     myAns.withoutRobbery=Math.max(left.withRobbery,left.withoutRobbery)+Math.max(right.withRobbery,right.withoutRobbery);
    //     return myAns;
    // }
    public static int [] robber(TreeNode root){
        if(root==null)return new int[]{0,0};
        int [] left=robber(root.left);
        int [] right=robber(root.right);
       int []myAns=new int[2];
    myAns[0]=Math.max(left[0],left[1])+Math.max(right[0],right[1]);
    myAns[1]=left[0]+root.val+right[0];
        return myAns;
}
    public static int HouseRobber(TreeNode root) {
        int ans[]=robber(root);
        return Math.max(ans[0],ans[1]);
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
        System.out.println(HouseRobber(root));
    }

    public static void main(String[] args) {
        solve();
    }
}