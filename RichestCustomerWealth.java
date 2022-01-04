import java.util.*;
public class RichestCustomerWealth {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int arr[][]=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[n][m]=scn.nextInt();
            }
        }
        int ans=richest(arr);
        
    
        System.out.println(ans);
scn.close();

       
        
    }

    private static int richest(int[][] arr) {
        int max=Integer.MIN_VALUE;
            for (int row = 0; row < arr.length; row++) {
            int wealth=0;
            for (int col = 0; col < arr[row].length; col++) {
                wealth+=arr[row][col];
                
            }
           if (wealth>max) {
               max=wealth;
               
           }
        }
        return max;
    }
}
