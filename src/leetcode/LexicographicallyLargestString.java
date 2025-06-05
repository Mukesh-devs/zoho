package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LexicographicallyLargestString {
    public static void main(String[] args) {
        List<String> ans = new ArrayList<>();
        String str = "xy";
        int numFriends = 1;
        List<String> res = new ArrayList<>();
        lexico(str, 0,numFriends, ans, res);
        String large = res.get(0);
        for ( int i = 1; i < res.size(); i++ ) {
            large = isLexico(res.get(i), large );
        }
        System.out.println(res);
        System.out.println(large);
    }

    static void lexico(String str,int index, int comb ,List<String> ans, List<String> res) {
        if ( comb == 1) {
            String last = str.substring(index);
            ans.add(last);
            res.addAll(ans);
            ans.remove(ans.size() - 1);
            return;
        }
        for ( int i = index + 1; i < str.length(); i++ ) {

            ans.add(str.substring(index, i));
            lexico(str, i ,comb - 1, ans,res);
            ans.remove(ans.size() - 1);

        }
    }

    static String isLexico(String str1, String str2) {
        int i = 0;
        int j = 0;
        while ( i < str1.length() && j < str2.length() ) {
            if ( str1.charAt(i) > str2.charAt(j)) {
                return str1;
            }
            else if ( str1.charAt(i) < str2.charAt(j) ) {
                return str2;
            }
            else if ( str1.charAt(i) == str2.charAt(j) ) {
                i++;
                j++;
            }
        }
        return str1.length() > str2.length() ? str1 : str2;
    }
}
