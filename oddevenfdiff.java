
import java.util.Scanner;
public class oddevenfdiff {
    
    public static void main (String[] args) throws java.lang.Exception 
 	{

     	//use the following code to fetch input from console 
     	Scanner scn=new Scanner(System.in);
         int[] arr=new int[10];
         for (int i = 0; i < arr.length; i++) {
             arr[i]=scn.nextInt();
         }
scn.close();
         int oddcount =0;
         int evencount=0;
         for (int j= 0; j < arr.length; j++) {
             
             
             if(arr[j]%2==0){
                 evencount++;
             }
             else{
               oddcount++;
             }
 
             
         }
         System.out.println(evencount);
         System.out.println(oddcount);
        int diff=evencount-oddcount;
         System.out.println(diff);
     	
}

}
