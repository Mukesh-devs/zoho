package leetcode;

public class Encryption {
    public static void main(String[] args) {
        String s = "feedthedog";
        int sq = (int) Math.ceil(Math.sqrt(s.length()));
        System.out.println(sq);
        char[][] c = new char[sq][sq+1];
        System.out.println(encrypt(s,sq));
    }
    static String encrypt(String s, int sq) {
        StringBuilder sb = new StringBuilder();
        int t = 0;
        int i = 0;
        int jump = 0;
        while ( t < s.length() ) {
            if( i >= s.length()) {
                jump++;
                sb.append(" ");
                i = jump;
            }
            else {
                if ( i < s.length()) {
                    sb.append(s.charAt(i));
                    i += sq;
                }
                t++;
            }
        }
        return sb.toString();
    }
}
