package dsa.dynamic_programming.memoization;

public class ClimbingStairs {
    public static void main(String[] args) {
        int stair = 3;
        int[] dp = new int[stair+1];
        System.out.println(climb(dp,stair));
    }

    static int climb(int[] dp, int n) {
        if ( n <= 1) {
            return 1;
        }
        if ( dp[n] != 0) {
            return dp[n];
        }
        int left = climb(dp, n - 1);
        int right = climb(dp, n - 2);
        return left + right;
    }
}
