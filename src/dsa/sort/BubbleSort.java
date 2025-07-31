package dsa.sort;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        for ( int i = 0; i < arr.length - 1; i++) {
            for ( int j = 0; j < arr.length - i - 1; j++ ) {
                if ( arr[j] > arr[j + 1]) {
                    swap(arr,j,j+1);
                }
            }
        }
    }
    static void swap(int[] arr, int a, int b){
        if ( a != b) {
            arr[a] = arr[a] ^ arr[b];
            arr[b] = arr[a] ^ arr[b];
            arr[a] = arr[a] ^ arr[b];
        }
    }
}
