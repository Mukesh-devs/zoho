package leetcode.interview_questions;

import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        String s = "3[a2[c]]";
        System.out.println(decode(s));
    }

    static String decode(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder current = new StringBuilder();
        int k = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0'); // handle multi-digit numbers like 10[a]
            } else if (ch == '[') {
                countStack.push(k);
                stringStack.push(current);
                current = new StringBuilder();
                k = 0;
            } else if (ch == ']') {
                int count = countStack.pop();
                StringBuilder decoded = stringStack.pop();
                for (int i = 0; i < count; i++) {
                    decoded.append(current);
                }
                current = decoded;
            } else {
                current.append(ch);
            }
        }

        return current.toString();
    }

//    static void rec(String s, Stack<String> st, StringBuilder sb) {
//        if ( st.isEmpty()) {
//            return;
//        }
//
//    }
}
