package dsa.recursion.backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        List<List<String>> res = setQueens(n);
        for ( int i = 0; i < res.size(); i++ ) {
            System.out.println("N Queen : " + (i + 1));
            for ( String st : res.get(i)) {
                System.out.println(st);
            }
        }
    }
    static List<List<String>> setQueens(int n) {
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
        dfs(0, res, board, leftrow, lowerdiagonal, upperdiagonal);
        return res;
    }

    static void dfs(int col, List<List<String>> res, char[][] board, int[] leftRow, int[] lowerDiagonal, int[] upperDiagonal ) {
        if ( col == board.length) {
            res.add(store(board));
            return;
        }

        for (int row = 0; row < board.length; row++ ) {
            if ( leftRow[row] == 0 && lowerDiagonal[row + col] == 0 && upperDiagonal[(board.length - 1) + (row - col)] == 0) {
                board[row][col] = 'Q';
                leftRow[row] = 1;
                lowerDiagonal[row + col] = 1;
                upperDiagonal[(board.length - 1) + ( row - col)] = 1;
                dfs(col + 1, res, board, leftRow, lowerDiagonal, upperDiagonal);
                board[row][col] = '.';
                leftRow[row] = 0;
                lowerDiagonal[row + col] = 0;
                upperDiagonal[(board.length - 1) + ( row - col)] = 0;
            }
        }
    }
    static List<String> store(char[][] board) {
        List<String> temp = new ArrayList<>();
        for ( int i = 0; i < board.length; i++ ){
            temp.add(new String(board[i]));
        }
        return temp;
    }
}
