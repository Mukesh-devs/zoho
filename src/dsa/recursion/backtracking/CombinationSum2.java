package dsa.recursion.backtracking;

import java.util.*;

public class CombinationSum2 {
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        Arrays.sort(candidates);
        Set<List<Integer>> res = new HashSet<>();
        backtrack(res, candidates, target, 0, new ArrayList<>());
        System.out.println(res);
    }
    static void backtrack(Set<List<Integer>> res, int[] candidates, int target, int index, List<Integer> temp) {
        if ( 0 == target) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for ( int i = index; i < candidates.length; i++ ) {
            if (i > index && candidates[i] == candidates[i - 1]) continue;
            if ( candidates[i] > target) break;
            temp.add(candidates[i]);
            backtrack(res, candidates, target - candidates[i], i + 1, temp);
            temp.remove(temp.size() - 1);
            }
    }
}
