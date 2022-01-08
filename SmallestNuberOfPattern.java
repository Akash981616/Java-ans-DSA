import java.util.*;
/**
 * SmallestNuberOfPattern
 */
public class SmallestNuberOfPattern {
   public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        Stack < Integer>st=new Stack<>();
        int count=1;
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (ch=='d') {
                st.push(count);
                count++;
            }else{
                st.push(count);
                count++;
            while (st.size()>0) {
               System.out.print( st.pop());
            }
            }
            
        }
        st.push(count);
        // count++;
        while (st.size()>0) {
        System.out.print(st.pop());   
        }

        
    scn.close();
    }
    
}