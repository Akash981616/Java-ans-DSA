import java.util.Scanner;
public class Primenumber {
    // public static void main(String[] args) {
    //     Scanner scn = new Scanner(System.in);
    //     int t=scn.nextInt();
    //    scn.close();
    //     for(int i=0;i<t;i++){
    //         int n=scn.nextInt();
    //         // int m=n/2;
    //         for(int j=2;j*j<=t;j++){
    //             if (n==2) {
    //                 System.out.println("prime");
    //             }
    //            else if(n%j==0){
    //                 System.out.print(n);
    //                 System.out.println("not prime");
    //             }else{
    //                 System.out.print(n);
    //                 System.out.println("prime");
                    
    //             }
    //     }
        
           
            
        
    // }
    //  }

    
    // public static void main(String[] args) throws Exception {
    //     Scanner scn=new Scanner(System.in);
    //     int n=scn.nextInt();
    //     printIncreasing(n);
    //     scn.close();
        
        
    // }

    // public static void printIncreasing(int n){
    //     if(n==0){
    //         return;
    //     }
    //     printIncreasing(n-1);
    //     System.out.println(n);
    // }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        
        for (int j = 0; j < t; j++) {
          int n = scn.nextInt();
    
    
          int count = 0;
          for (int div = 2; div * div <= n; div++) {
            System.out.println(div*div);
            if (n%div == 0) {
              count++;
              break;
            }
          }
        
        if (count == 0) {
          System.out.println("prime");
        }
        else {
          System.out.println("not prime");
        }
      }
      scn.close();
    }
}
