package dsa.array;

import java.util.Map;

public class MaxProductSubarray {
    public static void main(String[] args) {
        int[] arr = {1,4,6,0,-1,-2,8};
        int pre = 1;
        int suff = 1;
        int max = Integer.MIN_VALUE;
        for ( int i = 0; i < arr.length; i++ ) {
            if ( pre == 0) pre = 1;
            if ( suff == 0) suff = 1;

            pre = pre * arr[i];
            suff = suff * arr[arr.length - i - 1];

            max = Math.max(max,Math.max(pre,suff));
        }
        System.out.println(max);
    }
}
