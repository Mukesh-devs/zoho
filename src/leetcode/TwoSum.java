package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] num = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(num,target)));

    }
    static int[] twoSum(int[] num, int target) {
        Map<Integer, Integer> mem = new HashMap<>();
        int num2;
        for ( int i = 0; i < num.length; i++ ) {
            num2 = target - num[i];
            if ( mem.containsKey(num2)) {
                return new int[] {i, mem.get(num2)};
            }
            else {
                mem.put(num[i],i);
            }
        }
        return new int[] {-1,-1};
    }
    
}
