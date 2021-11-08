import java.util.Scanner;
public class RotateAnArray 
{public static void reverse(int[] a, int li, int ri) {
    System.out.println(a[li]);
    System.out.println(a[ri]);

    while (li < ri) {
      int temp = a[li];
      a[li] = a[ri];
      a[ri] = temp;

      li++;
      ri--;
    }

  }
  private static void dispaly(int[] a) {
    for(int x:a){
        System.out.print(x+" ");
    }
}
public static void rotate(int[] a, int k) {
    k = k % a.length;
    if (k < 0) {
      k += a.length;
    }

    reverse(a, 0, a.length - k - 1);
    reverse(a, a.length - k, a.length - 1);
    reverse(a, 0, a.length - 1);
  }

    public static void main(String[] args)throws Exception {
        Scanner scn =new Scanner(System.in);
        int n=scn.nextInt();
        
        int a[]=new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=scn.nextInt();
            
        }scn.close();
        int k=scn.nextInt();
        rotate(a,k);
        dispaly(a);
    }
   
    
    
}
