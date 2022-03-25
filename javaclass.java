public class javaclass {
 
  
    
        public static void main(String[] args) {
            int[][] dir = { { 0, 1 },
                    { 1, 1 }, { 1, 0 }, { 1, -1 }, { 0, -1 }, { -1, 1 }, { -1, 0 }, { -1, 1 } };
            String[] pos = { "e", "se", "s", "sw", "w", "nw", "n", "ne" };
            boolean[][] isVisited = new boolean[3][3];
            static String maxPath = "";
            static int maxLen = Integer.MIN_VALUE;
            count_paths(dir, 0, 0, 2, 2, pos, "", isVisited, 0);
            
            System.out.println(maxLen);
            System.out.println(maxPath);
        }
    
        public static void count_paths(int[][] dir, int sr, int sc, int er, int ec, String[] pos, String psf,
                boolean[][] isVisited, int pathLen) {
    
            if (sr == er && sc == ec) {
                if (pathLen > maxLen) {
                    maxLen = pathLen;
                    maxPath = psf;
                }
                return;
            }
            isVisited[sr][sc] = true;
            for (int i = 0; i < dir.length; i++) {
                for (int rad = 1; rad <= Math.max(er, ec); rad++) {
                    int r = sr + rad * dir[i][0];
                    int c = sc + rad * dir[i][1];
    
                    if (r >= 0 && c >= 0 && r <= er && c <= ec && !isVisited[r][c]) {
                        count_paths(dir, r, c, er, ec, pos, psf + pos[i] + rad, isVisited, pathLen + 1);
                    }
                }
    
            }
    
            isVisited[sr][sc] = false;
    
        }
    
}

   

