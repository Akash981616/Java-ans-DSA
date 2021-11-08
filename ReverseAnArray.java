
import java.util.Scanner;
public class ReverseAnArray {
    public static void reverse(int[] a){
int i=0;
int j=a.length-1;
while(i<j){
    int temp=a[i];
    a[i]=a[j];
    a[j]=temp;
    i++;
    j--;

}
 }
 public static void display(int []a){
   for (int x:a) {
       System.out.print(x);
       
   }
 }

    
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=scn.nextInt();
        }scn.close();
        reverse(a);
        display(a);
     }  
}
