package dsa.sort;

public class MergeSort {
    public static void mergeSort( int[] arr,int left,int right ) {
        if ( left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }
    static void merge(int[] arr, int left, int mid, int right) {
        int L = mid - left + 1;
        int R = right - mid;

        int[] LArray = new int[L];
        int[] RArray = new int[R];

        for ( int i = 0; i < L; i++ ) {
            LArray[i] = arr[left + i];
        }
        for ( int j = 0; j < R; j++ ) {
            RArray[j] = arr[mid + j + 1];
        }
        int i = 0;
        int j = 0;
        int k = left;
        while ( i < L && j < R) {
            if ( LArray[i] <= RArray[j] ) {
                arr[k] = LArray[i];
                i++;
            }
            else {
                arr[k] = RArray[j];
                j++;
            }
            k++;
        }
        while ( i < L ) {
            arr[k] = LArray[i];
            i++;
            k++;
        }
        while ( j < R ) {
            arr[k] = RArray[j];
            j++;
            k++;
        }
    }
}
