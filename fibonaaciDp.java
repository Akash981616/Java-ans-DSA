import java.util.*;

public class fibonaaciDp {
public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int qb[]=new int[n+1];
    int ans=printfibonaaci(n,qb);
    System.out.println(ans);
    scn.close();

}

private static int printfibonaaci(int n, int[] qb) {
    if(n==0||n==1){
        return n;
    }
    if(qb[n]!=0){
        return qb[n];

    }
    int a=printfibonaaci(n-1, qb);
    int b=printfibonaaci(n-2, qb);
    int fibonacci=a+b;
    
    qb[n]=fibonacci;
    
    return fibonacci;
}


}
