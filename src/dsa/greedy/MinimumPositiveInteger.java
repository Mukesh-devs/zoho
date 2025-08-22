package dsa.greedy;

import java.util.HashSet;

public class MinimumPositiveInteger {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        HashSet<Integer> set = new HashSet<>();
        boolean[] seen = new boolean[arr.length];
        combination(arr, 0, set, 0, seen);
        for ( int i = 1; i < 11; i++ ) {
            if ( !set.contains(i) ) {
                System.out.println(i);
                break;
            }
        }
    }
    static void combination(int[] arr, int index, HashSet<Integer> res, int sum, boolean[] seen) {
        if ( index == arr.length) {
            res.add(sum);
            return;
        }
        sum += arr[index];
        combination(arr, index + 1, res, sum, seen);
        sum -= arr[index];
        combination(arr, index + 1, res, sum, seen);
    }
}
