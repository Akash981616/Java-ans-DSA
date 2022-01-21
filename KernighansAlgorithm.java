import java.util.*;

public class KernighansAlgorithm {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int count=0;
    while(n!=0){
    int rsb=n&-n;

        n=n-rsb;
        count++;
        
    }
    System.out.println(count);
    scn.close();
}

}