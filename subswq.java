import java.util.*;
public class subswq {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        String str=scn.next();
        printSS(str,"");
        scn.close();
    }

    private static void printSS(String str,String ans) {
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=str.charAt(0);
        String ros=str.substring(1);
        printSS(ros,ans+"");
        printSS(ros,ans+ch);
        

    }
    
}
