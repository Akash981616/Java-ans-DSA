  import java.util.*;
public class SearchInRotated {
    public static void main(String[] args) {
      
      
      int arr[]={4,5,6,7,0,1,2};
      int target=0;
        int pivot=findPivot(arr);
        System.out.println(pivot);
       
      // return BinarySearch(arr,target,4,arr.length) ;


    }
 
    

    private static int BinarySearch(int[] arr, int target,int start, int end) {
      boolean asc=arr[start]<arr[end];

      while(start<=end){
          int mid=start+(end-start)/2;
          
          if (arr[mid]==target) {
              return mid;
          }
          if (asc) {
            if (target>arr[mid]) {
              start=mid+1;
              
          } else {
              end=mid-1;
              
          }
            
          } else {
            if (target>arr[mid]) {
              end=mid-1;    
          } else {
            start=mid+1;
          }
            
          }
          
      }
      return -1;

  }
    


  static int findPivot(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
        int mid = start + (end - start) / 2;
        // 4 cases over here
        if (mid < end && arr[mid] > arr[mid + 1]) {
            return mid;
        }
        if (mid > start && arr[mid] < arr[mid - 1]) {
            return mid-1;
        }
        if (arr[mid] <= arr[start]) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
    }
    return -1;
}
            
        }
        

