/**
 * Arrays
 */
public class Arrays {
    public static void main(String[] args) {
    int arr[]={40, 50, 90};
    for (int i = 0; i < arr.length; i++) {
     int num=arr[i];
     while (num!=0) {
      int remainder= num&1;
      System.out.println(remainder);
      num=num>>1;
         
     }
        
    }
}

    public static char[] toString(int[] binarySearchIN2dArray) {
        return null;
    }

    public static void sort(int[] arr) {
    }

   
   
}