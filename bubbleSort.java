import java.util.*;
/**
 * bubbleSort
 */
public class bubbleSort {
public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int arr[]=new int[n];
for (int i = 0; i < arr.length; i++) {
    arr[i]=scn.nextInt();
}
for (int i = 1; i <=arr.length-1; i++) {
    for (int j = 0; j < arr.length-i; j++) {
        if (smaller(arr,j,j+1)) {
            swap(arr,j,j+1);
            
        }
    }
}
display(arr);
scn.close();
}

private static void display(int arr[]){
    for(int s:arr){
        System.out.println(s);
    }
};

private static void swap(int[] arr, int j, int j2) {
    System.out.println("Swapping " + arr[j2] + " and " + arr[j]);
    int temp=arr[j];
    arr[j]=arr[j2];
    arr[j2]=temp;
}

private static boolean smaller(int[] arr, int ist, int sec ) {
    System.out.println("Comparing " + arr[sec] + " and " + arr[ist]);
        if(arr[ist]>arr[sec]){
            return true;
        }else{    return false;
        }
}

    
}