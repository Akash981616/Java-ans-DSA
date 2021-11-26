import java.util.ArrayList;
import java.util.Scanner;
public class subseqInRecursion {
    
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList< String> res = gss(str);
        System.out.println(res);
        scn.close();
      }

    
      //bc ->  [ --,-c ,b-, bc ]
      //abc->  [ ---,--c, -b-, -bc, a--,ab-,abc]
    
      public static ArrayList< String> gss(String str) {
        if (str.length() == 0) {
          ArrayList< String> bres = new ArrayList< >();           //1
          bres.add("");
          return bres;
        }
        char ch = str.charAt(0);                                      //2
        String ros = str.substring(1);                                //3
    
        ArrayList< String> rres = gss(ros);   
        System.out.print(rres);                         //4
        ArrayList< String> mres = new ArrayList< >();                   //5
        for (String val : rres) {
          mres.add("" + val);                                       //6
        }
        for (String val : rres) {
          mres.add(ch + val);                                       //7
        }
    
        return mres;                                                  //8
      }
}
