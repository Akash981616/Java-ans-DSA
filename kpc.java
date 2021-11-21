import java.util.ArrayList;
import java.util.Scanner;
/**
 * kpc
 */
public class kpc {
  
        
        public static void main(String[] args) throws Exception {
            Scanner scn = new Scanner(System.in);
            String str = scn.next();
            ArrayList< String> res = gss(str);
            System.out.println(res);
            scn.close();
          }
    
        
          //bc ->  [ --,-c ,b-, bc ]
          //abc->  [ ---,--c, -b-, -bc, a--,ab-,abc]
          static String[] codes = {"*", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx","yz"};                                                        //#

          public static ArrayList< String> gss(String str) {
            if (str.length() == 0) {
              ArrayList< String> bres = new ArrayList< >();           //1
              bres.add("");
              return bres;
            }
            char ch = str.charAt(0);                                      //2
            String ros = str.substring(1);                                //3
        
            ArrayList< String> rres = gss(ros);                            //4
            ArrayList< String> mres = new ArrayList< >(); 
            String codeforc=codes[ch-'0'];                  //5
            for (int i = 0; i < codeforc.length(); i++) {
                char chod=codeforc.charAt(i);
                for(String rstr:rres){ 
                    mres.add(chod+rstr);
                }
                
            }
            return mres;                                                  //8
          }
    }
    
