// class Solution {
//     public boolean validMountainArray(int[] arr) {
//             if(arr.length<3){
//                     return false;
//             }
//                 int i=0;
//             int j=arr.length-1;
//             while(i<arr.length-1&&arr[i]<arr[i+1])  i++;
            
//             while(arr[j]<arr[j-1]&&i>0){
//                     j--; 
//             }
//             System.out.println(i+"="+j);
          
            
//            return i>0&&j<arr.length-1&&i==j; 
//     }
// }
class Solution {
    public boolean validMountainArray(int[] arr) {
        int i=0;
        if(arr.length <3) return false;
        boolean flag1 = false;
        while(i<arr.length-1 && arr[i] < arr[i+1])
        {i++;
         flag1 = true; }
        boolean flag2 = false;
        while(i<arr.length-1 && arr[i] > arr[i+1])
        {i++;
         flag2 = true;}
        if(i == arr.length-1 && flag1 == true && flag2 == true) return true;
        
        return false;
    }
}