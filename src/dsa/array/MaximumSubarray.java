package dsa.array;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = {3,8,1,8,-6,2,9,2,1,-8,3};
        System.out.println(subArray(arr));
    }

    static int subArray(int[] arr) {
        int curr = arr[0];
        int max = arr[0];

        for ( int i = 1; i < arr.length; i++ ) {
            curr = Math.max(arr[i], curr + arr[i]);
            max = Math.max(max,curr);
        }
        return max;
    }
}
