import java.util.*;
public class partisionSort {

    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scn.nextInt();

        }
        
        int pivot=scn.nextInt();
    
        partisionSorts(arr,pivot);

    }

    private static void partisionSorts(int[] arr, int pivot) {
        int i = 0;
        int j = 0;
        while (i < arr.length) {
          if (arr[i] > pivot)
          {
            i++;
          }
          else if (arr[i] <= pivot)
          {
            swap(arr, i, j);
            i++;
            j++;
          }
        }
 display(arr);
    }

    private static void display(int[] arr) {
        for(int x:arr){
            System.out.print(x);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
}
