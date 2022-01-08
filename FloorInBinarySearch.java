import java.util.*;
public class FloorInBinarySearch {
    public static void main(String[] args) {
        int arr[]={10,20,21,22,24,26,28,30,40};
        Scanner scn=new Scanner(System.in);
      int target =scn.nextInt();
     int n=   floor(arr,target);
      System.out.println(n);
      scn.close();
    }
  
  private static int floor(int[] arr, int target) {
      if(target>arr[arr.length-1]){
          return -1;

      }
      int start=0;
      int end=arr.length-1;
      while (start<=end) {
          int mid=(start+end)/2;
         if(target<arr[mid]){
          end=mid-1;
           }
          else if(target>arr[mid]){
          start=mid+1;              
          }
          else{
          return end;
        }
      }
      return start -1;
  }   
}
