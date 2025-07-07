import java.util.Scanner;

// Sudoku solver
public class A8 {

    // Checks if placement is possible or not
    public static boolean isSafe(char[][] board, int row, int col, int i) {
        // column check
        for (int x=0;x<board.length;x++) {
            if (board[row][x]==(char)(i+'0'))
                return false;
        }
        // Row check
        for (char[] chars : board) {
            if (chars[col] == (char) (i + '0'))
                return false;
        }
        // Grid check
        int r= row-row%3, c= col-col%3;
        for (int x=r;x<r+3;x++) {
            for (int y=c;y<c+3;y++) {
                if (board[x][y]==(char)(i+'0'))
                    return false;
            }
        }
        return true;
    }

    // Prints the solution
    public static void printSolution(char[][] board) {
        for (int i=0;i<9;i++) {
            System.out.print("| ");
            for (int j=0;j<9;j++) {
                System.out.print(board[i][j]+" | ");
            }
            System.out.println();
        }
    }

    // Recursion function
    public static boolean helper(char[][] board, int row, int col) {
        // for position change
        if (row==9) { // base case
            printSolution(board);
            return true;
        }
        int r, c=0;
        if (col!= 8) {
            r=row;
            c=col+1;
        }
        else {
            r=row+1;
        }

        // For data to be verified & entered
        if (board[row][col]=='-' || board[row][col]=='0') { // blank space case
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
        else { // data already available
            return helper(board, r, c);
        }
        return false;
    }
    // To take rows as inputs from the user
    public static String input() {
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        if (s.length()!=9){
            System.out.println("INCORRECT INPUT\nEnter again");
            s=input();
        }
        return s;
    }
    public static void main(String[] args){
        System.out.println("Enter the sudoku formate row wise and enter '-' or '0' for blank spaces");
        char[][] board= new char[9][9];
        // Taking row input one at a time
        for (int i=0;i<9;i++) {
            System.out.println("Enter row "+(i+1));
            String s= input();
            // Storing input into the array
            for (int j=0;j<9;j++) {
                board[i][j]= s.charAt(j);
            }
        }
        boolean f= helper(board, 0, 0);
        if (!f) // if the answer to the data by user is impossible
            System.out.println("\t**ERROR**\nNo solution for this data");
    }
}
