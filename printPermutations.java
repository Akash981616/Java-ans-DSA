import java.util.*;
public class printPermutations {
    public static void main(String[] args) {
        Scanner scn =new Scanner (System.in);
        String sb=scn.next();
        printPermutation(sb,"");
        scn.close();
    }

    private static void printPermutation(String sb, String ans) {
        if (sb.length()==0) {

            System.out.println(ans);
            return;
        }
            
        
        for (int i = 0; i < sb.length(); i++) {
            char ch=sb.charAt(i);
            String qlpt=sb.substring(0,i);
            String qrpt=sb.substring(i+1);
            String qans=qlpt+qrpt;
            printPermutation(qans,ans+ch);



            
        }
    }
}
