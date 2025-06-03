package dsa.recursion.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<int[]> res = new ArrayList<>();
        permutate(arr, res, 0);
        for (int[] a : res ) {
            System.out.println(Arrays.toString(a));
        }
        System.out.println(res.size());
    }
    static void permutate(int[] arr, List<int[]> res, int index) {
        if ( index == arr.length) {
            res.add(arr.clone());
            return;
        }
        for ( int i = index; i < arr.length; i++ ){
            swap(arr, index, i);
            permutate(arr, res, index + 1);
            swap(arr, index, i);
        }
        return;
    }
    static void swap(int[] arr, int a, int b) {
        if ( a != b) {
            arr[a] = arr[a] ^ arr[b];
            arr[b] = arr[a] ^ arr[b];
            arr[a] = arr[a] ^ arr[b];
        }
    }
}
