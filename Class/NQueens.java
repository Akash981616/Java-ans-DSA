package Class;
import java.util.*;

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
    // int[][] dir = { { 0, -1 }, { -1, -1 }, { -1, 0 }, { -1, 1 } };
    int[][] dir = { { 0, -1 }, { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, 1 }, { 1, 1 }, { 1, 0 }, { 1, -1 } };
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

// Sudoku

private boolean isPossibleToPlaceNumber(char[][] board, int r, int c, int num) {
    for (int i = 0; i < 9; i++) {
        if (board[r][i] == (char)('0'+num)) {
          return false;
        }
      }
  
      for (int i = 0; i < 9; i++) {
        if (board[i][c] == (char)('0'+num)) {
          return false;
        }
      }
      return true;
     
}

public boolean sudokuSolver(char[][] board, ArrayList<Integer> list, int idx) {
    if (idx == list.size())
        return true;

    int r = list.get(idx) / 9;
    int c = list.get(idx) % 9;

    for (int num = 1; num <= 9; num++) {
        if (isPossibleToPlaceNumber(board, r, c, num)) {
            board[r][c] = (char) ('0' + num);

            if (sudokuSolver(board, list, idx + 1))
                return true;

            board[r][c] = '.';
        }
    }

    return false;
}

public void solveSudoku(char[][] board) {
    ArrayList<Integer> list = new ArrayList<>(); // blank places
    int n = 9;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (board[i][j] == '.') {
                list.add(i * n + j);
            }
        }
    }
}
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String>dict = new HashSet<>();
        for(String v:wordDict)dict.add(v);

        return solver(s, 0, "", dict);
    }
    public boolean solver(String s,int idx,String ans ,HashSet<String> wordDict)
    {
        if(idx==s.length())
        {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = idx;i<s.length();i++)
        {
            char ch = s.charAt(i);
            sb.append(ch+"");
            String subAns = sb.toString();
            if(wordDict.contains(subAns))
            {
                if(solver(s, i+1, ans ,wordDict)==true)
                {
                    return true;
                }
            }
        }
        return false;

    }
}
public static void main(String... args) {
    // System.out.println(queenCombination1D(boxes, 3, 0, 0, ""));
    // System.out.println(queenPermutation1D(boxes, 3, 0, ""));
    boolean[][] boxes = new boolean[4][4];
    // System.out.println(queenCombination2D(boxes, 4, 0, ""));
    // System.out.println(queenPermutation2D(boxes, 4, ""));

    // System.out.println(nqueen_01(boxes, 4, 0, ""));
    System.out.println(nqueen_01_Perm(boxes, 4, ""));
}

}