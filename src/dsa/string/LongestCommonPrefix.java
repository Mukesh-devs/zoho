package dsa.string;
//14
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        System.out.println(str[1].indexOf(str[0]));
        System.out.println(lcp2(str));
    }

    // O(n * m * m) Brute force
    public static String lcp1(String[] strs) {
        String pre = strs[0];

        for ( int i = 1; i < strs.length; i++) {
            while ( strs[i].indexOf(pre) != 0) {
                pre = pre.substring(0,pre.length() - 1);
            }
        }
        return pre;
    }

    // O(n * m) Optimize
    public static String lcp2(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        char ch;
        for (int i = 0; i < strs[0].length(); i++ ) {
            ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++ ) {
                if ( i > strs[j].length() || strs[j].charAt(i) != ch) {
                    return result.toString();
                }
            }
            result.append(ch);
        }
        return result.toString();
    }
}
