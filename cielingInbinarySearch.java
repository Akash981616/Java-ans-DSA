import java.util.*;
public class cielingInbinarySearch {
  public static void main(String[] args) {
      int arr[]={10,20,21,22,24,26,28,30,40};
      Scanner scn=new Scanner(System.in);
    int target =scn.nextInt();
   int n=   ceiling(arr,target);
    System.out.println(n);
  }

private static int ceiling(int[] arr, int target) {
    
    int start=0;
    int end=arr.length-1;
    while (start<=end) {
        int mid=start+(end-start)/2;
       if(target<arr[mid]){
        end=mid-1;
         }
        else if(target>arr[mid]){
        start=mid+1;              
        }
        else{
        return mid;
      }
    }
    return start;
}  
}
