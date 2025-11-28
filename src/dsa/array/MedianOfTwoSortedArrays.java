package dsa.array;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {2,3,6,7,9};
        int[] arr2 = {1,4,7,8,11};
        System.out.println(median(arr1,arr2));
    }

    static double median(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if ( arr1[i] > arr2[j]) {
                arr[k++] = arr2[j++];
            }
            else {
                arr[k++] = arr1[i++];
            }
        }
        if ( i == arr1.length) {
            while (j < arr2.length) {
                arr[k++] = arr2[j++];
            }
        }
        else {
            while (i < arr1.length) {
                arr[k++] = arr1[i++];
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr.length % 2 == 0 ? (arr[arr.length/2 - 1] + arr[arr.length/2]) / 2.0 : arr[arr.length/2];
    }

}
