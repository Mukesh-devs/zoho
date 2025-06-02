package leetcode;

public class UniquePath3 {
    static int path;

    public static void main(String[] args) {
        int[][] grid = {{1,0,0,0},{0,0,0,0},{0,0,2,-1}};
//        int[][] grid = {{0,1},{2,0}};
        System.out.println(uniquePathsIII(grid));
    }
    public static int uniquePathsIII(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        path = 0;
        boolean[][] seen = new boolean[row][col];
        for ( int i = 0; i < row; i++ ) {
            for ( int j = 0; j < col; j++ ) {
                if ( grid[i][j] == 0) {
                    path += 1;
                }
            }
        }
//        System.out.println(path);
        for ( int i = 0; i < row; i++ ) {
            for ( int j = 0; j < col; j++ ) {
                if ( grid[i][j] == 1) {
                    return dfs(grid,i,j,seen,0);
                }
            }
        }
        return 0;
    }
    static int dfs(int[][] grid, int row, int col, boolean[][] seen, int visit) {
        if ( row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || seen[row][col] || grid[row][col] == -1) {
            return 0;
        }
        if ( grid[row][col] == 0){
            visit++;
        }
        if ( grid[row][col] == 2) {
            if ( path == visit ) {
                return 1;
            }
        }
        seen[row][col] = true;
        int down = dfs(grid, row + 1, col, seen, visit);
        int up = dfs(grid, row - 1, col, seen, visit);
        int right = dfs(grid, row, col + 1, seen, visit);
        int left = dfs(grid, row, col - 1, seen, visit);
        seen[row][col] = false;

        return down + up + right + left;
    }
}
