// Sudoku solver
public class A8 {
    public boolean helper(char[][] board, int row, int col) {
        int r=0, c=0;
        if (col!= board.length) {
            r=row;
            c=col+1;
        }
        else {
            r=row+1;
            c=0;
        }
        if (board[row][col]!='-') {
            if (helper(board, r, c))
                return true;
        }
        else {
            for (int i=1;i<=9;i++) {
                if (isSafe(board, row, col, i)) {
                    board[row][col]=(char)(i+'0');
                    if (helper(board, r, c))
                        return true;
                    else {
                        board[row][col]='-';
                    }
                }
            }
        }
    }
    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }
}
