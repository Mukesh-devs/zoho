package leetcode;

public class ReduceCharby1 {
    public static void main(String[] args) {
        String str = "abcd";

        int min = Integer.MAX_VALUE;
        System.out.println(backtrack(str.toCharArray(),0));

    }
    public static int backtrack(char[] c, int count) {

        if ( palindrome(new String(c))) {
            return count;
        }
        int min = Integer.MAX_VALUE;

        for ( int i = 0; i < c.length; i++ ) {
            if ( c[i] == 'a') {
                continue;
            }
            c[i] = (char) (c[i] - 1);
            int curr = backtrack(c,count+1);
            min = Math.min(min, curr);
            c[i] = (char) (c[i] + 1);
        }
        return min;
    }
    public static boolean palindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if ( str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
            return true;
    }
}
