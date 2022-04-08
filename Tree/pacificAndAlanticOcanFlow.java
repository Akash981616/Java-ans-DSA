package Tree;

import java.util.*;
class Solution {
        int n;
        int m;
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
             n=heights.length;
             m=heights[0].length;
            
            boolean Pacific[][]=new boolean [n][m];
            boolean Atlantic[][]=new boolean[n][m];
            
           int dirs[][]={{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
            for(int i=0;i<n;i++){
                    dfs(heights,Pacific,i,0,dirs);
                     dfs(heights,Atlantic,i,m-1,dirs);
                    
            }
            for(int i=0;i<m;i++){
                   dfs(heights,Pacific,0,i,dirs);
                   dfs(heights,Atlantic,n-1, i,dirs); 
            }
            
            
            List<List<Integer>> res=new ArrayList<>();
            
            for(int i=0;i<n;i++){
                    for(int j=0;j<m;j++){
                            if(Pacific[i][j]&&Atlantic[i][j])res.add(Arrays.asList(i,j));
                    }
            }
            
            return res;
    }
        public void dfs(int [][]matrix,boolean ocean[][],int i,int j,int dirs[][]){
                  ocean[i][j]=true;
                for(int dir[]:dirs){
                        int newRow =i+dir[0];
                        int newCol=j+dir[1];
                         if(newRow<0 || newRow>= n || newCol<0||newCol>=m || ocean[newRow][newCol] ||                                        matrix[newRow][newCol]<matrix [i][j])continue;
                         dfs(matrix,ocean,newRow,newCol,dirs);

                }
        }
}