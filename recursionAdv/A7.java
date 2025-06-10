import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// N Queens problem
public class A7 {
    // to check for safe placement of Queen
    public static boolean isSafe(int row, int col, char[][] board) {
        // Horizontal check
        for (int i=0;i< board.length;i++) {
            if(board[row][i]=='Q')
                return false;
        }

        // Vertical check
        for (char[] chars : board) {
            if (chars[col] == 'Q')
                return false;
        }

        // Upper left check
        for (int r=row,c=col;r>=0 && c>=0;r--,c--) {
            if (board[r][c]=='Q')
                return false;
        }

        // Upper right check
        for (int r=row,c=col;r>=0 && c< board.length;r--,c++) {
            if (board[r][c]=='Q')
                return false;
        }

        // Lower left check
        for (int r=row,c=col;r< board.length && c>=0;r++,c--) {
            if (board[r][c]=='Q')
                return false;
        }

        // Lower right check
        for (int r=row,c=col;r< board.length && c< board.length;r++,c++) {
            if (board[r][c]=='Q')
                return false;
        }

        // If it passes all the conditions
        return true;
    }
    // to save the possible safe board formation
    public static void saveBoard(char[][] board, List<List<String>> allBoards) {
        StringBuilder row;
        List<String> newBoard= new ArrayList<>();
        for (char[] chars : board) {
            row = new StringBuilder();
            for (int j = 0; j < board[0].length; j++) {
                if (chars[j] == 'Q')
                    row.append('Q');
                else
                    row.append('-');
            }
            newBoard.add(row.toString());
        }
        allBoards.add(newBoard);
    }
    // recursion function
    public static void helper(char[][] board, List<List<String>> allBoards, int col) {
        if (col== board.length){ // base case
            saveBoard(board,allBoards);
            return;
        }
        for (int row=0;row< board.length;row++) { // row by row placement of queen
            if (isSafe(row,col,board)) {
                board[row][col]= 'Q';
                helper(board, allBoards, col+1);
                board[row][col]= '.';
            }
        }
    }
    // recursion call and database function
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards= new ArrayList<>();
        char[][] board= new char[n][n];
        helper(board, allBoards, 0);
        return allBoards;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no.");
        int n= sc.nextInt();
        System.out.println("The safe formations are-");
        List<List<String>> allBoards= solveNQueens(n);
        for (List<String> allBoard : allBoards) {
            System.out.println(allBoard);
        }
    }
}