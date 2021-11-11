import java.util.Scanner;
public class DuplicateString {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        String str=scn.next();
       scn.close();
        System.out.println(Compersion(str));
       System.out.println(Compersion2(str));
    
}

    private static String Compersion2(String str) {
        String ans="";
        int count=1;
        for(int i = 0 ; i < str.length(); i++){
		while (i<str.length()-1&&str.charAt(i)==str.charAt(i+1)) {
            i++;
            count++;
            
        }
        ans+=str.charAt(i);
      if (count>1) {
         ans+=count;
         count=1;
          
      }
        
		}
        return ans;
    }

       private static String Compersion(String str) {
        String ans="";
        for(int i = 0 ; i < str.length(); i++){
		while (i<str.length()-1&&str.charAt(i)==str.charAt(i+1)) {
            i++;
            
        }
        ans+=str.charAt(i);
		}
       
        return ans;
    }

   
    
}

