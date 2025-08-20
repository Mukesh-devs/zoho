package dsa.dynamic_programming.tabulation;

import java.util.Arrays;

public class MaximalSquare {
    static void main() {

        char[][] matrix = {{'1','1','1','1','0'},{'1','1','1','1','0'},{'1','1','1','1','1'},{'1','1','1','1','1'},{'0','0','1','1','1'}};
        System.out.println(maximalSquare(matrix));
    }
    public static int maximalSquare(char[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] dp = new int[row][col];
        int max = 0;
        int temp;
        for ( int i = 0; i < row; i++ ) {
            for ( int j = 0; j < col; j++ ) {
                temp = matrix[i][j] - '0';
                if ( i == 0 || j == 0 ) {
                    dp[i][j] = temp;
                }
                else {
                    if ( temp == 1 ) {
                        dp[i][j] = min(dp[i - 1][j], dp[i][j - 1], dp[i - 1][j - 1]) + 1;
                    }
                    else {
                        dp[i][j] = temp;
                    }
                }
                max = Math.max(max,dp[i][j]);
            }
        }
        for ( int i = 0; i < row; i++ ) {
            System.out.println(Arrays.toString(dp[i]));
        }
        return max * max;
    }
    static int min(int a, int b, int c) {
        if ( a >= b && c >= b) return b;
        else if ( b >= a && c >= a) return a;
        else return c;
    }
}
