import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class largerAreaHistogram {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
           a[i] = Integer.parseInt(br.readLine());
        }
    
        int rb[]=new int[a.length];
        int lb[]=new int [a.length];
        Stack<Integer>st=new Stack<>();
        rb[lb.length-1]=n;
        st.push(n-1);
         for (int i = a.length-2; i >= 0; i--) {
            while (st.peek()>0&&a[i]<=a[st.peek()]) {
               st.pop();
            }
            if (st.peek()==0) {
               rb[i]=st.peek();
               
            } else {
               rb[i]=n;
            }
            st.push(i);
         }
         lb[0]=-1;
        st.push(-1);
        for (int i = 1; i < n; i++) {
           while (st.peek()>0&&a[i]<=st.peek()) {
              st.pop();
              
           }
           if (st.size() > 0) {
            rb[i] = st.peek();
          } else {
            rb[i] = -1;
          }
          st.push(i);
        }
        int maxArea=0;
        for (int i = 0; i <n; i++) {
           int width=rb[i]-lb[i]-1;
           int area=a[i]*width;
           if(area>maxArea){
              maxArea=area;
           }
           
        }
        System.out.println(maxArea);
     }
   
     
}
