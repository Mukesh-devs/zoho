package dsa.recursion;

public class ReplaceString {
    static String recc(String str, StringBuilder sb, int ind) {
        if ( ind == str.length()) {
            return sb.toString();
        }
        if ( str.charAt(ind) == 'a') {
            sb.append('r');
        }
        else {
            sb.append(str.charAt(ind));
        }
        return recc(str,sb,ind + 1);
    }
    static String replace(String str) {
        StringBuilder sb = new StringBuilder();
        return recc(str,sb,0);
    }
    public static void main(String[] args) {
        System.out.println(replace("Mukash"));
    }
}
