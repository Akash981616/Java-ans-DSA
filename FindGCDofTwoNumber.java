import java.util.*;
public class FindGCDofTwoNumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int gcd=0;
        for(int i=1;i<=n&&i<=m;i++){
            if(n%i==0&&m%i==0){
                gcd=i;
            }
        }
  System.out.println(gcd);
    }
}
