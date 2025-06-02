package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindWord {
    public static void main(String[] args) {
        List<String> res = new ArrayList<>();
        char[][] board = {{'o','a','a','n'},{'e','t','a','e'},{'i','h','k','r'},{'i','f','l','v'}};
//        String str = 'ABCCED';
        String[] str = {"oath","pea","eat","rain"};
        for (String s : str) {
            if (exist(board, s)) {
                res.add(s);
            }
        }
        System.out.println(res);
    }
    public static boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        boolean[][] seen = new boolean[row][col];
        for ( int i = 0; i < row; i++ ){
            for ( int j = 0; j < col; j++ ){
                if ( word.charAt(0) == board[i][j]) {
                    if ( dfs(board, word, i,j,seen, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static boolean dfs( char[][] board, String word, int row, int col, boolean[][] seen , int index) {
        if ( row < 0 || row >= board.length || col < 0 || col >= board[0].length || seen[row][col] || board[row][col] != word.charAt(index)) {
            return false;
        }
        if ( index == word.length() - 1) {
            return true;
        }
        seen[row][col] = true;
        boolean check = dfs(board, word, row + 1, col, seen, index+1) ||
                dfs(board, word, row - 1, col, seen, index+1) ||
                dfs(board, word, row, col + 1, seen, index+1) ||
                dfs(board, word, row, col - 1, seen, index+1);
        seen[row][col] = false;
        return check;
    }
}
