import java.util.*;
public class digitofNumber {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n=scn.nextInt();
        int nod=0;
        int tem=n;
        while (n!=0) {
            n=n/10;
            nod++;
            
        }
        int div=(int)Math.pow(10, nod-1);
        while (div!=0) {
                int d=tem/div;
                System.out.println(d);
                tem=tem%div;
                div=div/10;

            
        }
        scn.close();
    }
}
