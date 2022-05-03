package Class.Algorigthms.Graph;
import java.util.*;
public class primsWIthDSU {
<<<<<<< HEAD
    class Solution {
        public int minCostConnectPoints(int[][] points) {
            int n = points.length, ans = 0;
            PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    pq.add(new int[] { findDist(points, i, j), i, j });
                }
            }
            ///s
            int count = 0;
            UnionFind uf = new UnionFind(n);
            while (count < n - 1) {
                int[] edge = pq.poll();
                if (uf.find(edge[1]) != uf.find(edge[2])) {
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
                for (int i = 0; i < n; i++)
                    parent[i] = i;
            }

            public void union(int a, int b) {
                parent[find(a)] = parent[find(b)];
            }

            public int find(int x) {
                if (parent[x] != x)
                    parent[x] = find(parent[x]);
                return parent[x];
            }
        }

    }

   
    private class UnionFind {
        int[] component;
        int distinctComponents;
        
        public UnionFind(int n) {
            component = new int[n+1];
            for (int i = 0; i <= n; i++) {
                component[i] = i;
            }
            distinctComponents = n;
        }
        // unite. For example, if previously we have component {0, 4, 4, 4, 4, 6, 7, 7}, then invoke this method with a=1, b=5, then after invoke, {0, 4, 4, 4, 5, 7, 7, 7}
        private boolean unite(int a, int b) {
            if (findComponent(a) != findComponent(b)) {
                component[findComponent(a)] = b;
                distinctComponents--;
                return true;
            }
            
            return false;
        }
        
        // find and change component
        // for example, if previously we have component:{0, 2, 3, 4, 4, 6, 7, 7}, then after invoke this method with a=1, the component become {0, 4, 4, 4, 4, 6, 7, 7}
        private int findComponent(int a) {
            if (component[a] != a) {
                component[a] = findComponent(component[a]);
            }
            return component[a];
        }
        
        private boolean united() {
            return distinctComponents == 1;
        }
        
    }

=======
   class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length, ans = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                pq.add(new int[]{ findDist(points, i, j), i, j });
            }
        }
        ///s
        int count = 0;
        UnionFind uf = new UnionFind(n);
        while(count < n-1) {
            int[] edge = pq.poll();
            if (uf.find(edge[1]) != uf.find(edge[2])) {
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
} 
>>>>>>> f9241e5beda5fa964ecb40d2e93bd8eaf843041c
}
