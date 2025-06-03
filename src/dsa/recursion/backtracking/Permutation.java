package dsa.recursion.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        boolean[] seen = new boolean[arr.length];
        List<List<Integer>> res = new ArrayList<>();
        backtrack(arr,new ArrayList<>(),res,seen);
        System.out.println(res);
        System.out.println(res.size());
    }
    static void backtrack(int[] arr, List<Integer> temp, List<List<Integer>> res, boolean[] seen) {
        if ( temp.size() == arr.length) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for ( int i = 0; i < arr.length; i++ ) {
            if ( seen[i]) continue;
            seen[i] = true;
            temp.add(arr[i]);
            backtrack(arr, temp, res,seen);
            temp.remove(temp.size() - 1);
            seen[i] = false;
        }
    }
}
