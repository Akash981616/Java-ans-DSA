import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class SlidingWindow {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new
                                               InputStreamReader(System.in));
    
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
          arr[i] = Integer.parseInt(br.readLine());
        }
        // int k = Integer.parseInt(br.readLine());
        int nge[]=new int[arr.length];
        Stack <Integer>st=new Stack<>();
        st.push(arr.length-1);
        nge[arr.length-1]=arr.length;
        for (int index = arr.length-2; index >=0; index--) {
            while(st.peek()>0&&arr[index]>=arr[st.peek()]){

            }
            
        }
    }
}
