package dsa.string;

//1614
public class MaxNestingDepthOfParanthesis {
    public static void main(String[] args) {
        String str = "()(())((()()))";
        System.out.println(depth(str));
    }
    public static int depth(String str) {
        int brack = 0;
        int max = 0;
        for ( int i = 0 ; i < str.length(); i++ ) {
            if ( str.charAt(i) == '(') {
                brack++;
            }
            else if ( str.charAt(i) == ')') {
                brack--;
            }
            max = Math.max(brack,max);
        }
        return max;
    }
}
