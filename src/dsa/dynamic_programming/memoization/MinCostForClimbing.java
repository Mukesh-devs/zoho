package dsa.dynamic_programming.memoization;

public class MinCostForClimbing {
    public static void main(String[] args) {
        int[] cost = {1,100,1,1,1,100,1,1,100,1};
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for ( int i = 2; i < cost.length; i++ ){
            dp[i] = cost[i] + Math.min(dp[i - 1],dp[i - 2]);
        }
        System.out.println(Math.min(dp[cost.length-1],dp[cost.length-2]));
//        System.out.println(Math.min(rec(cost,cost.length-1,dp),rec(cost,cost.length-2,dp)));
    }


//    static int rec(int[] cost, int n,int[] dp) {
//        if (n < 0) return 0;
//        if ( n == 0 || n == 1) return cost[n];
//        if ( dp[n] != 0) return dp[n];
//        int one = rec(cost, n - 1,dp);
//        int two = rec(cost, n - 2,dp);
//
//        return dp[n] = cost[n] + Math.min(one, two);
//    }
}
