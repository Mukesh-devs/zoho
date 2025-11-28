package dsa.recursion.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combination {
    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        List<List<Integer>> res = new ArrayList<>();
        combination(res, n, k, 1, new ArrayList<>());
        System.out.println(res);
    }

    static void combination(List<List<Integer>> res, int n, int target, int index, List<Integer> temp) {
        if ( temp.size() == target) {
            res.add(new ArrayList<>(temp));
            return;
        }

        if (index > n ) {
            return;
        }
        temp.add(index);
        combination(res, n, target, index + 1, temp);
        temp.remove(temp.size() - 1);
        combination(res, n, target, index + 1, temp);
    }
}
