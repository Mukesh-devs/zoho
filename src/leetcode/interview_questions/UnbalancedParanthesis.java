package leetcode.interview_questions;

public class UnbalancedParanthesis {

    public static String unbalanced(String str) {
        StringBuilder sb = new StringBuilder();
        int bracket = 0;
        for ( int i =0; i < str.length(); i++ ) {
            if ( str.charAt(i) == '(' ) {
                bracket++;
                sb.append(str.charAt(i));
            }
            else if ( str.charAt(i) == ')' ) {
                if ( bracket > 0) {
                    bracket--;
                    sb.append(str.charAt(i));
                }
            }
            else {
                sb.append(str.charAt(i));
            }
        }

        str = sb.toString();
        System.out.println(str);
        sb = new StringBuilder();
        bracket = 0;
        for (int i = str.length() - 1; i >= 0; i-- ) {
            if ( str.charAt(i) == ')') {
                bracket++;
                sb.append(str.charAt(i));
            }
            else if (str.charAt(i) == '(') {
                if ( bracket > 0 ){
                    bracket--;
                    sb.append(str.charAt(i));
                }
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        str = sb.reverse().toString();
        return str;
    }
    public static void main(String[] args) {
        String str = "((abc)((de))";
//        String str = "(((a)";
        System.out.println(unbalanced(str));


    }
}
