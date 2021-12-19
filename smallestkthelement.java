import java.util.*;
public class smallestkthelement {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
       int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    int k = scn.nextInt();     
      System.out.println(quickSelect(arr, 0, arr.length - 1, k - 1));
    }

    private static int quickSelect(int[] arr, int low, int high, int k) {
        int pivot = arr[high];

        int pi = partition(arr,low, high,pivot);
        if (pi > k)
        {
          return quickSelect(arr, low, pi - 1, k);
        }
        else if (pi < k)
        {
          return quickSelect(arr, pi + 1, high, k);
        }
        return pivot;
      }
    
        
    

      public static int partition(int[] arr, int lo, int hi, int pivot) {
        System.out.println("pivot -> " + pivot);
        int i = lo, j = lo;
        while (i <= hi) {
          if (arr[i] <= pivot) {
            swap(arr, i, j);
            i++;
            j++;
          } else {
            i++;
          }
        }
        System.out.println("pivot index -> " + (j - 1));
        return (j - 1);
      }

      public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    
}
