package dsa.array;

import java.util.Arrays;

public class LargestLuckyNumber {
    public static void main(String[] args) {
        int[] arr = {1,4,2,6,8,4,4,4,2};
        System.out.println(luckyNumber(arr));
    }
    static int luckyNumber(int[] arr) {
        int[] freq = new int[arr.length];

        for ( int i : arr) {
            freq[i]++;
        }
        int i = 0;
        int max = Integer.MIN_VALUE;
        for ( int k : freq) {
            if ( freq[k] == i++) {
                max = k;
            }
        }
//        System.out.println(Arrays.toString(freq));
        return max;
    }
}
