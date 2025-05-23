package dsa.sort;

public class QuickSort {
    public static void quickSort(int[] arr, int low,int high) {
        if ( low < high ) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    
    static int partition(int[] arr, int low, int high) {

        int pivot = arr[low];
        int i = low;
        int j = high;

        while( i < j ) {
            while ( pivot >= arr[i] && i < high ) {
                i++;
            }
            while ( pivot < arr[j] && j > low ) {
                j--;
            }
            if ( i < j ) {
                swap(arr,i,j);
            }
        } 
        swap(arr, low, j);
        return j;
    }

    static void swap(int[] arr, int a, int b) {
        if ( a != b) {
            arr[a] = arr[a] ^ arr[b];
            arr[b] = arr[a] ^ arr[b];
            arr[a] = arr[a] ^ arr[b];
        }
    }
}
