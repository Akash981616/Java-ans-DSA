import java.util.*;
public class laegetInterger {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int digits[]=new int [n];
        for (int i = 0; i <digits.length; i++) {
            digits[i]=scn.nextInt();
            
        }
        int[] res=plusOne(digits);
        for(int x:res)
        System.out.println(x);

        scn.close();
    }
    public static int[] plusOne(int[] digits) {
        if(digits.length == 0) return digits;
        for(int i = digits.length-1;i>=0;i--){
            //if the last element in the array is smaller than 9 then we basically increment by 1 and return             //the digits array.
            if(digits[i] < 9){
                digits[i]++;
                
                return digits;
            }
            //if the last element in the array is 9 or larger than 9 then after incrementing the element become
            //become double digit element then we have to seperate the digits and place it
            //into the array and then return.
            digits[i] = 0;
        }
        int[] res = new int[digits.length+1];
        res[0] = 1;
        return res;
    }
    
}
