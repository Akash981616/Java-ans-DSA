import java.util.*;
public class climStair {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int qb[]=new int[n+1];
        int ans=climStairs(n,qb);
        System.out.println(ans);
    }

    private static int climStairs(int n, int[] qb) {
        if(n==0){
            return 1;
        }else if (n<0) {
            return 0;
            
        }
        if (qb[n]<0) {
            return qb[n];
            
        }
        
        int x=climStairs(n-1,qb);
        int y=climStairs(n-2,qb);
        int z=climStairs(n-3,qb);
        int all=x+y+z;
       qb[n]=all;

        return all;

    }
}
