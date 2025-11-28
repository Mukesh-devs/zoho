package dsa.recursion.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSequence {
    public static void main(String[] args) {
      int[] arr = { 1,9,3};
      List<List<Integer>> res = new ArrayList<>();
      subsequence(res, arr, 0, new ArrayList<>());
      for ( List<Integer> list : res) {
          System.out.println(list);
      }
      System.out.println(res.size());
    }

    static void subsequence(List<List<Integer>> res, int[] arr, int n, List<Integer> temp) {
        if ( n >= arr.length) {
            res.add(new ArrayList<>(temp));
            return;
        }

        temp.add(arr[n]);
        subsequence(res, arr, n+1, temp);
        temp.remove(temp.size() - 1);
        subsequence(res, arr, n+1, temp);
    }
}
