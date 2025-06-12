package leetcode;

public class FindDigits {
    public static void main(String[] args) {
        int n = 1012;
        System.out.println(digit(n + "", 0, n, 0));
    }

    static int digit(String s, int ind, int num, int res) {
        if ( ind == s.length() ) {
            return 0;
        }
        if ( s.charAt(ind) - '0' != 0) {
            int n = num % (s.charAt(ind) - '0');
            res = n == 0 ? 1 : 0;
        }
        else {
            res = 0;
        }
        return res + digit(s, ind + 1, num, res);
    }
}
