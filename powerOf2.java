import java.util.Scanner;

public class powerOf2 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n=scn.nextInt();
        int count=0;
        while (n!=0) {

            int last=n&1;

           if(last==1){
               count++;
           }
           n=n>>1;

            
        }
       System.out.println(count);
       scn.close();

    }
}
