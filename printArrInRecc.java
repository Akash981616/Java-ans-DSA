import java.util.Scanner;
public class printArrInRecc {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scn.nextInt();
        }int idx=0;
        printFunction(arr,idx);
        
scn.close();
    }

    public static void printFunction(int[] arr,int idx) {
        if (idx==arr.length){
            return ;
        }
        printFunction(arr, idx+1);
        System.out.println(arr[idx]);
        
    }
}
