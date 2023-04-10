public class check {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target = 4;
        String ans = "Akashd";
        String s3 = "Kumar";
        StringBuilder s2 = new StringBuilder();
        s2.append(ans+s3);

   int left =BinarySearch(arr,target,4);
   System.out.print(left);
    }

    private static int BinarySearch(int[] arr, int target,int pivot) {
        int start=0;
        int end=pivot-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]==target) {
                return mid;
            }
            if (target>arr[mid]) {
                start=mid+1;
                
            } else {
                end=mid-1;
                
            }
        }
        return -1;

    }
}
