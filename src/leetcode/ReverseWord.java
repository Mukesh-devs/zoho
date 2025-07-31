package leetcode;

public class ReverseWord {
    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        boolean check = true;
        int start = s.length() - 1;
        int end = s.length();
        while ( start >= 0) {
            if ( s.charAt(start) == ' ') {
                if ( check ) {
                    sb.append(s, start + 1, end);
                    end = start;
                    sb.append(" ");
                    check = false;
                }
                else {
                    end = start;
                }
            }
            else {
                check = true;
            }
            start--;
        }
        sb.append(s, 0, end);
        return sb.toString();
    }
}

