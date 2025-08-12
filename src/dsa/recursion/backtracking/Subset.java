package dsa.recursion.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int[] num = {1,2,3};
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> res= new ArrayList<>();
        subset(0,num,temp,res);
        System.out.println(res);
    }

    public static void subset(int index, int[] num, List<Integer> temp, List<List<Integer>> res) {
        if ( index == num.length) {
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(num[index]);
        subset(index + 1,num, temp, res);
        temp.removeLast();
        subset(index + 1,num, temp, res);
    }
}
