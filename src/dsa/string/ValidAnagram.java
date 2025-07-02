package dsa.string;
import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        int[] freq = new int[26];
        for ( int i = 0; i < s.length(); i++ ) {
            freq[s.charAt(i) - 97]++;
        }
        for ( int i = 0; i < t.length(); i++) {
            freq[t.charAt(i) - 97]--;
        }
        for (int j : freq) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }
}
