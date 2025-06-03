package leetcode;

public class WordSearch {
    public static void main(String[] args) {
//        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String str = "ABCCD";
//        String str = "SEE";
        System.out.println(exist(board, str));
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
