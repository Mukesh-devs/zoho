package dsa.recursion.backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Unique Permutation
public class Permutation2 {
    static Set<List<Integer>> uni = new HashSet<>();
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
            if (uni.add(temp)) {
                res.add(new ArrayList<>(temp));
                return;
            }
            return;
        }

        for ( int i = 0; i < arr.length; i++ ) {
            if ( seen[i]) continue;
            seen[i] = true;
            temp.add(arr[i]);
            backtrack(arr, temp, res,seen);
            temp.removeLast();
            seen[i] = false;
        }
    }
}
