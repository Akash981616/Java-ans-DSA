
import java.util.*;
public class reverseAnumber {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n=scn.nextInt();
        
        while(n!=0){
            int power=10;
            int d=n%power;
            n=n/power;
            System.out.println(d);
            
            power=power*10;

        }
            scn.close();
    }
}
