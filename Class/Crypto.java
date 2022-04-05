package Class;
import java.util.*;
public class Crypto {
 
    
    String ans;
    static String str1 = "send", str2 = "more", str3 = "money";
    static boolean[] isNumUsed = new boolean[10];
    static int ch[]=new int[26];
    public static void crypto() {
      String str=str1+str2+str3;
      for(char s:str.toCharArray()){
          ch[s-'a']++;
      }
      String nstr ="";
      for(int i=0;i<26;i++){
          if(ch[i-'a']>0){
              nstr+=(char)ch[i+'a'];
          }
      }
      System.out.println(crypto());
    }
    private static 
    public static void main(String[] args) {
        crypto();
    }
}
