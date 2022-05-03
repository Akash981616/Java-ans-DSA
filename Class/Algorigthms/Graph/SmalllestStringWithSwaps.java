import java.util.*;
class Solution {
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
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
            int n=pairs.size();
            if(n==0)return s;
            UnionFind uf=new UnionFind(s.length());
            HashMap<Integer,PriorityQueue<Character>>map=new HashMap<>();
            
           for(List<Integer>pair:pairs ){
                   uf.union(pair.get(0),pair.get(1));     
           }
            
              for (int i = 0; i < s.length(); ++i)
      map.computeIfAbsent(uf.find(i), k -> new PriorityQueue<>()).add(s.charAt(i));
            
            
            StringBuilder ans=new StringBuilder();
            for(int i=0;i<s.length();i++){
                ans.append(map.get(uf.find(i)).remove());
           }
            
            
        return ans.toString();
    }
}