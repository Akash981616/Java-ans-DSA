package Class.Algorigthms.Graph;

public class regionCutBySlashes {
    class Solution {
   public class UnionFind{
        int[] par;
        int[] rank;
        int count;
        UnionFind(int vtces){
            par=new int[vtces];
            rank=new int[vtces];
            count=1;
            for(int i=0;i<vtces;i++){
                par[i]=i;
            }
        }
        int find(int X){
            if(par[X]==X){
                return X;
            }
            return par[X]=find(par[X]);
        }
        void union(int x,int y){
            int rootv1=find(x);
            int rootv2=find(y);
            if(rootv1!=rootv2){
                int rankv1=rank[x];
                int rankv2=rank[y];
                
                if(rankv1>rankv2){
                    par[rootv2]=rootv1;
                }else if(rankv1<rankv2){
                    par[rootv1]=rootv2;
                }else{
                    par[rootv2]=rootv1;
                    rank[rootv1]++;
                }
            }else{
                count++;
            }
        }
    }
    public int regionsBySlashes(String[] grid) {
            int n=grid.length;
    int dot=n+1;
    UnionFind uf=new UnionFind(dot*dot);
            for(int i=0;i<n+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0 && j==0){
                    continue;
                }
                if(i==0 || j==0 || i==n || j==n){
                    uf.union(0,i*(n+1)+j);
                }
            }
        }
        for(int i=0;i<grid.length;i++){
            char []ch=grid[i].toCharArray();
            for(int j=0;j<ch.length;j++){
                if(ch[j]=='/'){
                   uf.union(i*dot+j+1,(i+1)*dot+j); 
                }else if(ch[j]=='\\'){
                    uf.union(i*dot+j,(i+1)*dot+(j+1)); 
                }
            }
        }

    return uf.count;
  }
}
}
