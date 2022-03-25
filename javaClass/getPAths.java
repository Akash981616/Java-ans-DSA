package javaClass;

import java.util.*;
class Solution {
    class Pair{
            int row;
            int col;
            Pair(int row,int col){
            this.row=row;
            this.col=col;
            }
    }
public int shortestBridge(int[][] grid) {
        int count =0;
        LinkedList<Pair>q=new LinkedList<>();
        for(int i=0;i<grid.length;i++){
          for(int j=0;j<grid[0].length;j++){
             if(grid[i][j]==1){
                     count++;
                     getIslands(grid,i,j,q);          
             }          
          } }   
                if(count==0)return 0;
                int dirs[][]={{-1,0},{0,1},{1,0},{0,-1}};
                int level=0;
                while(!q.isEmpty()){
                        level++;
                        int size=q.size();
                        while(size-->0){
                              Pair rem=q.removeFirst();
                                int r=rem.row;
                                int c=rem.col;
                                for(int dir[]:dirs){
                                        r=r+dir[0];
                                        c=c+dir[1];
                              if(r>=0&&c>=0&&c>=grid[0].length-1&&r>=grid.length-1&&grid[r][c]!=-1){
                                      if(grid[r][c]==1){
                                              return level;
                                      }else{
                                             grid[r][c]=-1; 
                                              q.addLast(new Pair(r,c));
                                      }
                                      
                              }
                                }
                                
                        }
                }
               
        
        return level;
}
    public void getIslands(int [][]grid,int i,int j,LinkedList<Pair>q){
            if(i>=0&&j>=0&&j>=grid[0].length-1&&i>=grid.length-1&&grid[i][j]!=0){
                    grid[i][j]=-1;
                    q.addLast(new Pair(i,j));
                    getIslands(grid,i+1,j,q);
                    getIslands(grid,i-1,j,q);
                    getIslands(grid,i,j+1,q);
                    getIslands(grid,i,j-1,q);
            }
            return;
    }
}