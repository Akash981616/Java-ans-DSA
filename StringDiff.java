import java.util.Scanner;

public class StringDiff {  
    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    String ch=scn.next(); 
    System.out.println(solution(ch));
    scn.close();
}
public static String solution(String ch) {
    StringBuilder ans=new StringBuilder(); 
    ans.append(ch.charAt(0));
     for (int i = 1; i < ch.length(); i++) {
         char curr=ch.charAt(i);
         char prev=ch.charAt(i-1);
         int gap=curr-prev;
         ans.append(curr);
         ans.append(gap);
     }
    return ans.toString();
}
   
}
