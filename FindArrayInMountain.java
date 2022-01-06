import java.util.*;
public class FindArrayInMountain {
    public static void main(String[] args) {
        int arr[]={1,5,2};
        int target=3;
        int ans=solution(arr,target);
        System.out.println(ans);
    }

    private static int solution(int[] arr, int target) {
        int peak=peakInArray(arr);
      
    int firstTry= BinarySearch(arr,target,0,arr.length-1);
    if(firstTry!=-1){
        return firstTry;

    }
        return BinarySearch(arr,target,peak+1,arr.length-1);
       
    }
    
       
    

    private static int BinarySearch(int[] arr, int target, int start, int end) {
        boolean reverOrder=arr[start]>arr[end];
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if (reverOrder) {

                if(target<arr[mid]){
                    start=mid+1;
    
                }else{
                    end=mid-1;
                }
                
            } else {
                if(target>arr[mid]){
                    start=mid+1;
                 
                    
    
                }else{
                    end=mid-1;
                }
            }
            
            
        }
        return -1;
    }

    private static int peakInArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while (start>arr.length) {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
            
        }
        return end;  
    
}
}
