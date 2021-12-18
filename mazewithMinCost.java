import java.util.*;/**
 * mazewithMinCost
 */
public class mazewithMinCost {
public static void main(String[] args) {

Scanner scn = new Scanner(System.in);
int n = scn.nextInt();
int m = scn.nextInt();
int[][]arr = new int[n][m];
for (int i = 0; i < n; i++) {                  //1
  for (int j = 0; j < m; j++) {
    arr[i][j] = scn.nextInt();
  }
}

int[][]dp = new int[n][m];                   //2
for (int i = n - 1; i >= 0; i--) {           //3
  for (int j = m - 1; j >= 0; j--) {       //4
    if (i == n - 1 && j == m - 1) {      //5
      dp[i][j] = arr[i][j];
    }
    else if (i == n - 1) {          //6
      dp[i][j] = arr[i][j] + dp[i][j + 1];
    }
    else if (j == m - 1) {               //7
      dp[i][j] = arr[i][j] + dp[i + 1][j];
    }
    else {                               //8
      int min = Math.min(dp[i + 1][j], dp[i][j + 1]);
      dp[i][j] = arr[i][j] + min;
    }
  }
}
System.out.println(dp[0][0]);                //9

scn.close();

}
    
}