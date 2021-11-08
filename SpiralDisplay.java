import java.util.Scanner;
public class SpiralDisplay {
    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
   int r=scn.nextInt();
   int c=scn.nextInt();
   int arr[][]=new int [r][c];
   scn.close();
   for (int i = 0; i < arr.length; i++) {
       for (int j = 0; j < arr[0].length; j++) {
           arr[i][j]=scn.nextInt();
       }
   }
   int mc=0;
   int mr=0;
   int mxr=arr.length-1;
   int mxc=arr[0].length-1;
   int noelmt=r*c;
   int count=0;
 
   while(count<noelmt){
       //left wall
       if(count<noelmt){
           for (int i = mr,  j=mc; i <=mxr; i++) {
               System.out.println(arr[i][j]);
               count++;
           }
           }
           mc++;
           //bottom wall
        if(count<noelmt)   {
            for (int j= mc,i=mxr; j <= mxc; j++) {
                System.out.println(arr[i][j]);
                count++;
            }
        }  
        mxr--;  
        //right wall
        if (count<noelmt) {
            for (int i = mxr,j=mxc; i >= mr; i--) {
                System.out.println(arr[i][j]);
                count++;
            }
            
        }    
        mxc--;
        //uppper wall
        if (count<noelmt) {
            for (int  j= mxc,i=mxr; j>= mc; j--) {
                System.out.println(arr[i][j]);
                count++;
            }
            
        }
       mr++;
   }
}



}
