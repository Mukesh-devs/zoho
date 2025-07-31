package leetcode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        productOfArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void productOfArray(int[] arr) {
        int[] prefix = new int[arr.length];
        int[] suffix = new int[arr.length];
        prefix[0] = arr[0];
        suffix[arr.length - 1] = arr[arr.length - 1];
        for ( int i = 1; i < arr.length; i++ ) {
            prefix[i] = prefix[i - 1] * arr[i];
        }
        for (int j = arr.length - 2; j >= 0; j-- ) {
            suffix[j] = suffix[j + 1] * arr[j];
        }
        System.out.println(suffix[0]);
        arr[0] = suffix[1];
        arr[arr.length - 1] = prefix[arr.length - 2];
        for ( int i = 1; i < arr.length - 1; i++ ) {
            arr[i] = prefix[i - 1] * suffix[i + 1];
        }
    }
}
