package dsa.sort;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
//        int[] arr = {8,4,9,2,1,6,5,3};
        double[] f = {-100.0, 50.0, 0.0, 56.6, 90.0, 0.12, 0.12, 2.34, 0.0};
        System.out.println(Arrays.toString(f));
        // BubbleSort.bubbleSort(arr);
        // MergeSort.mergeSort(arr,0,arr.length - 1);
        // QuickSort.quickSort(arr,0,arr.length - 1);
        // InsertionSort.insertionSort(arr);
        SelectionSort.selectionSort(f);
        System.out.println(Arrays.toString(f));
    }




}
