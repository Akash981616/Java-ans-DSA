import java.util.*;
public class mobilekeypad {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        printkpc(str,"");
        scn.close();
        
    }
    static String[] codes = {"*0", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx","yz"};

    private static void printkpc(String str, String string) {
    if(str.length()==0){
        System.out.println(string);
        return;
    }
        char ch=str.charAt(0);
        String ros=str.substring(1);
      
       for(char chcode: codes[ch - 48].toCharArray()){
        printkpc(ros,string+chcode);
        
    }
        
    }
}
