import java.io.*;
import java.util.*;

public class KnigthTour {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sr = Integer.parseInt(br.readLine());
        int sc = Integer.parseInt(br.readLine());
    int[][]dir = {{-2,1},{-1,2},{1,2},{2,1},{2,-1,},{1,-2},{-1,-2},{-2,-1}};

        int[][] chess = new int[n][n];
        printKnightsTour(chess,sr,sc,1,dir);
    }

   
          public static void printKnightsTour(int[][] chess, int sr, int sc, int uc,int[][]dir) {
         if(uc==chess.length*chess.length) {
           chess[sr][sc] = uc;
           displayBoard(chess);
           chess[sr][sc] = 0;
           return;
          }
          chess[sr][sc] = uc;
         for(int d = 0;d<dir.length;d++){
           int r = sr + dir[d][0];
           int c = sc + dir[d][1];
           if(r<0||r>=chess.length||c<0||c>=chess[0].length||chess[r][c]!=0)continue;
            printKnightsTour(chess,r,c,uc+1,dir);
          }
        chess[sr][sc] = 0;
        }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}


                        


                        
                        
                                
                                