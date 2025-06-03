package dsa.recursion.backtracking;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;

public class Permutate {
    public static void main(String[] args) {
        String str = "123";
        List<String> ans = new ArrayList<>();
        permutate(str,"", ans);
        System.out.println(ans);
        System.out.println(ans.size());
    }

    static void permutate(String str, String ans, List<String> res) {
        if ( str.length() == 0) {
            res.add(ans);
            return;
        }

        for ( int i = 0; i < str.length(); i++ ) {
            char c = str.charAt(i);
            String sub = str.substring(0,i) + str.substring(i + 1);
            permutate(sub, ans + c, res);
        }
    }
}

