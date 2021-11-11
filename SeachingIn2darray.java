import java.util.Scanner;
public class SeachingIn2darray {
  public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      int arr[][]=new int[n][n];
      for (int i = 0; i < arr.length; i++) {
          for (int j = 0; j < arr.length; j++) {
              arr[i][j]=scn.nextInt();

          }
      }
      scn.close();
      int data =scn.nextInt();
    int row = 0;
    int col = n - 1;
    while (row < n && col >= 0) {
      if (arr[row][col] == data) {
        System.out.println(row);
        System.out.println(col);
        return;
      }
      if (arr[row][col] > data) {
        col--;
      } else {
        row++;
      }
    }
    System.out.print("Not Found");
          
      



  }  
}
