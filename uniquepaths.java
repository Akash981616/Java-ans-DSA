import java.util.*;
// https://leetcode.com/problems/unique-paths/submissions/
class Solution {
    public static void main(String[] args) {
        int n=0;
        int m=0;
       uniquePaths(m,n);
        uniquePaths(m,n);
    }
    // iterative
    public int uniquePaths(int m, int n) {
            int dp[][]=new int[m][n];
               for(int i = 0; i < m; i++){
                for(int j=0;j<n;j++){
                  if(i==0||j==0){
                          dp[i][j]=1;
                  }else{
                        dp[i][j] = dp[i][j-1] + dp[i-1][j];
                  }
                }     
            }  
            return dp[m-1][n-1];
   } 
//    recursive 
// but timeEceeds
   public int uniquePaths(int m, int n) {
    // base case
    if(m == 1 || n == 1) return 1;
    
    // move down
    int downMove = uniquePaths(m-1, n);
    // move right
    int rightMove = uniquePaths(m, n-1);
    
    return downMove + rightMove;
}
}

   
