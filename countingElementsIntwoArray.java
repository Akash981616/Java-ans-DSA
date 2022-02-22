import java.util.*;
import java.io.*;

public class countingElementsIntwoArray {

  public static int[] find(int[]arr1, int[]arr2) {
    Arrays.sort(arr2);
    for(int i=0;i<arr1.length;i++){
      int val=getCount(arr2,arr1[i]);
      arr1[i]=val;
    }
    return arr1;
  }
  public static int getCount(int arr2[],int key){
    int count=0;
    int start=0;
    int end=arr2.length-1;
    while(start<=end){
      int mid=start+(end-start)/2;
      if(arr2[mid]<=key){
        count+=(mid-start+1);
        start=mid+1;
      }else{
        end=mid-1;
      }
      
    }
    return count;
  }

  public static void main(String[]args) {
    //input work
    Scanner scn = new Scanner(System.in);

    int n1 = scn.nextInt();
    int[]a = new int[n1];

    for (int i = 0; i < n1; i++) {
      a[i] = scn.nextInt();
    }

    int n2 = scn.nextInt();
    int[]b = new int[n2];

    for (int i = 0; i < n2; i++) {
      b[i] = scn.nextInt();
    }

    int[]ans = find(a, b);

    for (int val : ans) {
      System.out.print(val + " ");
    }
  }
}