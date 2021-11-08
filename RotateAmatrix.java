import java.util.Scanner;
public class RotateAmatrix {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int r=scn.nextInt();
        int c=scn.nextInt();
        int arr[][]=new int[r][c];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=scn.nextInt();
            }
        }
    //  transporse
     for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < i; j++) {
          int temp = arr[i][j];
          arr[i][j] = arr[j][i];
          arr[j][i] = temp;
        }
      }
      scn.close();
        // reverse row
        for (int i = 0; i < arr.length; i++) {
            int li = 0;
            int ri = arr.length-1 ;
            while (li <= ri) {
              int temp = arr[i][li];
              arr[i][li] = arr[i][ri];
              arr[i][ri] = temp;
      
              li++;
              ri--;
            }
          }

          //display
      for (int i = 0; i < arr.length; i++) {
          for (int j = 0; j < arr[0].length; j++) {
              System.out.print(arr[i][j]+" ");
              
          }
          System.out.println();
      }

       
}
}
