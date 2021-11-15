import java.util.Scanner;
public class linearPower {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        int n=scn.nextInt();
       int ans= power(x,n);
       System.out.println(ans);
      scn.close();
    }

    private static int power(int x, int n) {
        if(n==0){
            return 1;
        }
        int xp=power(x,n-1);
        int  ans=xp*x;
        return ans;
    }
}
