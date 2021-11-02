import java.util.Scanner;
public class PrintSubArray {
    public static void main(String[] args)throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=scn.nextInt();
        }
        subarray(a);
    }
    public static  void subarray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(i);
            for (int j = i; j < a.length; j++) {
                System.out.print(j);
              for (int k = i; k <= j; k++) {
                System.out.print(a[k] + " ");
              }
              System.out.println();
            }}
        }
    }

