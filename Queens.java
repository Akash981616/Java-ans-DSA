import java.util.Scanner;
public class Queens {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        
        int arr[][]=new int[n][n];
        
        quenns(arr,"",0);
        scn.close();

    }

    private static void quenns(int[][] chess, String qsf, int row) {
        if(row==chess.length){
            System.out.print(qsf);
            return;
        }
        for (int col = 0; col < chess.length; col++) {
         
          if(isQueensafe(chess,col,row)==true){
            chess[row][col]=1;
            quenns(chess,qsf + row + "-" + col + ", ", row + 1);
            chess[row][col]=0;
           }


            
        }
    }

    private static boolean isQueensafe(int[][] chess, int col, int row) {
        for (int i = row - 1, j = col - 1;
        i >= 0 && j >= 0; i--, j--) {
     if (chess[i][j] == 1) {
       return false;
     }
   }

   for (int i = row - 1, j = col; i >= 0; i--) {
     if (chess[i][j] == 1) {
       return false;
     }
   }

   for (int i = row - 1, j = col + 1; i >= 0
        && j < chess.length; i--, j++) {
     if (chess[i][j] == 1) {
       return false;
     }
   }

   for (int i = row, j = col - 1; j >= 0; j--) {
     if (chess[i][j] == 1) {
       return false;
     }
   }
   return true;
    }
   
}
