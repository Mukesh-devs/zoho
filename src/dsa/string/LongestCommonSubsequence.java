package dsa.string;

import java.util.Arrays;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String s = "dasc";
        String t = "dca";
        int len1 = s.length();
        int len2 = t.length();
        int[][] dp = new int[len1][len2];
        for (int[] temp : dp) {
            Arrays.fill(temp,-1);
        }
//        System.out.println(lcs(len1 - 1,len2 - 1,s,t));
        System.out.println(Arrays.deepToString(dp));
        System.out.println(dp(len1 - 1,len2 - 1,s,t,dp));
    }
    public static int lcs(int len1, int len2, String s, String t) {
        if ( len1 < 0 || len2 < 0) {
            return 0;
        }

        if ( s.charAt(len1) == t.charAt(len2)) {
            return 1 + lcs(len1 - 1, len2 - 1,s,t);
        }

        return Math.max(lcs(len1 - 1, len2, s, t), lcs(len1, len2 - 1, s, t));
    }

    public static int dp(int len1, int len2, String s, String t, int[][] dp) {
        if ( len1 < 0 || len2 < 0) {
            return 0;
        }

        if( dp[len1][len2] != -1) {
            return dp[len1][len2];
        }
        if ( s.charAt(len1) == t.charAt(len2)) {
            return dp[len1][len2] = 1 + dp(len1 - 1, len2 - 1,s,t,dp);
        }

        return dp[len1][len2] = Math.max(dp(len1 - 1, len2, s, t,dp), dp(len1, len2 - 1, s, t,dp));
    }
}
