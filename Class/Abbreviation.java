

import java.io.*;
import java.util.*;

public class Abbreviation {

    public static void solution(String str, String asf,int count, int pos){
      if(pos==str.length()){
          if(count>0){
              asf+=count;
          }
          System.out.println(asf);
          return;
      }
      char ch=str.charAt(pos);
      
     solution(str, asf + (count > 0 ? count:"") + ch, 0, pos + 1);
      solution(str,asf,count+1,pos+1);
        
    }
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        solution(str,"",0,0);
    }
    
    
}