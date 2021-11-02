import java.util.Scanner;
public class InverseOfAnArray {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n= scn.nextInt();
        int a[]=new int [n];
        for (int i = 0; i < a.length; i++) {
            a[i]=scn.nextInt();

        }
            int[] inv=inverse(a);
            display(inv);
    }

    private static void display(int[] inv) {
        for(int x:inv){
            System.out.print(x+"\n");
        }
    }

    private static  int[] inverse(int[] a) {
        int inv[]=new int[a.length];
        for (int i = 0; i < inv.length; i++) {
            int v=a[i];
            inv[v]=i;

        }
        return inv;
    }
    
}
