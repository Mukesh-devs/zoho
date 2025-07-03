package dsa.string;

public class ValidNumber {
    public static void main(String[] args) {
        String s = "-1E+2";
        System.out.println(valid(s));
    }
    public static boolean valid(String s) {
        s = s.trim();
        boolean digit = false;
        boolean exp = false;
        boolean dot = false;
        boolean  digitAfterExp = true;
        char c;
        for ( int i = 0; i < s.length(); i++ ) {
            c = s.charAt(i);

            if ( Character.isDigit(c)) {
                digit = true;
                if ( exp) {
                    digitAfterExp  = true;
                }
            }
            else if ( c == '.') {
                if ( dot || exp) {
                    return false;
                }
                dot = true;
            }
            else if ( c == 'e' || c == 'E') {
                if ( exp || !digit) {
                    return false;
                }
                exp = true;
                digitAfterExp = false;
            }
            else if ( c == '+' || c == '-') {
                if ( i != 0 && (s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E')) {
                    return false;
                }
            }
            else {
                return false;
            }
        }
        return digit && digitAfterExp;
    }
}
