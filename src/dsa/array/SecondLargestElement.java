package dsa.array;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr= { 1,56,7,211,8,9,34};
        int max = arr[0];
        int second = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if ( arr[i] > max) {
                second = max;
                max = arr[i];
            }
            if ( second < arr[i] && max > arr[i]) {
                second = arr[i];
            }
        }
        System.out.println(second);
    }
}
