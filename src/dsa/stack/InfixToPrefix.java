package dsa.stack;

import java.util.Stack;

public class InfixToPrefix {
    public static void main(String[] args) {
        String str = "a + b - c * ( d + e )";
        System.out.println(str);

        System.out.println(new StringBuilder(toPostfix(reverseString(str))).reverse());
    }
    static boolean isOperator(char c) {
        return "+-*/^".indexOf(c) != -1;
    }
    static int precedence(char c) {
        switch (c) {
            case '+', '-' -> {
                return 1;
            }
            case '*', '/' -> {
                return 2;
            }
            case '^' -> {
                return 3;
            }
            default -> {
                return -1;
            }
        }
    }
    static String toPostfix(String str1) {
        int i = 0;
        Stack<Character> optr = new Stack<>();
        StringBuilder opnd = new StringBuilder();
        char c = ' ';
        while ( i < str1.length()) {
            c = str1.charAt(i);
            if ( c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9') {
                opnd.append(c);
            }
            else {
                if ( isOperator(c) ) {
                    while (!optr.isEmpty() && precedence(c) < precedence(optr.peek())) {
                        opnd.append(optr.pop());
                    }
                    optr.push(c);
                }
                else if (c == '(') {
                    optr.push(c);
                }
                else if ( c == ')') {
                    while ( !optr.isEmpty() && optr.peek() != '(') {
                        opnd.append(optr.pop());
                    }
                    optr.pop();
                }
            }
            i++;
        }
        while (!optr.isEmpty()) {
            opnd.append(optr.pop());
        }
        return opnd.toString();
    }
    static String reverseString(String str ) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i-- ) {
            if ( str.charAt(i) == '(') sb.append(')');
            else if ( str.charAt(i) == ')') sb.append('(');
            else sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
