/**
 * PeakIndexInMountainArray
 */
public class PeakIndexInMountainArray {

    public int findInMountainArray(int target, MountainArray mountainArr) {
            
        int peak = findPeak(mountainArr);
    
         int leftCheck=BinarySearch(mountainArr,target,0,peak);
         if(leftCheck!=-1){
              return leftCheck;
         }
         return BinarySearch(mountainArr,target,peak,mountainArr.length()-1);
    }
     
     
    public int BinarySearch(MountainArray arr, int target, int start, int end){
         boolean asc=arr.get(start)>arr.get(end);
         while(start<=end){
                   int mid=start+(end-start)/2;
                 if(target==arr.get(mid)){
                         return mid;
                 }
                 if(asc){
                         if(target>arr.get(mid)){
                              start=mid+1;   
                         }else{
                                 end=mid-1;
                                 
                         }
                         
                 }else{
                          if(target<arr.get(mid)){
                                  end=mid-1;
                               
                         }else{
                                start=mid+1;   
                                 
                         }
                         
                 }
         }
         return -1;
    }
     
     
     
     
     
     public int findPeak(MountainArray arr){
            int start=0;
            int end=arr.length() - 1;
             while(start<end){
                     int mid=start+(end-start)/2;
                     if(arr.get(mid)>arr.get(mid+1)){
                             end=mid;}
                     else{start=mid+1; }
                           
                             
                     }
                     return start;       }
    
    
}