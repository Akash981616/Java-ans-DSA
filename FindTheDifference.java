import java.io.*;
import java.util.*;
class Solution {

    private static char findTheDifference;


    public static void main(String[] args) {
        String s="";
        String t="";
      char c=  findTheDifference(s,t);
       char ch= findTheDifference = findTheDifference(s,t);
    }
    // using BitManipulation
public static char findTheDifference(String s, String t) {
        char ch[]=s.concat(t).toCharArray();
        char diff=0;
        for(char c:ch){
            diff^=c;
        }
return diff;
}
// }


            // using Hashset
// class Solution {
    public static char findTheDifference(String s, String t) {
        

            HashSet<Character> map = new HashSet<Character>();
    
        for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                map.add(ch);
        }
            for(int j=0;j<t.length();j++){
                    char ct=t.charAt(j);
                    if(!map.contains(ct)){
                           return ct;
                    }
                
            }
           return  'a';
    }
}