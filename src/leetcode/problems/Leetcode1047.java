package leetcode.problems;

//1047. Remove All Adjacent Duplicates In String

import dsa.stack.Stack;

public class Leetcode1047 {
    public static void main(String[] args) {
        String str = "abbaca";
        System.out.println(removeAdjacent(str));
    }
    static String removeAdjacent(String str) {
        Stack<Character> dup = new Stack<>();
//        dup.push(str.charAt(0));
        int i = 0;
        while (str.length() > i) {
            if ( !dup.isEmpty() && dup.peek() == str.charAt(i)) {
                dup.pop();
            }
            else {
                dup.push(str.charAt(i));
            }
            i++;
        }
        StringBuilder sb = new StringBuilder();
        while (!dup.isEmpty()) {
            sb.append(dup.pop());
        }
        return sb.reverse().toString();
    }
}
