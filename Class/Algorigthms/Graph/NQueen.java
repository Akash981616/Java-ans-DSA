class Solution {
    int row = 0, col = 0, diag = 0, adiag = 0;

    public int totalNQueens(int n) {
        return countQueen(0, n);

    }

    public int countQueen(int floor, int n) {
        if (floor == n) {
            return 1;
        }
        int count = 0;
        int r = floor;
        for (int c = 0; c < n; c++) {

            if ((col & (1 << c)) == 0 && (adiag & (1 << r + c)) == 0 && (diag & (1 << (r - c + n - 1))) == 0) {
                col ^= (1 << c);
                diag ^= (1 << (r - c + n - 1));
                adiag ^= (1 << (r + c));
                count += countQueen(c, n);
                col ^= (1 << c);
                diag ^= (1 << (r - c + n - 1));
                adiag ^= (1 << (r + c));
            }
        }
        return count;
    }
}

