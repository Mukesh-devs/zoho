package dsa.array;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 45, 9, 25, 78};
        int max = arr[0];
        for ( int i : arr) {
            if ( i > max) {
                max = i;
            }
        }
        System.out.println(max);
    }
}
