package dsa.recursion.backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2,3,4,5,6,7};
        int target = 7;
        List<List<Integer>> res = new ArrayList<>();

        comb_sum(candidates,target,0,res,new ArrayList());

        System.out.println(res);
    }

    static void comb_sum(int[] candidates, int target, int index, List<List<Integer>> res, List<Integer> temp) {
        if ( index == candidates.length ) {
            if ( target == 0 ) {
                res.add(new ArrayList<>(temp));
            }
            return;
        }

        if ( candidates[index] <= target ) {
            temp.add(candidates[index]);
            comb_sum(candidates,target - candidates[index], index, res, temp);
            temp.remove(temp.size() - 1);
        }
        comb_sum(candidates,target,index + 1,res,temp);

    }


}
