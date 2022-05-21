package Class.Tree;

import java.util.Scanner;

public class cameraInTree {
        if(root==null){
            return 1;
        }
        int  left=cameraNeed(root.left);
        int  right=cameraNeed(root.right);
        
        if(left==-1||right==-1){
            camera++;
            return 0;
        }
        if(left==0||right==0){
           return 1;            
        }
        return -1;
    }
    public static int MinCamerasInBT(TreeNode root) {
        if(cameraNeed(root)==-1)camera++;
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