package javaClass;

import java.io.*;
import java.util.*;

public class KnigthTour {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sr = Integer.parseInt(br.readLine());
        int sc = Integer.parseInt(br.readLine());
    int[][]dir = {{-2,1},{-1,2},{1,2},{2,1},{2,-1,},{1,-2},{-1,-2},{-2,-1}};

        int[][] chess = new int[n][n];
        printKnightsTour(chess,sr,sc,1,dir);
    }

   
          public static void printKnightsTour(int[][] chess, int sr, int sc, int uc,int[][]dir) {
         if(uc==chess.length*chess.length) {
           chess[sr][sc] = uc;
           displayBoard(chess);
           chess[sr][sc] = 0;
           return;
          }
          chess[sr][sc] = uc;
         for(int d = 0;d<dir.length;d++){
           int r = sr + dir[d][0];
           int c = sc + dir[d][1];
           if(r<0||r>=chess.length||c<0||c>=chess[0].length||chess[r][c]!=0)continue;
            printKnightsTour(chess,r,c,uc+1,dir);
          }
        chess[sr][sc] = 0;
        }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}

class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length, ans = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                pq.add(new int[]{ findDist(points, i, j), i, j });
            }
        }
        int count = 0;
        UnionFind uf = new UnionFind(n);
        while(count < n-1) {
            int[] edge = pq.poll();
            if(uf.find(edge[1]) != uf.find(edge[2])) {
                ans += edge[0];
                count++;
                uf.union(edge[1], edge[2]);
            }
        }
        return ans;
    }
    private int findDist(int[][] points, int a, int b) {
        return Math.abs(points[a][0] - points[b][0]) + Math.abs(points[a][1] - points[b][1]);
    }
    class UnionFind {   
        int[] parent;
        UnionFind(int n) {
            this.parent = new int[n];
            for(int i = 0; i < n; i++) parent[i] = i;
        }		
        public void union(int a, int b) {
            parent[find(a)] = parent[find(b)];
        }
        public int find(int x) {
            if(parent[x] != x) parent[x] = find(parent[x]);
            return parent[x];
        }
    }

                        


                        
                        
                                
                                