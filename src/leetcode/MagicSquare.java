package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MagicSquare {
    public static void main(String[] args) {
        List<List<Integer>> s = new ArrayList<>();
        int[][] a = {{5, 3, 4}, {1, 5, 8}, {6, 4, 2}};
        for (int[] t : a) {
            List<Integer> row = new ArrayList<>();
            for (int num : t) {
                row.add(num);
            }
            s.add(row);
        }
        System.out.println(s);
    }
    static void magicSquare(List<List<Integer>> list ) {
        for ( int i = 0; i < 3; i++ ) {
            for ( int j = 0; j < 3; j++ ) {

            }
        }
    }
}
