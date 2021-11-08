import java.util.Scanner;
/**
 * MultiplicationOfMatrix
 */
public class MultiplicationOfMatrix {

        public static void main(String[] args) {
            Scanner scn=new Scanner(System.in);
            int r1=scn.nextInt();
            int c1=scn.nextInt();
            int [][]arr1=new int[r1][c1];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    arr1[i][j]=scn.nextInt();
                }
            }
            int r2=scn.nextInt();
            int c2=scn.nextInt();
            scn.close();
            int [][]arr2=new int[r2][c2];
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    arr2[i][j]=scn.nextInt();
                }
            }
        if(r2!=c1){
            System.out.print("invalid input");
            return;
        }
        int sum[][]=new int[r1][c2];
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                for (int k = 0; k < c1; k++) {
                    sum[i][j]+=(arr1[i][k]*arr2[k][j]);

                }
            }
        }
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {

                System.out.print(sum[i][j]+"\t");
            }
            System.out.println();
        }

    }
}