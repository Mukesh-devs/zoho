package dsa.recursion.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//  finding the K-th permutation of the sequence of numbers from 1 to n
public class PermutationSequence {
    public static void main(String[] args) {
        int a = 3;
        int k = 5;
        int[] nth = new int[1];
        StringBuilder sb = new StringBuilder();
        int i = 1;
        while ( i <= a) {
            sb.append(i);
            i++;
        }
        boolean[] seen = new boolean[sb.toString().length()];
        backtrack(sb.toString().toCharArray(),seen, new ArrayList<>(), sb.delete(0,sb.length()), k, nth);
        System.out.println(sb.toString());
    }
    static void backtrack(char[] str, boolean[] seen, List<Character> temp, StringBuilder sb, int k, int[] nth) {
        if ( temp.size() == str.length) {
            nth[0]++;
            if ( nth[0] == k ) {
                for (Character character : temp) {
                    sb.append(character);
                }
//                sb.append(temp);
                return;
            }
            return;
        }

        for ( int i = 0; i < str.length; i++ ) {
            if ( seen[i]) continue;
            seen[i] = true;
            temp.add(str[i]);
            backtrack(str, seen, temp, sb, k, nth);
            temp.removeLast();
            seen[i] = false;
        }
    }
}
