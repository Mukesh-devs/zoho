package leetcode;

public class RemoveLeadingParantheses {
    public static void main(String[] args) {
        String str = "(()())(())(()(()))";
        int bracket = 0;
        StringBuilder sb = new StringBuilder();
        for ( int i = 0 ; i < str.length(); i++) {
            if ( str.charAt(i) == '(' && bracket++ > 0 ) {
                sb.append(str.charAt(i));
            }
            else if ( str.charAt(i) == ')' && --bracket > 0) {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
