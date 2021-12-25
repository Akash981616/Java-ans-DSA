
import java.util.*;
public class digitCountinNumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int count=0;
        int power=10;
        while (n!=0) {
         
        //  int d=n%power
         n=n/power;

        
         count++;

            
        }
        System.out.print(count);
        scn.close();
    }
}
