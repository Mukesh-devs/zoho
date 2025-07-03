package dsa.string;

public class StringToInteger_Atoi {
    public static void main(String[] args) {
        String s = "-91283472332";
        System.out.println(stringtoInteger(s));
    }
    public static int stringtoInteger(String s) {
        int i = 0;
        int n = s.length();
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        if ( n == i) {
            return 0;
        }
        int sign = 1;
        if ( s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }

        long result = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');

            if ( sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            else if ( sign == -1 && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int) (sign * result);
    }
}
