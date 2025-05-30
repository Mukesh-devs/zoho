package leetcode;

import java.util.Arrays;

public class UniquePath2 {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;

        int[][] dp = new int[row][col];
        dp[0][0] = obstacleGrid[0][0] == 1 ? 0 : 1;
        for ( int i = 1; i < row; i++ ) {
            dp[i][0] = obstacleGrid[i][0] == 1 ? 0 : dp[i-1][0] == 0 ? 0 : 1;
        }
        for ( int i = 1; i < col; i++ ) {
            dp[0][i] = obstacleGrid[0][i] == 1 ? 0 : dp[0][i-1] == 0 ? 0 : 1;
        }

        for ( int i = 1; i < row; i++ ) {
            for ( int j = 1; j < col; j++ ) {

                dp[i][j] = obstacleGrid[i][j] == 1 ? 0 : dp[i-1][j] + dp[i][j-1];
            }
        }
        for (int[] dd : dp) {
            System.out.println(Arrays.toString(dd));
        }
        return dp[row-1][col-1];
    }

    public static void main(String[] args) {
        int[][] arr = {{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(uniquePathsWithObstacles(arr));
    }
}
