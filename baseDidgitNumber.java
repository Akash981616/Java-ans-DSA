import java.util.*;
public class baseDidgitNumber {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        // for binary only
        // int n=scn.nextInt();
        // int count=0;
        // int b=scn.nextInt();
        // // int base=binary||decimal||octal||hexadecimal;
        // while(n!=0){
        //   n=n>>1;
        //   count++;
        // }
        // System.out.println(count);
        // formula for any base number;



        // for any base
        int n=scn.nextInt();
        int b=scn.nextInt();
        // int base=binary||decimal||octal||hexadecimal;
        int ans =(int)(Math.log(n)/Math.log(b))+1;
        System.out.println(ans);

    }
}
