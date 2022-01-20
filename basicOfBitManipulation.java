;
import java.util.*;

public class basicOfBitManipulation {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int i = scn.nextInt();
    int j = scn.nextInt();
    int k = scn.nextInt();
    int m = scn.nextInt();
    
 int onmask=(1<<i);
 int ofmask=~(1<<j);
 int togglemask=(1<<k);
 int offmask=(1<<m);
 System.out.println(n|onmask);
 System.out.println(n&ofmask);
 System.out.println(n^togglemask);
 System.out.println((n&offmask)==0?false:true);
 scn.close();
  }

}
