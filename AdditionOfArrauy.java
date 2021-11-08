import java.util.*;
public class AdditionOfArrauy {
    public static void main(String[] args) throws Exception {
     Scanner scn=new Scanner(System.in);
     int n1=scn.nextInt();
     int a1[]=new int[n1];
     for (int i = 0; i <a1.length; i++) {
         a1[i]=scn.nextInt();
     }
     int n2=scn.nextInt();
     int a2[]=new int[n2];
     scn.close();
     for (int j= 0; j <a1.length; j++) {
         a2[j]=scn.nextInt();
       
         }
         int sum[]=new int[n1>n2?n1:n2];
         int c=0;
         int i=a1.length-1;
         int j=a2.length-1;
        int k =sum.length-1;

        while(i>=0||j>=0){
            int d=c;
            if(i>=0){
                d+=a1[i];

            }
            if(j>=0){
                d+=a2[j];

            }
            c=d/10;
            d=d%10;
            sum[k]=d;
             i--;
            j--;
            k--;


        }
           if(c>0)System.out.println(c);
           for (int x:sum) {
               System.out.println(x);
               
           }

    }
    

}