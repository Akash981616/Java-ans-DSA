import java.io.*;
import java.util.*;

public class IsGraphBiprate {
   

   public static void main(String[] args) throws Exception {
     int graph[][]= {{1,2,3},{0,2},{0,1,3},{0,2}};

     
 
             int n = graph.length;
             int colors[] = new int[n];
 
             
             for (int i = 0; i < n; i++) {
                 if (colors[i] == 0 && !dfs(i, colors, graph, 1))
                 System.out.println("false");
             }
             System.out.println("true");
      
            }
 
         static boolean dfs(int i, int[] colors, int[][] graph, int color) {
             if (colors[i] == 0) { // if no color added perform below steps
                 colors[i] = color;//add color;
                     System.out.println(colors[i]+"->"+i);
                 for (int x : graph[i]) {
                     if (!dfs(x, colors, graph, -color)) //change color for adjacent vertex.
                         return false;
                 }
             } else {
                     System.out.println(colors[i]+"-"+i);
                 return colors[i] == color;
             }
             return true;
         }
 

}


                        


                        


                        
                                