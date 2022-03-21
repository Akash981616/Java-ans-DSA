import java.util.*;
class Solution {
    public class Pair{
            int row;
            int col;
            Pair(int row,int col){
                    this.row=row;
                    this.col=col;
            }
    }
public int orangesRotting(int[][] grid) {
      LinkedList<Pair>q=new LinkedList<>();
        int n=grid.length;
        int m=grid[0].length;
        int fresh=0;
    for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                   if(grid[i][j]==1){
                           fresh++;
                   }
                    if(grid[i][j]==2){
                           q.addLast(new Pair(i,j));
                    }
            }
    }
        if(fresh==0)return 0;
        int time=0;
         int dirs[][]={{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
                ++time;
                int size=q.size();
                while(size-->0){
                        Pair rem=q.removeFirst();
                        
                        for(int []dir:dirs){
                                int x=rem.row+dir[0];
                                int y=rem.col+dir[1];
                                if(x<0||y<0||x>=n||y>=m||grid[x][y]==2||grid[x][y]==0)continue;
                        
                         grid[x][y]=2;
                         q.addLast(new Pair(x,y));
                         fresh--;
                        }
                }
        }
        
        return fresh==0?time-1:-1;
}
}
