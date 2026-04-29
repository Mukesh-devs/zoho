package dsa.array;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3,2,6,4,8,9,1,9};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int[] arr, int left, int right) {
        if ( left < right) {
            int mid = (left + right ) / 2;
            sort(arr, left, mid);
            sort(arr, mid + 1, right);

            arrange(arr, left, mid, right);
        }

    }
    static void arrange(int[] arr, int left, int mid, int right) {
        int L = mid - left + 1;
        int R = right - mid;
        int[] LArray = new int[L];
        int[] RArray = new int[R];

        for ( int i = 0; i < L;i++ ) {
            LArray[i] = arr[left + i];
        }
        for ( int i = 0; i < R; i++ ) {
            RArray[i] = arr[mid + i + 1];
        }
        int i = 0;
        int j = 0;
        int k = left;
        while ( i < L && j < R) {
            if ( LArray[i] > RArray[j]) {
                arr[k] = RArray[j];
                j++;
                k++;
            }
            else {
                arr[k] = LArray[i];
                i++;
                k++;
            }
        }
        while (i < L) {
            arr[k] = LArray[i];
            i++;
            k++;
        }
        while (j < R) {
            arr[k] = RArray[j];
            j++;
            k++;
        }
    }

}
