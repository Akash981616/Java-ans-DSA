public class colorBorder {
    public static void main(String[] args) {
    int grid[][]={{1,1,1},{1,1,1},{1,1,1}};
    int color=2;
    int row=1;
    int col=1;
   System.out.print(colorBorder(grid,row,col,color)); 
}
    
    public static int[][] colorBorder(int[][] grid, int i, int j, int color) {
        if(grid[i][j]==color){
            return grid ;
          }
          int n=grid.length;
          int m=grid[0].length;
          int old=grid[i][j];
          
          boolean visited[][]=new boolean[n][m];
          dfs(grid,i,j,color,visited,old,n,m);
         return grid;
        }
        public static void dfs(int grid[][],int i,int j,int color,boolean visited[][],int old,int n,int m){
          if(i<0||j<0||j>=m||i>=n||grid[i][j]!=old||visited[i][j]) return ;
          visited[i][j]=true;
          boolean border=false;
          if(i==0||j==0||i==n||j==m||grid[i-1][j]!=old||grid[i+1][j]!=old||grid[i][j+1]!=old||grid[i][j-1]!=old) border=true;
          dfs(grid,i+1,j,color,visited,old,n,m);
          dfs(grid,i-1,j,color,visited,old,n,m);
          dfs(grid,i,j+1,color,visited,old,n,m);
          dfs(grid,i,j-1,color,visited,old,n,m);
          if(border){
            grid[i][j]=color;
          }
        }
}