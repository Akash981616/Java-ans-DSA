import java.util.Scanner;
public class maxInRecursion {
  public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      int n =scn.nextInt();
      int arr[]=new int[n];
      for (int i = 0; i < arr.length; i++) {
          arr[i]=scn.nextInt();
      }
      
      int idx=0;
      int max=maxinArray(arr,idx);
      System.out.println(max);
      scn.close();
  }  
  private static int maxinArray(int[] arr,int idx) {
      if(idx==arr.length-1){
          return arr[idx];
      }
      int imv=maxinArray(arr,idx+1);
      if(imv>arr[idx]){
        return imv;
      }
      else{
         return arr[idx];

      }
      
      
}

}
