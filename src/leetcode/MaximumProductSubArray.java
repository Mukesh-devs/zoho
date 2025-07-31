package leetcode;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        int[] arr = {2,4,-8,4,-1};
        System.out.println(maximumProduct(arr));
    }

    static int maximumProduct(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int temp;
        int res = 0;
        for ( int i = 1; i < arr.length; i++ ) {
            temp = max;
            max = Math.max(arr[i],Math.max(max * arr[i], min * arr[i]));
            min = Math.min(arr[i], Math.min(temp * arr[i], min * arr[i]));

            res = Math.max(res, max);
        }
        return res;
    }
}
