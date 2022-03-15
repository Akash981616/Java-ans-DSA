import java.util.*;
//Mehod 1  short and good code TN=0(N) SC=O(N)
class Solution {
    public String minRemoveToMakeValid(String s) {
         int close=0;
            StringBuilder ans=new StringBuilder();
            for(char c:s.toCharArray()){
                    if(c==')')close++;
            }
            int open=0;
            for(char c:s.toCharArray()){
                    if(c=='('){
                            if(open==close)continue;
                            open++;
                           
                    }else if(c==')'){
                             close--;
                            if(open==0)continue;
                            open--;
                            
                    }
                    ans.append(c);
            }

       return ans.toString();    
   }
}
public class ValidParanthisiString {
    public static void main(String[] args) {
        String s="lee(t(c)o)de)";
        System.out.println(minRemoveToMakeValid(s));
    }
    //method 3 good apparoach 
    public  static String minRemoveToMakeValid(String s) {
       
                 int open=0;
                    StringBuilder ans=new StringBuilder();
                    for(char c:s.toCharArray()){
                            if(c=='(')open++;
                                    else if(c==')'){
                                            if(open==0)continue;
                                            open--;
                                    }
                            ans.append(c);
                    }
                    System.out.println(open);
                    StringBuilder result=new StringBuilder();
                    for(int i=ans.length()-1;i>=0;i--){
                            char c=ans.charAt(i);
                            if(c=='('&&open>0){
                                    open--;
                                   continue;
                            }
                            result.append(c);
                    }
                    return result.reverse().toString();
        
 }
}
//method  2 with stack  TN=0(N) SC=O(N)
class Solution {
    public String minRemoveToMakeValid(String s) {
           char ch[]=s.toCharArray();
            Stack<Integer>stack=new Stack<>();
            StringBuilder ans=new StringBuilder();
            for(int i=0;i<ch.length;i++){
                  if(ch[i]=='('){
                          stack.push(i);
                  }else if(ch[i]==')'){
                          if(!stack.isEmpty()){
                                  stack.pop();
                          }
                          else ch[i]='$';
                  }
            }
       while(!stack.isEmpty()){
               int idx=stack.pop();
               ch[idx]='$';
       }
            for(int i=0;i<ch.length;i++){
                    if(ch[i]!='$')ans.append(ch[i]);
            }
       return ans.toString();    
   }
}




