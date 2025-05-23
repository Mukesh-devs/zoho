package dsa.sort;

public class SelectionSort {
    
    public static void selectionSort(double[] arr) {
        int min = Integer.MAX_VALUE;
        for ( int i = 0; i < arr.length; i++ ) {
            min = i;
            for ( int j = i; j < arr.length; j++ ) {
                if ( arr[j] > arr[min]) {
                    min = j;
                }
            }
//            swap(arr,i,min);
            double t = arr[i];
            arr[i] = arr[min];
            arr[min] = t;
        }
    }

    static void swap(int[] arr, int a, int b) {
        if ( a != b ) {
            arr[a] = arr[a] ^ arr[b];
            arr[b] = arr[a] ^ arr[b];
            arr[a] = arr[a] ^ arr[b];
        }
    }
}
