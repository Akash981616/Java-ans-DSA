package Tree;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {

  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] st = br.readLine().split(" ");
    int n = Integer.parseInt(st[0]);
    int m = Integer.parseInt(st[1]);

    int[][] grid = new int[n][m];

    for (int i = 0; i < n; i++) {
      st = br.readLine().split(" ");
      for (int j = 0; j < m; j++) {
        grid[i][j] = Integer.parseInt(st[j]);
      }
    }

    System.out.println(orangesRotting(grid));

  }

  public static class Pair {
    int row;
    int col;

    Pair(int row, int col) {
      this.row = row;
      this.col = col;
    }

  }

  public static int orangesRotting(int[][] grid) {
for(int i = 0 ; i<grid.length ; i++){
for(int j = 0 ; j<grid[i].length ; j++){
if(grid[i][j] == 2){
dfs(grid,i,j,2);
}
}
}
int max = 0 ;
for(int i = 0 ; i<grid.length ; i++){
for(int j = 0 ; j<grid[i].length ; j++){
if(max<grid[i][j]){
max = grid[i][j];
}
if(grid[i][j] == 1){
return -1;
}
}
}
if(max == 0)
return max;
else
return max-2;
}
public static void dfs(int[][] grid , int i , int j , int count){
if(i<0 || i>=grid.length || j<0 || j>= grid[i].length || grid[i][j]==0 || grid[i][j]<count && grid[i][j]!=1){
return;
}
grid[i][j]=count;
dfs(grid,i+1,j,count+1);
dfs(grid,i-1,j,count+1);
dfs(grid,i,j+1,count+1);
dfs(grid,i,j-1,count+1);
}

}