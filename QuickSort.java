
import java.util.*;
public class QuickSort {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scn.nextInt();
        }
     
        QuickSorts(arr,0,arr.length-1);
     
    }
    private static void QuickSorts(int[] arr, int low, int hi) {
        if(low>=hi){
            return;
        }
        int pivot=arr[hi];
      int pi=  partisionSort(arr,low,hi,pivot);
        QuickSorts(arr, low, pi-1);
        QuickSorts(arr,  pi+1,hi);
    
    }
    public static int partisionSort(int arr[],int low,int hi, int pivot){  
         System.out.println("pivot -> " + pivot);
        int i=low;
        int j=low;
        while (i<=hi) {
            if(arr[i]>pivot){
                i++;

            }else if(arr[i] <= pivot){
                swap(arr,i,j);
                i++;
                j++;
            }
        }
        display(arr);
        System.out.println("pivot index -> " + (j - 1));
        return (j - 1);
    }

    private static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void display(int arr[]){
    for(int x:arr){
        System.out.println(x);
    }
    }
}
