import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt){
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for(int i = 0; i < vtces; i++){
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for(int i = 0; i < edges; i++){
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }

      int src = Integer.parseInt(br.readLine());
      int dest = Integer.parseInt(br.readLine());

      boolean visited[]=new boolean[vtces];
      System.out.print(hasPath(graph,src,dest,visited));
    }

  public static boolean hasPath(ArrayList<Edge> graph, int src, int dest, boolean[] visited) {
  //base case
  if (src == dest)
    return true;

  //setting the value corresponding to src in visited as true.
  visited[src] = true;
  //applying for loop to access each neighbor of src
  for ( ArrayList <Edge> e : graph[src]) {
    //checking whether this neighbor has been visited or not.
    if (!visited[e.nbr]) {
      //if not than a recursive call is made to this neighbor and result is stored
      boolean nbrHasPath = hasPath(graph, e.nbr, dest, visited);
      //if result is true than true is returned.
      if (nbrHasPath)
        return true;
    }
  }
  //if control reaches this point than it means that none of the neighbor has a path
  //to reach the destination, so we false is returned.
  return false;
}}