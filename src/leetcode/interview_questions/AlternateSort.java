package leetcode.interview_questions;

import java.util.Arrays;

public class AlternateSort {
    public static void sort(int[] arr) {
        int stop = 0;
        int local = 0;
        for (int i = 0; i < arr.length; i++) {
            local = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[local] > arr[j]) {
                    local = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[local];
            arr[local] = temp;

        }

    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,9,1};
        sort(arr); // 1 9 2 8 3 7 4 6 5
        System.out.println(Arrays.toString(arr));
        int i = 0, j = arr.length -1;
        while (i < j ){
            System.out.print(arr[j--]+" ");
            System.out.print(arr[i++]+" ");
        }

        if ( arr.length % 2 != 0) {
            System.out.print(arr[arr.length/2]);
        }
    }
}
