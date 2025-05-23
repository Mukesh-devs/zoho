package dsa.recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,72,2};
        int target = 22;
        search(arr,0,target);

    }
    public static void search(int[] arr, int index, int target) {
        if ( index < arr.length) {
            if ( arr[index] == target ) {
                System.out.println("Found...");
                return;
            }
            search(arr,index + 1,target);
        }
        else {
            System.out.println("Not Found...");
        }
    }
}
