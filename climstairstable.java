import java.util.*;
public class climstairstable {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n =scn.nextInt();
       int ans= climbStairsTabulation(n);
       System.out.println(ans);
        }

    private static int climbStairsTabulation(int n) {
        if (n == 0) {
            return 1;
          } else if (n < 0) {
            return 0;
          }
          int[] dp = new int[n + 1];
      
          dp[0] = 1;
          for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1];
            if (i >= 2)
              dp[i] += dp[i - 2];
            if (i >= 3)
              dp[i] += dp[i - 3];
          }
      
          return dp[n];
        }
    
}
