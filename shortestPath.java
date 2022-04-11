public class shortestPath {
    public static class pairSP {
        int len = (int) 1e9;
        String str = "";
    }
    public static pairSP shortesPath(int sr, int sc, int er, int ec, int[][] mat, int[][] dir, String[] dirS) {
        if(sr == er-1 && sc == ec-1){
            pairSP base = new pairSP();
            base.len = 0;
            return base;
        }
        pairSP ans = new pairSP();
        mat[sr][sc] = 1; // block
        for (int d = 0; d < dir.length; d++) {
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];

            if (r >= 0 && c >= 0 && r < er && c < sc && mat[r][c] != 0) {
                pairSP recAns = shortesPath(r, c, er, ec, mat, dir, dirS);
                if (recAns.len != (int)1e9 &&  recAns.len + 1 < ans.len) {
                    ans.len = recAns.len + 1;
                    ans.str = recAns.str + dirS[d];
                }
            }
        }

        mat[sr][sc] = 0; // unblock
        return ans;
    }

    public static void main(String[] args) {
        // System.out.println(mazePath(0, 0, 2, 2, ""));
        int mat[][]={{1,1,1,1},
            {1,1,1,1},{1,1,1,1}};
        int[][] dir = { { 0, 1 }, { 1, 0 }, { 1, 1 } };
        String[] dirS = { "h", "v", "d" };
        pairSP res=shortesPath(0,0,4,4,mat,dir,dirS);
        System.out.println(res.len);
        System.out.println(res.str);
    }
}
