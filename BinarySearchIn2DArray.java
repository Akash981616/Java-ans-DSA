
public class BinarySearchIn2DArray {
    public static void main(String[] args) {
      
        // int n=scn.nextInt();
        
        // int arr[][]=new int[n][n];
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr.length; j++) {
        //         arr[i][j]=scn.nextInt();
        //     }
        // }
        int arr[][]={
        {11,12,13,14}
        ,{21,22,23,24}
        ,{31,32,33,34},
        {41,42,43,44}};
        int target=44;
          System.out.println(Arrays.toString(BinarySearchIN2dArray(arr,target)));
      }
    

    private static int []  BinarySearchIN2dArray(int[][] arr, int target) {
        int row=0;
        int col=arr.length-1;
        while (row < arr.length && col >= 0) {
        if(arr[row][col]==target){
            return new int[] {row,col};
        }
           if(target<arr[row][col]){
               col--;
           } else{row++;}
        }
        return new int []{-1,-1};
    }
}
