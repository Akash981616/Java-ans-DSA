import java.util.Scanner;
public class EndointoMatrix {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int r=scn.nextInt();
        int c=scn.nextInt();
        int arr[][]=new int[r][c];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=scn.nextInt();
            }
        }
        scn.close();
        int dir=0;
        int i=0;
        int j=0;
    
        while(true){
            dir=(dir+arr[i][j])%4;
             if (dir==0) {
                 j++;
             }
             if (dir==1) {
                 i--;
             }
             if (dir==2) {
                 j--;
             }
             if (dir==4) {
                 i++;
             }
             if(j>arr.length){
               j--;
               
               break;}
             if(i>arr.length){
                 i--;
             }
             if(i<0){
                 i++;
             }
             if(j<0){
                 j++;
             }
        }
        System.out.println(i);
        System.out.println(j);
    }
    
}
