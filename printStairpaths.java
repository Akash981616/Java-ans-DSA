import java.util.*;
/**
 * printStairpaths
 */
public class printStairpaths {
public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
   int n=scn.nextInt();
   getpaths(n,"");
   scn.close();
}

private static void getpaths(int n,String ans) {
    if(n<=0){
        if(n==0){
            System.out.println(ans);

        }
        return;
    }
    getpaths(n-1,ans+1);
    getpaths(n-2,ans+2);
    getpaths(n-3,ans+3);
}


 
}