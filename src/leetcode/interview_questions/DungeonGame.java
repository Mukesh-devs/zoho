package leetcode.interview_questions;

import java.util.Arrays;

public class DungeonGame {
    public static int calculateMinimumHP(int[][] dungeon) {
        int row = dungeon.length;
        int col = dungeon[0].length;

        int[][] dp = new int[row][col];
        dp[row-1][col-1] = dungeon[row-1][col-1] <= 0 ? Math.abs(dungeon[row-1][col-1]) + 1 : 1;

        for ( int i = row - 2; i >= 0; i-- ) {
            dp[i][col - 1] = Math.max(dp[i+1][col-1] - dungeon[i][col-1], 1);
        }
        for ( int j = col - 2; j >= 0; j-- ) {
            dp[row - 1][j] = Math.max(dp[row - 1][j+1] - dungeon[row - 1][j], 1);
        }
        for ( int i = row - 2; i >= 0; i-- ) {
            for ( int j = col - 2; j >= 0; j-- ) {
                dp[i][j] = Math.max(Math.min(dp[i + 1][j],dp[i][j + 1]) - dungeon[i][j]  , 1);
            }
        }
//        System.out.println(Arrays.deepToString(dp));
        return dp[0][0];
        }

    public static void main(String[] args) {
        int[][] dungeon = {{-2,-3,3},{-5,-10,1},{10,30,-5}};
//        int[][] dungeon = {{3,-2,-11},{4,3,-1},{-2,-12,-6}};
//        int[][] dungeon = {{0,0}};
        System.out.println(calculateMinimumHP(dungeon));
    }
}
