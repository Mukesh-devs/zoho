package dsa.sort;

public class InsertionSort {
    
    public static void insertionSort(int[] arr) {
        int j = 0;
        for ( int i = 0; i < arr.length; i++ ) {
            j = i;
            while ( j > 0 && arr[j] < arr[j - 1] ) {
                swap(arr,j,j-1);
                j--;
            }
        } 
    }

    static void swap(int[] arr, int a, int b ) {
        if ( a != b ) {
            arr[a] = arr[a] ^ arr[b];
            arr[b] = arr[a] ^ arr[b];
            arr[a] = arr[a] ^ arr[b];
        }
    }
    
}
