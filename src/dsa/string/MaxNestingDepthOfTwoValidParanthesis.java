package dsa.string;

import java.util.Arrays;

public class MaxNestingDepthOfTwoValidParanthesis {
    public static void main(String[] args) {
        String str = "()(())()";
        System.out.println(Arrays.toString(maxDepth(str)));
    }
    public static int[] maxDepth(String str) {
        int[] result = new int[str.length()];
        int brack = 0;
        for ( int i = 0; i < str.length(); i++ ) {
            if ( str.charAt(i) == '(') {
                brack++;
                result[i] = brack % 2;
            }
            else if ( str.charAt(i) == ')') {
                result[i] = brack % 2;
                brack--;
            }
        }
        return result;
    }
}
