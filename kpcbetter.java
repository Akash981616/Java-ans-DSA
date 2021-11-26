import java.util.*;
public class kpcbetter {
    /**
     *
     */
  

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
         kpc(str,"");
        scn.close();


    }
    
    static String[] codes = {"*", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx","yz"};

    private static void kpc(String str,String ans) {
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=str.charAt(0);
        String res=str.substring(1);
        // String codeforc=codes[ch-'o']; 
        for(char chcode: codes[ch - 48].toCharArray()){
            kpc(res,ans+chcode);
            
        }
        
    }
    
}
