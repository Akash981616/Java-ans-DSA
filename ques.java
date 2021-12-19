import java.util.*;
public class ques {
  public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int arr[]=new int[n];
    for (int i = 0; i < arr.length; i++) {
        arr[i]=scn.nextInt();
    }
    int sum=0;
      for(int i=0;i<=arr.length-1;i++){
          sum+=arr[i];
      }
      System.out.print(sum);

    // ArrayList <Integer>arr2=new ArrayList<>();
    // for (int i = 1; i <=arr.length-4; i++) {
    //     for (int j = i; j <=arr[i+3]; sum+=arr [j++]); {
    //         System.out.print(sum);
    //             //  arr2.add(sum);
    //     }
        
    // }
    // int max=arr[0];
    // for(int x:arr2){
    //     if (max<x) {
    //        System.out.println(x);
            
    //     }
    // }
    // System.out.print(max);
    scn.close();
  }
 
    

}
