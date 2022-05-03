package Class.Algorigthms.Graph;

import java.util.*;
public class pep {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int cost = scn.nextInt();
        char[][] cloth = new char[n][m];
        for(int i = 0; i < n; i ++) {
            for(int j = 0; j < m; j ++) {
                cloth[i][j] = scn.next().charAt(0);
            }
        } 
        List<Integer> ans = getPrice(cloth, cost);
        Collections.sort(ans);
        System.out.println(ans);
        scn.close();
    }   

    public static  List<Integer> getPrice(char[][] grid, int cost) {
int dirs[][]={{0,1},{1,0},{-1,0},{0,-1}};
      List<Integer> res = new ArrayList<>();
      int n=grid.length;
      int m=grid[0].length;
      for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
              if(grid[i][j]!='w'){
                int val=dfs(i,j,grid,dirs,grid[i][j]);
                 val=val*cost;
                 res.add(val);
                  
              }
          }
      }
     return res;

    } 
    public static int dfs(int i,int j,char grid[][],int[][] dir2,char oldcolor){
        int count=0;
        grid[i][j]='w';
        for(int dir[]:dir2){
            int x=i+dir[0];
            int y=j+dir[1];
            if(x>=0 && y>=0 && x<grid.length && y<grid[0].length && grid[x][y]==oldcolor ){
                count+=dfs(x,y,grid,dir2,oldcolor)+1;
            }
        }
      return count;
    }
}
