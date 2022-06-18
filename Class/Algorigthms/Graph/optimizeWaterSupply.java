import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] st = br.readLine().split(" ");
    int v = Integer.parseInt(st[0]);
    int e = Integer.parseInt(st[1]);

    int[] wells = new int[v];
    String[] words = br.readLine().split(" ");

    for (int i = 0; i < wells.length; i++) {
      wells[i] = Integer.parseInt(words[i]);
    }

    int[][] pipes = new int[e][3];
    for (int i = 0; i < e; i++) {
      String[] st1 = br.readLine().split(" ");
      pipes[i][0] = Integer.parseInt(st1[0]);
      pipes[i][1] = Integer.parseInt(st1[1]);
      pipes[i][2] = Integer.parseInt(st1[2]);

    }

    System.out.println(minCostToSupplyWater(v, wells, pipes));

  }
  
    static int par[];
   public static int find(int u){
       return par[u]==u?u:(par[u]=find(par[u]));
   }

   public static int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {

     par = new int[n + 1];

     for (int i = 0; i <= n; i++) {
       par[i] = i;
     }

     List<int[]> graph = new ArrayList<>();
     for (int p[] : pipes) {
       graph.add(p);
     }

     for (int i = 0; i < wells.length; i++) {
       graph.add(new int[] { 0, i + 1, wells[i] });
     }
     Collections.sort(graph, (a, b) -> a[2] - b[2]);

     int cost = 0;
     for (int pip[] : graph) {
       int u = pip[0];
       int v = pip[1];
       int w = pip[2];
       int p1 = find(u);
       int p2 = find(v);
       if (p1 != p2) {
         par[p1] = p2;
         cost += w;
       }

     }

     return cost;
   }
  
}
