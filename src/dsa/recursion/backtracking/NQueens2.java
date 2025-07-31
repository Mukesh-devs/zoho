package dsa.recursion.backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens2 {
    public static void main(String[] args) {
        int n = 4;
        int res = setQueens(n);
        System.out.println(res);
    }
    static int setQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for( int row = 0; row < n; row++ ) {
            for( int col  = 0; col < n; col++ ) {
                board[row][col] = '.';
            }
        }
        int[] leftrow = new int[n];
        int[] lowerdiagonal = new int[2 * n - 1];
        int[] upperdiagonal = new int[2 * n - 1];
        int t = 0;
        t += dfs(0,0, res, board, leftrow, lowerdiagonal, upperdiagonal);
        return t;
    }

    static int dfs(int c, int col, List<List<String>> res, char[][] board, int[] leftRow, int[] lowerDiagonal, int[] upperDiagonal ) {
        if ( col == board.length) {
            c++;
            return c;
        }

        for (int row = 0; row < board.length; row++ ) {
            if ( leftRow[row] == 0 && lowerDiagonal[row + col] == 0 && upperDiagonal[(board.length - 1) + (row - col)] == 0) {
                board[row][col] = 'Q';
                leftRow[row] = 1;
                lowerDiagonal[row + col] = 1;
                upperDiagonal[(board.length - 1) + ( row - col)] = 1;
                c = dfs(c, col + 1, res, board, leftRow, lowerDiagonal, upperDiagonal);
                board[row][col] = '.';
                leftRow[row] = 0;
                lowerDiagonal[row + col] = 0;
                upperDiagonal[(board.length - 1) + ( row - col)] = 0;
            }
        }
        return c;
    }
}
