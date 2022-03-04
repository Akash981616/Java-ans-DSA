import java.util.Scanner;

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
    public static int needCamera(TreeNode root){
        if(root==null)return 1;
        int leftChild=needCamera(root.left);
        int rightChild=needCamera(root.right);
        if(rightChild==-1||leftChild==-1){
            camera++;
            return 0;
        }if(rightChild==0||leftChild==0)return 1;
        return -1;
    }
static int camera=0;
    public static int MinCamerasInBT(TreeNode root) {
        if(needCamera(root)==-1)camera++;
        
        return camera;
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
        System.out.println(MinCamerasInBT(root));

    }

    public static void main(String[] args) {
        solve();
    }
}