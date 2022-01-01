
import java.util.*;
public class missungNumber {
public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
     
         int arr[]={5,4,3,2,1};
        
       
        CylicSort(arr);
        display(arr);
        scn.close();
    }

    private static void display(int[] arr) {
        for (int index = 0; index < arr.length; index++) {
            System.out.print(index);
        }
    }    

    private static int CylicSort(int[] arr) {
        
        int i=0;
        int check=arr[i];
        while (i<arr.length) {
            if (arr[i]<arr.length&&arr[i]!=arr[check]) {
                swap(arr,i,check);
                
            }
            else{
                i++;
            }
            
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index]!=index) {
                return index;
                
            }
        }
        return arr.length;
        
    }

     static void swap(int[] arr, int i, int j) {
         int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
    }

    
}
