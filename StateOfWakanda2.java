import java.util.Scanner;
public class StateOfWakanda2 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        
        
        int n = scn.nextInt();

        int[][] arr = new int[n][n];
    
        for (int i = 0; i < n; i++) {
          for (int j = 0; j < n; j++) {
            arr[i][j] = scn.nextInt();
          }
        }
        scn.close();
        //  Display
        for (int gap = 0; gap < n; gap++) {
            for (int i = 0,j=gap; j < n; i++,j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    
}
