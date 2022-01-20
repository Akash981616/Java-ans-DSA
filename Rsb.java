
import java.util.*;

public class Rsb {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int rsb=n&-n;
    System.out.print(Integer.toBinaryString(rsb));
    scn.close();
  }

}