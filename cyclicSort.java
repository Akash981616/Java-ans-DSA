import java.util.*;
public class cyclicSort {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        // int arr[]={5,4,3,2,1};
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scn.nextInt();
        }
        CylicSort(arr);
        display(arr);
    }

    private static void display(int[] arr) {
        for(int x:arr){
            System.out.println(x);
        }
    }

    private static void CylicSort(int[] arr) {
        int i=0;
        while (i<arr.length) {
            int check=arr[i]-1;
            if (arr[i]!=check) {
                swap(arr,i,check);
                
            }
            else{
                i++;
            }
            
        }
    }

    private static void swap(int[] arr, int i, int check) {
        int temp=arr[i];
        arr[i]=arr[check];
        arr[check]=temp;
    }
}
