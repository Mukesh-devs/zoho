package dsa.recursion.backtracking;

import java.util.Arrays;

public class Sudoku {
    public static void main(String[] args) {
        String[][] board = {{"5","3",".",".","7",".",".",".","."},
                            {"6",".",".","1","9","5",".",".","."},
                            {".","9","8",".",".",".",".","6","."},
                            {"8",".",".",".","6",".",".",".","3"},
                            {"4",".",".","8",".","3",".",".","1"},
                            {"7",".",".",".","2",".",".",".","6"},
                            {".","6",".",".",".",".","2","8","."},
                            {".",".",".","4","1","9",".",".","5"},
                            {".",".",".",".","8",".",".","7","9"}};
        solve(board);
        for (int i = 0; i < board.length; i++ ) {
            System.out.println(Arrays.toString(board[i]));
        }

    }
    static boolean solve(String[][] board) {
        for ( int i = 0; i < board.length; i++ ) {
            for (int j = 0; j < board[0].length; j++ ) {
                if ( board[i][j] == "." ) {
                    for ( int s = 1; s <= 9; s++ ) {
                        if ( check(board, i, j, s+"")) {
                            board[i][j] = s+"";
                            if ( solve(board)) {
                                return true;
                            }
                            else {
                                board[i][j] = ".";
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    static boolean check(String[][] board, int a, int b, String s) {
        for ( int i = 0; i < 9; i++ ) {
            if ( board[a][i].equals(s) ) {
                return false;
            }
            if ( board[i][b].equals(s)) {
                return false;
            }
            if ( board[3 * (a/3) + i/3][3 * (b/3) + i%3].equals(s)) {
                return false;
            }
        }
        return true;
    }
}
