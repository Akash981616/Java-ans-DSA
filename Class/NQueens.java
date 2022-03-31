package Class;

public class NQueens {

    // tnq : total no of queens, qpsf : queen placed so far
    public static int queenCombination1D(boolean[] boxes, int tnq, int bno, int qpsf, String psf) {
        if (qpsf == tnq) {
            System.out.println(psf);
            return 1;
        }
        int count = 0;
        for (int bidx = bno; bidx < boxes.length; bidx++) {
            count += queenCombination1D(boxes, tnq, bidx + 1, qpsf + 1, psf + "b" + bidx + "q" + qpsf + " ");
        }
        return count;
    }

    public static int queenPermutation1D(boolean[] boxes, int tnq, int qpsf, String psf) {
        if (qpsf == tnq) {
            System.out.println(psf);
            return 1;
        }
        int count = 0;
        for (int bidx = 0; bidx < boxes.length; bidx++) {
            if (!boxes[bidx]) {
                boxes[bidx] = true;
                count += queenPermutation1D(boxes, tnq, qpsf + 1, psf + "b" + bidx + "q" + qpsf + " ");
                boxes[bidx] = false;
            }
        }
        return count;
    }

    public static int queenCombination2D(boolean[][] boxes, int tnq, int bno, String psf) {
        if (tnq == 0) {
            System.out.println(psf);
            return 1;
        }
        int count = 0, n = boxes.length;
        for (int bidx = bno; bidx < n * n; bidx++) {
            int r = bidx / n, c = bidx % n;
            count += queenCombination2D(boxes, tnq - 1, bidx + 1, psf + "(" + r + "," + c + ") ");
        }
        return count;
    }

    public static int queenPermutation2D(boolean[][] boxes, int tnq, String psf) {
        if (tnq == 0) {
            System.out.println(psf);
            return 1;
        }
        int count = 0, n = boxes.length;
        for (int bidx = 0; bidx < n * n; bidx++) {
            int r = bidx / n, c = bidx % n;
            if (!boxes[r][c]) {
                boxes[r][c] = true;
                count += queenPermutation2D(boxes, tnq - 1, psf + "(" + r + "," + c + ") ");
                boxes[r][c] = false;
            }
        }
        return count;
    }

    // NQueen================================================================================

    public static boolean isSafeToPlaceQueen(boolean[][] boxes, int r, int c) {
        //int[][] dir = { { 0, -1 }, { -1, -1 }, { -1, 0 }, { -1, 1 } };
       int[][] dir = { { 0, -1 }, { -1, -1 }, { -1, 0 }, { -1, 1 },  { 0, 1 }, { 1, 1 }, { 1, 0 }, { 1, -1 } };
        int n = boxes.length;
        for (int d = 0; d < dir.length; d++) {
            for (int rad = 1; rad <= n; rad++) {
                int x = r + rad * dir[d][0];
                int y = c + rad * dir[d][1];

                if (x >= 0 && y >= 0 && x < n && y < n) {
                    if (boxes[x][y])
                        return false;
                } else
                    break;
            }
        }
        return true;
    }

    public static int nqueen_01(boolean[][] boxes, int tnq, int bno, String psf) {
        if (tnq == 0) {
            System.out.println(psf);
            return 1;
        }
        int count = 0, n = boxes.length;
        for (int bidx = bno; bidx < n * n; bidx++) {
            int r = bidx / n, c = bidx % n;
            if (isSafeToPlaceQueen(boxes, r, c)) {
                boxes[r][c] = true;
                count += nqueen_01(boxes, tnq - 1, bidx + 1, psf + "(" + r + "," + c + ") ");
                boxes[r][c] = false;
            }
        }
        return count;
    }

    public static int nqueen_01_Perm(boolean[][] boxes, int tnq, String psf) {
        if (tnq == 0) {
            System.out.println(psf);
            return 1;
        }
        int count = 0, n = boxes.length;
        for (int bidx = 0; bidx < n * n; bidx++) {
            int r = bidx / n, c = bidx % n;
            if (!boxes[r][c] && isSafeToPlaceQueen(boxes, r, c)) {
                boxes[r][c] = true;
                count += nqueen_01_Perm(boxes, tnq - 1, psf + "(" + r + "," + c + ") ");
                boxes[r][c] = false;
            }
        }
        return count;
    }

    public static void main(String... args) {
        // System.out.println(queenCombination1D(boxes, 3, 0, 0, ""));
        // System.out.println(queenPermutation1D(boxes, 3, 0, ""));
        boolean[][] boxes = new boolean[4][4];
        // System.out.println(queenCombination2D(boxes, 4, 0, ""));
        // System.out.println(queenPermutation2D(boxes, 4, ""));

        // System.out.println(nqueen_01(boxes, 4, 0, ""));
        System.out.println(nqueen_01(boxes, 4,0, ""));
    }

}