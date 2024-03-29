import java.util.*;
public class climStairsvariabletab {

       public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
          arr[i] = scn.nextInt();
        }
        scn.close();
        int[] dp = new int[n + 1];
        dp[n] = 1;
    
        for (int i = n - 1; i >= 0; i--) {
            for (int reach = i + 1; reach <= Math.min(n, i + arr[i]); reach++) {
              dp[i] += dp[reach];
            }
          }
        
        System.out.println(dp[0]);
    
      }
    

}
