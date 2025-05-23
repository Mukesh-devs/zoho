package dsa.recursion;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,8,2};
        reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr, int l, int r) {
        if ( l >= r) {
            return;
        }
        swap(arr,l,r);
//        System.out.println(Arrays.toString(arr));
        reverse(arr,l+1,r-1);
    }

    static void swap(int[] arr, int l, int r) {
        arr[l] = arr[l] ^ arr[r];
        arr[r] = arr[l] ^ arr[r];
        arr[l] = arr[l] ^ arr[r];
    }
}
