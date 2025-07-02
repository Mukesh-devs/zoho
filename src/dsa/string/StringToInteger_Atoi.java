package dsa.string;

public class StringToInteger_Atoi {
    public static void main(String[] args) {
        String s = "-91283472332";
        System.out.println(stringtoInteger(s));
    }
    public static int stringtoInteger(String s) {
        StringBuilder sb = new StringBuilder();

        for ( int i = 0; i < s.length(); i++ ) {
            if ( s.charAt(i) == ' ') continue;
            if ( s.charAt(i) == '-' && sb.isEmpty() || s.charAt(i) == '+' && sb.isEmpty()) {
                sb.append(s.charAt(i));
                i++;
                if ( i < s.length()  && s.charAt(i) == '0') {
                    continue;
                }
            }
            else if ( s.charAt(i) == '-' || s.charAt(i) == '+') {
                break;
            }
            else if ( Character.isAlphabetic(s.charAt(i))) {
                break;
            }
            else if ( Character.isDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
        }
        if ( sb.length() == 0) {
            return 0;
        }
        if ( Long.parseLong(sb.toString()) > 0) {
            return Integer.MAX_VALUE;
        }
        else if ( Long.parseLong(sb.toString()) < 0) {
            return Integer.MIN_VALUE;
        }
        else {
            return (int) Long.parseLong(sb.toString());
        }
    }
}
