import java.util.*;
/**
 * printEncodings
 */
public class printEncodings {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        printEncoding(str,"");
        scn.close();
    }

    private static void printEncoding(String str, String ans) {
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        else if(str.length()==1) {
          char ch=str.charAt(0);
          if (ch=='0') {
              return;
          }else{
              int chv=ch-'0';
              char code=(char )('a'+chv-1);
              ans=ans+code;

              System.out.println(ans);

          }
          
                
            
        }
        else{
            char ch=str.charAt(0);
            String ros=str.substring(1);
            if (ch=='0') {
                return;
            }else{
                int chv=ch-'0';
                char code=(char )('a'+chv-1);
                
                printEncoding(ros, ans+code);

  
            }
            

        }
        String ch12=str.substring(0,2);
            String ros=str.substring(1);
            int ch12v=Integer.parseInt(ch12);
            if(ch12v<=26){
                char code=(char )('a'+ch12v-1);
                printEncoding(ros, ans+code);

            }
    }
}