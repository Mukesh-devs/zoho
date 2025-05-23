package leetcode;

import java.util.Set;
import java.util.HashSet;

public class SudokuSolve {


    public static void main(String[] args) {
        SudokuSolve2 ss = new SudokuSolve2();
        String[][] board = {{"5", "3", ".", ".", "7", ".", ".", ".", "."}, {"6", ".", ".", "1", "9", "5", ".", ".", "."}, {".", "9", "8", ".", ".", ".", ".", "6", "."}, {"8", ".", ".", ".", "6", ".", ".", ".", "3"}, {"4", ".", ".", "8", ".", "3", ".", ".", "1"}, {"7", ".", ".", ".", "2", ".", ".", ".", "6"}, {".", "6", ".", ".", ".", ".", "2", "8", "."}, {".", ".", ".", "4", "1", "9", ".", ".", "5"}, {".", ".", ".", ".", "8", ".", ".", "7", "9"}};
        String[][] board1 = {{".",".","4",".",".",".","6","3","."},{".",".",".",".",".",".",".",".","."},{"5",".",".",".",".",".",".","9","."},{".",".",".","5","6",".",".",".","."},{"4",".","3",".",".",".",".",".","1"},{".",".",".","7",".",".",".",".","."},{".",".",".","5",".",".",".",".","."},{".",".",".",".",".",".",".",".","."},{".",".",".",".",".",".",".",".","."}};
        System.out.println(ss.isValidSudoku(board));
    }
 }
 class SudokuSolve2 {
     Set<String>[] row = new HashSet[9];
     Set<String>[] col = new HashSet[9];
     Set<String>[] box = new HashSet[9];
     public void Setup(){
         for (int i=0;i<9;i++){
             row[i]=new HashSet<>();
             col[i]=new HashSet<>();
             box[i]= new HashSet<>();
         }
     }

     public boolean isValidSudoku(String[][] board) {
         Setup();
         for ( int i = 0; i < board.length; i++ ) {
             for ( int j = 0; j < board[0].length; j++ ) {

                 if ( board[i][j].charAt(0) != '.' ) {

                     if ( !check(board,i,j,board[i][j] )) {
                         return false;
                     }
                 }
             }
         }
         return true;
     }

     public boolean check(String[][] board, int i, int j, String c) {
         if ( !row[i].add(c)) return false;
         if ( !col[j].add(c)) return false;
         int k=((i/3)*3)+(j/3);
         if ( !box[k].add(c) ) return false;
//
//
//         if ( col[j].contains(c) ) {
//             System.out.println(j);
//             return false;
//         }
//         else {
//             col[j].add(c);
//         }
//         if ( box[k].contains(c) ) {
//             System.out.println(k);
//             return false;
//         }
//         else {
//             box[k].add(c);
//         }
         return true;
     }
 }
 class SudokuSolve1 {

    public void fun(){
        System.out.println("hhhh");
    }
    public boolean isValidSudoku(String[][] board) {
        for ( int i = 0; i < board.length; i++ ) {
            for ( int j = 0; j < board[0].length; j++ ) {

                if ( board[i][j].charAt(0) != '.' ) {

                    if ( !(vertical(board,board[i][j].charAt(0),i,j) && check(board,i,j,board[i][j].charAt(0)) )) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean vertical(String[][] board, char c, int row, int col) {
        for ( int i = 0; i < 9; i++ ) {
            if ( board[i][col].charAt(0) == c && i != row) {
                System.out.println(i+" "+c+" "+col);
                return false;
            }

            if ( board[row][i].charAt(0) == c && i != col) {
                return false;
            }
        }
        return true;
    }

    // public boolean horizontal() {

    // }

    public boolean check(String[][] board, int row, int col, char c) {
        int a = row/3;
        int b = col/3;
        // System.out.println(a+" "+b);
        for ( int i = a*3; i < a*3 + 3; i++ ) {
            for ( int j = b*3; j < b*3 + 3; j++ ) {
                if ( board[i][j].charAt(0) == c && (i != row & j != col)) {
                    return false;
                }
            }
        }
        return true;
    }
}