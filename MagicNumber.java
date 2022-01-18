import java.util.*;
public class MagicNumber {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n=scn.nextInt();
        int ans=0;
        int base=5;
        while (n>0) {
            int last=n&1;
            System.out.print(last);
            n=n>>1;
            System.out.print(n);
            ans+=last*base;
            base=base*5;
            
        }
       System.out.println(ans);
    }
} 
