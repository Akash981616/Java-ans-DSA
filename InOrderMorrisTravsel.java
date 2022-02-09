import java.util.*;

public class InOrderMorrisTravsel {
  public static Scanner scn = new Scanner(System.in);

  public static class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    TreeNode(int val) {
      this.val = val;
    }
  }

  public static TreeNode getRightMostNode(TreeNode leftNode,TreeNode curr){
    while(leftNode.right!=null&&leftNode.right!=null){
      leftNode=leftNode.right;
    }
    return leftNode;
  }
  public static ArrayList<Integer> morrisInTraversal(TreeNode node) {
    ArrayList<Integer>res=new ArrayList<>();
    TreeNode curr=node;
    while(curr!=null){
    TreeNode leftNode=curr.left;
    if(leftNode==null){
      res.add(curr.val);
      curr=curr.right;
    }else{
      TreeNode rightNode=getRightMostNode(leftNode,curr);
      if(rightNode==null){
        rightNode.right=curr;
        curr=curr.left;
      }else{
        rightNode.right=null;
        res.add(curr.val);
        curr=curr.right;
      }
    }
    }
    return res;
  }

  // input_section=================================================

  public static TreeNode createTree(int[] arr, int[] IDX) {
    if (IDX[0] > arr.length || arr[IDX[0]] == -1) {
      IDX[0]++;
      return null;
    }
    TreeNode Treenode = new TreeNode(arr[IDX[0]++]);
    Treenode.left = createTree(arr, IDX);
    Treenode.right = createTree(arr, IDX);

    return Treenode;
  }

  public static void solve() {
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++)
      arr[i] = scn.nextInt();

    int[] IDX = new int[1];
    TreeNode root = createTree(arr, IDX);

    ArrayList<Integer> ans = morrisInTraversal(root);
    for (Integer i : ans)
      System.out.print(i + " ");

  }

  public static void main(String[] args) {
    solve();
  }
}