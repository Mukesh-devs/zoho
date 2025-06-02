package leetcode;

import java.util.HashMap;
import java.util.Map;

public class SuperReducedString {
    static Map<Character, Integer> freq;
    public static void main(String[] args) {
//        String str = "aaabccddd";
        String str = "baab";
        freq = new HashMap<>();
        System.out.println(reducedString(str));
    }
//    public static String reducedString(String s) {
//        for ( char c : s.toCharArray()) {
//            if ( freq.containsKey(c)) {
//                freq.put(c,freq.get(c) + 1);
//            }
//            else {
//                freq.put(c, 1);
//            }
//        }
//        StringBuilder sb = new StringBuilder();
//        for ( Map.Entry<Character,Integer> Super : freq.entrySet()) {
//            char cc = Super.getKey();
//            int frequency = Super.getValue();
//            if ( frequency % 2 != 0) {
//                sb.append(cc);
//            }
//        }
//        return sb.toString().equals("") ? sb.append("Empty String").toString() : sb.toString();
//     }
    static String reducedString( String str) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while ( i < str.length()) {
            if ( sb.charAt(i) == sb.charAt(i+1)) {
                i++;
            }
            else {
                sb.append(str.charAt(i));
                i++;
            }
        }
        return reducedString(sb.toString());
    }
}
