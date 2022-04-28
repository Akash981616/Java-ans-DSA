import java.util.*;

public class SudokoSolver {
    import java.io.*;
import java.util.*;

public class Main {

  public static void solution(boolean[][] board, int r, int cols, int ndiag, int rdiag, String asf) {
    // write your code here
    if(r==board.length)
    {
        System.out.println(asf+".");
        return;
    }
    for (int c = 0; c < board.length; c++)
    {
      int cbm = 1 << c;
      int ndbm = 1 << (r + c);
      int rdbm = 2 << (r - c + board.length - 1);
      if ((cbm & cols) == 0 && (ndbm & ndiag) == 0 && (ndbm & ndiag) == 0 && (rdiag & rdbm) == 0)
      {
        cols = (cbm | cols);
        ndiag = (ndbm | ndiag);
        rdiag = (rdiag | rdbm);
        
        solution(board,r+1,cols,ndiag,rdiag,asf+r+"-"+c+", ");
        
        cols = (cbm ^ cols);
        ndiag = (ndbm ^ ndiag);
        rdiag = (rdiag ^ rdbm);
      }
    }


  }


  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    boolean[][] board = new boolean[n][n];
    int cols = 0;
    int ndiag = 0;
    int rdiag = 0;
    solution(board, 0, cols, ndiag, rdiag, "");
  }

}
        // Sudoku
         // 139 : word break
         public boolean wordBreak(String str, String asf, HashSet<String> set) {
            if (str.length() == 0) {
                System.out.println(asf);
                return true;
            }
            for (int len = 1; len <= str.length(); len++) {
                String smallStr = str.substring(0, len);
                if (set.contains(smallStr)) {
                    if (wordBreak(str.substring(len), asf + smallStr + " ", set))
                        return true;
                }
            }
    
            return false;
        }
    
        public boolean wordBreak(String str, List<String> wordDict) {
            HashSet<String> set = new HashSet<>();
            for (String s : wordDict)
                set.add(s);
    
            return wordBreak(str, "", set);
        }
    
        // crypto
        static String str1 = "send", str2 = "more", str3 = "money";
        static boolean[] isNumUsed = new boolean[10];
        static int[] mapping = new int[26];
    
        public static void crypto() {
            String str = str1 + str2 + str3;
            int[] freq = new int[26];
            for (int i = 0; i < str.length(); i++) {
                freq[str.charAt(i) - 'a']++;
            }
    
            str = "";
            for (int i = 0; i < 26; i++) {
                if (freq[i] > 0)
                    str += (char) (i + 'a');
            }
    
            if (str.length() > 10)
                return;
    
            System.out.println(crypto(str, 0));
        }
    
        private static int stringToNumber(String str) {
            int res = 0;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                res = res * 10 + mapping[ch - 'a'];
            }
    
            return res;
        }
    
        private static boolean isValidMapping() {
            if (mapping[str1.charAt(0) - 'a'] == 0 || mapping[str2.charAt(0) - 'a'] == 0
                    || mapping[str3.charAt(0) - 'a'] == 0)
                return false;
    
            int num1 = stringToNumber(str1);
            int num2 = stringToNumber(str2);
            int num3 = stringToNumber(str3);
    
            return num1 + num2 == num3;
        }
    
        public static int crypto(String str, int idx) {
            if (idx == str.length()) {
                if (isValidMapping()) {
                    for (int i = 0; i < str.length(); i++) {
                        char ch = str.charAt(i);
                        System.out.print(ch + "=" + mapping[ch - 'a'] + ", ");
                    }
                    System.out.println();
                    return 1;
                }
    
                return 0;
            }
    
            int count = 0;
            char ch = str.charAt(idx);
            for (int num = 0; num <= 9; num++) {
                if (!isNumUsed[num]) {
                    isNumUsed[num] = true;
                    mapping[ch - 'a'] = num;
    
                    count += crypto(str, idx + 1);
    
                    mapping[ch - 'a'] = 0;
                    isNumUsed[num] = false;
                }
    
            }
    
            return count;
        }

        private boolean isPossibleToPlaceNumber(char[][] board, int r, int c, int num) {

            // row
            for (int i = 0; i < 9; i++) {
                if (board[i][c] - '0' == num)
                    return false;
            }
    
            // col
            for (int i = 0; i < 9; i++) {
                if (board[r][i] - '0' == num)
                    return false;
            }
    
            // 3 X 3
            r = (r / 3) * 3;
            c = (c / 3) * 3;
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    if (board[r + i][c + j] - '0' == num)
                        return false;
    
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
    
        boolean[][] rows = new boolean[10][10];
        boolean[][] cols = new boolean[10][10];
        boolean[][][] mats = new boolean[3][3][10];
    
        public boolean sudokuSolver_02(char[][] board, ArrayList<Integer> list, int idx) {
            if (idx == list.size())
                return true;
    
            int r = list.get(idx) / 9;
            int c = list.get(idx) % 9;
    
            for (int num = 1; num <= 9; num++) {
                if (!rows[r][num] && !cols[c][num] && !mats[r / 3][c / 3][num]) {
                    board[r][c] = (char) ('0' + num);
                    rows[r][num] = cols[c][num] = mats[r / 3][c / 3][num] = true;
    
                    if (sudokuSolver_02(board, list, idx + 1))
                        return true;
    
                    board[r][c] = '.';
                    rows[r][num] = cols[c][num] = mats[r / 3][c / 3][num] = false;
                }
            }
    
            return false;
        }
    
        public void solveSudoku_02(char[][] board) {
            ArrayList<Integer> list = new ArrayList<>(); // blank places
            int n = 9;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (board[i][j] == '.') {
                        list.add(i * n + j);
                    } else {
                        int num = board[i][j] - '0';
                        rows[i][num] = cols[j][num] = mats[i / 3][j / 3][num] = true;
                    }
                }
            }
    
            sudokuSolver_02(board, list, 0);
        }
    
        int[] row = new int[10];
        int[] col = new int[10];
        int[][] mat = new int[3][3];
    
        public boolean sudokuSolver_03_bits(char[][] board, ArrayList<Integer> list, int idx) {
            if (idx == list.size())
                return true;
    
            int r = list.get(idx) / 9;
            int c = list.get(idx) % 9;
    
            for (int num = 1; num <= 9; num++) {
                int mask = 1 << num;
                if ((row[r] & mask) == 0 && (col[c] & mask) == 0 && (mat[r / 3][c / 3] & mask) == 0) {
                    board[r][c] = (char) ('0' + num);
                    row[r] ^= mask;
                    col[c] ^= mask;
                    mat[r / 3][c / 3] ^= mask;
    
                    if (sudokuSolver_03_bits(board, list, idx + 1))
                        return true;
    
                    board[r][c] = '.';
    
                    row[r] ^= mask;
                    col[c] ^= mask;
                    mat[r / 3][c / 3] ^= mask;
    
                }
            }
    
            return false;
        }
    
        public void solveSudoku_03_bits(char[][] board) {
            ArrayList<Integer> list = new ArrayList<>(); // blank places
            int n = 9;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (board[i][j] == '.') {
                        list.add(i * n + j);
                    } else {
                        int num = board[i][j] - '0';
                        int mask = 1 << num;
                        row[i] ^= mask;
                        col[j] ^= mask;
                        mat[i / 3][j / 3] ^= mask;
                    }
                }
            }
    
            sudokuSolver_03_bits(board, list, 0);
        }
    
       
    
        public static void main(String... args) {
            // System.out.println(queenCombination1D(boxes, 3, 0, 0, ""));
            // System.out.println(queenPermutation1D(boxes, 3, 0, ""));
            boolean[][] boxes = new boolean[4][4];
            // System.out.println(queenCombination2D(boxes, 4, 0, ""));
            // System.out.println(queenPermutation2D(boxes, 4, ""));
    
            // System.out.println(nqueen_01(boxes, 4, 0, ""));
            // System.out.println(nqueen_01_Perm(boxes, 4, ""));
            crypto();
        }
}
