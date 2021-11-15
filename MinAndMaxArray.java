import java.util.Scanner;
/**
 * MinAndMaxArray
 */
public class MinAndMaxArray {
public static void main(String[] args) {
    Scanner scn=new Scanner (System.in);
    int n=scn.nextInt();
    var a=new int[n];
    for (int i = 0; i < a.length; i++) {
        a[i]=scn.nextInt();

    }
    scn.close();
    minAndMax(a);
}
   public static void minAndMax(int[] a){
      int min=a[0];
      int max=a[0];
      for (int j = 0; j < a.length; j++) {
          if(a[j]>max){
              max=a[j];
          }
          if(a[j]<min){
              max=a[j];
    
      }
      System.out.println(min);
      System.out.println(max);
   } 
}
}