import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int array[]=new int[n];
    for (int i = 0; i < array.length; i++) {
        array[i]=scn.nextInt();
    }
    int data=scn.nextInt();
     int lp=0;
    int hp=array.length-1;
    scn.close();
    while(lp<=hp){
      int  mid=lp+hp/2;
      if (data>array[mid]) {
          lp=mid+1;
          
      } else if (data<array[mid]) {
        
          hp=mid-1;

          
      } else  {
        
          return;
      }
      
    }
    System.out.print(-1);
    }
    

}
