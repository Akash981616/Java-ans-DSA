//TC(N) => log*(n)
public class DSUPathCompress {
    int par[];
    int size[];

    DSUPathCompress(int n) {
        par = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
            size[i] = 1;
        }
    }

    public int find(int u) {
        return par[u] == u ? u : (par[u] = find(par[u]));
    }

    public void union(int p1, int p2) {
        if (size[p1] < size[p2]) {
            par[p1] = p2;
            size[p2] += size[p1];
        } else {
            par[p2] = p1;
            size[p1] += size[p2];
        }
    }
}

