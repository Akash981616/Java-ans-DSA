class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int length = cost.length;
     int one=cost[0];
            int two=cost[1];
        for (int i=2;i<length;i++){
                int current=Math.min(one,two)+cost[i];
                 one=two;
                two=current;
        } 
        return Math.min(one,two);
     }
    //  tabulation /
    //  public int minCostClimbingStairs(int[] cost) {
    //     int length = cost.length;
    //  int dp[]=new int[length+1];
    //     for (int i=0;i<length;i++){
    //         if (i == 0 || i == 1)
    //             dp[i] = cost[i];
    //         else
    //             dp[i] = Math.min(dp[i-1], dp[i-2]) + cost[i];
    //     } 
    //     return Math.min(dp[length-1], dp[length-2]);
    //  }
}
