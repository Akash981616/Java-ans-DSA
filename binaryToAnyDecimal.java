import java.util.Scanner;

  public class binaryToAnyDecimal{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){
    int rv = 0;
 
    int power=1;
    while(n > 0){
        int d = n % b;
        n = n / b;
        rv+=power*d;
        power=power*b;
       
  
 }
     return rv;

   }
  }