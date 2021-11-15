import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
    int n=scn.nextInt();
    int a[]=new int[n];
    for (int i = 0; i < a.length; i++) {
        a[i]=scn.nextInt();  
    }
    // int k=scn.nextInt();
    byRotate(a);
    // ReverseAnArray(a,k);
    display(a);
    scn.close();
    
    }

    private static void byRotate(int[] a) {
       int start=0;
           int end=a.length-1;
            while (start<end) {
                int temp=a[start];
                a[start]=a[end];
                a[end]=temp;
                start++;
                end--;
            }
    }

    private static void display(int[] a) {
        for(int x:a){
            System.out.print(x);
        }
    }

    // private static void ReverseAnArray(int[] a,int k) {
    //     k=k%10;
    //     if(k<0){
    //         k=k+a.length;

    //     }
    //     // byK(a,0,a.length-1-k);
    //     // byK(a,a.length-k,a.length-1);
    //     // byK(a,0,a.length-1);
        

    // }

    // private static void byK(int a[],int start,int end) {
    //     start=0;
    //     end=a.length-1;
    //     while (start<end) {
    //         int temp=a[start];
    //         a[start]=a[end];
    //         a[end]=temp;
    //         start++;
    //         end--;
    //     }


    // }
    
}
