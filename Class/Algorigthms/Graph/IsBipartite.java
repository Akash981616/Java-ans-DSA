package Class.Algorigthms.Graph;

public class IsBipartite {
        public static void main(String[] args) {
                int graph[][] = { { 1, 3 }, { 0, 2 }, { 1, 3 }, { 0, 2 } };
                System.out.println(isBipartite(graph));
        }
       public static boolean isBipartite(int[][] graph) {
            int n=graph.length;
            int color[]=new int[n];
            for(int i=0;i<n;i++){
                    if (color[i] == 0) {
                            if (!dfs(graph, color, i, 1))
                                    return false;
                    }
            }
            return true;
    }

    private static boolean dfs(int graph[][], int color[], int node, int cl) {
            System.out.println(cl);
                if(color[node]!=0){
                        return color[node]==cl;
                }
                color[node]=cl;
                for(int nei:graph[node]){
                        if(!dfs(graph,color,nei,-cl))return false;
                }
            return true;
        } 
}
