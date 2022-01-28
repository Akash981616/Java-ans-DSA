import java.util.*;
public class FeedtheLion {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int m=scn.nextInt();
        int n=scn.nextInt();
        int a[]=new int [n];
        
        for (int index = 0; index < n; index++) {
            a[index]=scn.nextInt(); 
        }
        
        if(m>n){
            System.out.println("-1");
            return;
        }
        int ub=sumofArray(a);
        int lb=max(a);
       int res=0;
        while (lb<=ub) {
            int limit=lb+(ub-lb)/2;
            if(ispossible(a,limit,m)==true){
                res=limit;
                ub=limit-1;    
            }else{
                lb=limit+1;
            }
            
        }
        System.out.println(res);
        scn.close();
        
    }

    private static boolean ispossible(int[] a, int limit, int keeper) {
        int KC=1;
        int Fc=0;
        for(int x:a){
            if(Fc+x<=limit){
                Fc+=x;
            }else{
                KC++;
                Fc+=x;
            }
            if (keeper<KC) {
                return false;
                
            }
        }
        return true;
    }

    private static int sumofArray(int[] a) {
        int sum=0;
        for(int x:a){
            sum+=x;
        }
        return sum;
    }
    public static int max(int a []){
        int max=Integer.MIN_VALUE;
        for(int x:a){
            max=Math.max(max, x);
        }
        return max;
    }
    
}
