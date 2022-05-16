package Class.Algorigthms.Graph;

import java.util.Comparator;
import java.util.PriorityQueue;
class DSU {
    public int[] parent;
    
    public DSU(int n) {
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }
    
    public int find(int node) {
        int root = node;
        while (root != parent[root]) {
            root = parent[root];
        }
        
        while (node != root) {
            int next = parent[node];
            parent[node] = root;
            node = next;
        }
        
        return root;
    }
    
    public boolean union(int node1, int node2) {
        int root1 = find(node1);
        int root2 = find(node2);
        if (root1 == root2) {
            return false;
        }
        parent[root1] = root2;
        return true;
    }
}

class Edge {
    public int point1;
    public int point2;
    public int cost;
    
    public Edge(int point1, int point2, int cost) {
        this.point1 = point1;
        this.point2 = point2;
        this.cost = cost;
    }
}

class EdgeComparator implements Comparator<Edge>{ 
    public int compare(Edge e1, Edge e2) { 
        return e1.cost - e2.cost;
    } 
} 


class Solution {
    public int minCostConnectPoints(int[][] points) {
        // Kruskal's algorithm
        int n = points.length;
        PriorityQueue<Edge> pq = new PriorityQueue<Edge>(new EdgeComparator());
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int cost = Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]); 
                Edge e = new Edge(i, j, cost);
                pq.add(e);
            }
        }
        
        DSU dsu = new DSU(n);
        int res = 0;
        while (!pq.isEmpty()) {
            Edge e = pq.poll();
            if (dsu.union(e.point1, e.point2)) {
                    System.out.println(e.cost);
                res += e.cost;
            }
        }
        return res;
    }
}