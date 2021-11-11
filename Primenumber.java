import java.util.Scanner;
public class Primenumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t=scn.nextInt();
       
        for(int i=0;i<t;i++){
            int n=scn.nextInt();
            int m=n/2;
            for(int j=2;j*j<=t;j++){
                if (n==2) {
                    System.out.println("prime");
                }
               else if(n%j==0){
                    System.out.print(n);
                    System.out.println("not prime");
                }else{
                    System.out.print(n);
                    System.out.println("prime");
                    
                }
        }
        
           
            
        
    }
     }
}
