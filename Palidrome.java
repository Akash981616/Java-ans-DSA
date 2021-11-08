import java.util.Scanner;
public class Palidrome {
    public static void main(String[] args) {
        Scanner scn =new Scanner (System.in);
        String str=scn.next();
        Solution(str);
        scn.close();
    }

    private static void Solution(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <=str.length(); j++) {
                if (isPalindrome(str.substring(i, j))) {
                    System.out.print(str.substring(i,j));
                }

                System.out.println(str.substring(i,j));
            }
            
        }
    }

    private static boolean isPalindrome(String substring) {
        int i=0;
        int j=substring.length()-1;
        while(i>j){
            if(substring.charAt(i)!=substring.charAt(j)){
                return false;

            }
        }
        
        return true;
    }
}
