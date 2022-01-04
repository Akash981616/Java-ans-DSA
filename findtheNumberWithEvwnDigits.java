import java.util.*;


/**
 * findtheNumberWithEvwnDigits
 */
public class findtheNumberWithEvwnDigits {
public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int arr[]=new int[n];
    for (int i = 0; i < arr.length; i++) {
        arr[i]=scn.nextInt();
    }
    int count=findEvenNumbers(arr);
    System.out.print(count);
    scn.close();
}
   public static int  findEvenNumbers(int []arr){
       int count =0;
       int digits=0;
       for(int element:arr){
             digits=digit(element);
             if (digits%2==0) {
                 count++;
                 
             }
       }
    return count;
   }
private static int digit(int element) {
    int count =0;
    while (element>0) {
        element=element/10;
        count ++;
        
        
    }
    return count;
    // second  fast  trick for number of digits
    // if(element<0){
    //     element=element*-1;
    // }
    // return (int)(Math.log10(element))+1;
}


}