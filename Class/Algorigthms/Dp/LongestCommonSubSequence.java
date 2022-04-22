//top down appraoach
class Solution {    
        int dp[][];
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        dp=new int[text1.length()][text2.length()];
       return longestCommonSubsequence(text1,text2,0,0);
        
    }
       private int longestCommonSubsequence(String text1, String text2, int i, int j) {
        if (i == text1.length() || j == text2.length())
            return 0;
        
        if (dp[i][j] !=0)
            return dp[i][j];
            
        if (text1.charAt(i) == text2.charAt(j))
            return dp[i][j] = 1 + longestCommonSubsequence(text1, text2, i + 1, j + 1);
        
            return dp[i][j] = Math.max(
                longestCommonSubsequence(text1, text2, i + 1, j),
                longestCommonSubsequence(text1, text2, i, j + 1));
          
    }
}
//bottom down approach
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
       int dp[][]=new int[n+1][m+1];
            for(int i=1;i<=n;i++){
                    for(int j=1;j<=m;j++){
                            if(text1.charAt(i - 1) == text2.charAt(j - 1)){
                                    dp[i][j]=1+dp[i-1][j-1];
                            }else{
                                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                            }
                    }
            }
        return dp[n][m];
    }
}
// most optimized 
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
       int prev=new int[n+1];
       int curr=new int[m+1];
            for(int i=1;i<=n;i++){
                    for(int j=1;j<=m;j++){
                            if(text1.charAt(i - 1) == text2.charAt(j - 1)){
                                    curr[j]=1+curr[j-1];
                            }else{
                                    curr[j]=Math.max(curr[j-1],curr[j]);
                            }
                    }
                    prev=curr;
            }
        return prev[m];
    }
}