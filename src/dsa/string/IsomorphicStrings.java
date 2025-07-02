package dsa.string;

import java.util.HashMap;
import java.util.Map;
//205
public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s,t));
    }

    public static boolean isIsomorphic(String s, String t) {

        Map<Character,Character> mps = new HashMap<>();
        Map<Character,Character> mpt = new HashMap<>();

        for ( int i = 0; i < s.length(); i++ ){

            if ( mps.containsKey(s.charAt(i)) && mps.get(s.charAt(i)) != t.charAt(i) ) {
                return false;
            }
            if ( mpt.containsKey(t.charAt(i)) && mpt.get(t.charAt(i)) != s.charAt(i) ) {
                return false;
            }
            mps.put(s.charAt(i),t.charAt(i));
            mpt.put(t.charAt(i),s.charAt(i));

        }
        return true;
    }
}
