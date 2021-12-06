import java.util.*;
/**
 * floodfill
 */
public class floodfill {
public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int m=scn.nextInt();
    int n=scn.nextInt();
    int [][]arr=new int[n][m];
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[0].length; j++) {
            arr[m][n]=scn.nextInt();
        }
    }
    scn.close();
    floodfill(arr,0,0,"");
}

private static void floodfill(int[][] arr, int i, int j, String string) {
}
    
}