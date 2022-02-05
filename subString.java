import java.io.*;

import java.util.*;

public class subString {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    String p="";
    ArrayList< String> res = gss(str,p);
    System.out.println(res);
  }

  //bc ->  [ --,-c ,b-, bc ]
  //abc->  [ ---,--c, -b-, -bc, a--,ab-,abc]

  public static ArrayList< String> gss(String str,String p) {
    if (str.isEmpty()) {
      ArrayList< String> list = new ArrayList< >();   
      list.add(p) ;//1
      return list;
    }
    char ch = str.charAt(0);                                      //2
    String ros = str.substring(1);                                //3
    ArrayList< String> right=gss(ros,p);
    
    ArrayList< String> left=gss(ros,p+ch);
    
    left.addAll(right);
    return left ;                                                  //8
  }

}