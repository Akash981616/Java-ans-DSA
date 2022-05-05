import java.util.Arrays;

class Solution {
        int dirs[][]={{1,0},{0,1}};
    public int calculateMinimumHP(int[][] grid) {
            int n=grid.length;
            int m=grid[0].length;
            int dp[][]=new int [n][m];
              for(int d[]:dp){
                   Arrays.fill(d,-1);
               
           }
            int min= f(grid, 0, 0,dp);
          
           for(int d[]:dp){
                   for(int x:d){
                           System.out.print(x+" ");
                   }
                   System.out.println();
           }
               return min;
    }
    
    public int f(int[][] dungeon, int n, int m,int dp[][]) {
        if (n >= dungeon.length || m >= dungeon[0].length)
            return Integer.MAX_VALUE;
        
        if (n == dungeon.length - 1 && m == dungeon[0].length - 1)
            return Math.max(1, 1 - dungeon[n][m]);
        
        if (dp[n][m] != -1)
            return dp[n][m];
        
        int res = Math.min(f(dungeon, n + 1, m,dp), f(dungeon, n, m + 1,dp)) - dungeon[n][m];
        res = Math.max(1, res);
        
        return dp[n][m] = res;
    }
}
class Solutions {
    public int calculateMinimumHP(int[][] dungeon) {
            int n=dungeon.length;
            int m=dungeon[0].length;
            int dp[][]=new int [n][m];
         for(int i=n-1;i>=0;i--){
                for(int j=m-1;j>=0;j--){
                      if(i==n-1&& j==m-1){
                         dp[i][j]=Math.max(1,1-dungeon[i][j]);
                      }else if(i==n-1){
                             dp[i][j]=Math.max(1,dp[i][j+1]-dungeon[i][j]); 
                      }else if(j==m-1){
                                dp[i][j]=Math.max(1,dp[i+1][j]-dungeon[i][j]); 
                      }else{
                        dp[i][j]=Math.max(1,Math.min(dp[i][j+1],dp[i+1][j])-dungeon[i][j]); 
                      }
                 }
                 
         }
            return dp[0][0];
    }
    

}