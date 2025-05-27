package leetcode.interview_questions;

public class MathExpressionChecker {
    static boolean checker(String str) {
        int bracket = 0;
        int j = 0;
        for ( int i = 0; i < str.length(); i++ ) {
            char c = str.charAt(i);
            if ( c == '(' ) {
                bracket++;
            }
            else if ( c == ')') {
                if( bracket > 0) {
                    bracket--;
                }
            }
            else if ( Character.isLetter(c) ) {
                j = i;
                while ( j != '(' || j != ')') {
                    j++;
                }
            }
        }
        return true;
    }
    static boolean expression(String str ) {
        return true;
    }
    public static void main(String[] args) {
        String str = "((a+b)";

    }
}
