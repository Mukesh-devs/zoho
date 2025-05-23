package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Password {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("because");
        str.add("can");
        str.add("do");
        str.add("must");
        str.add("we");
        str.add("what");
        String pass = "wedowhatwemustbecausewecan";
        System.out.println(passwordCracker(str,pass));
    }
    public static String passwordCracker(List<String> passwords, String loginAttempt) {
        List<String> res = new ArrayList<>();
        // Write your code here
        int i = 0;
        String temp = "";
        int end = 0;
        while (i < loginAttempt.length()) {
            boolean matched = false;
            for (String word : passwords) {
                end = i + word.length();
                if (end <= loginAttempt.length() && loginAttempt.substring(i, end).equals(word)) {
                    res.add(word);
                    i = end;
                    matched = true;
                    break;
                }
            }
            if (!matched) {
                return "WRONG PASSWORD";
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int s = 0; s < res.size(); s++) {
            sb.append(res.get(s));
            sb.append(" ");
        }
        return sb.toString();
    }

}
