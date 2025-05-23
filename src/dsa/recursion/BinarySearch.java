package dsa.recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,11};
        int target = 112;
        search(arr,0,arr.length,target);
    }
    public static void search(int[] arr, int left, int right, int target ) {
        int mid = ( left + right ) / 2;
        if ( left < right ) {
            if (arr[mid] == target) {
                System.out.println("Found..");
            }
            else if (arr[mid] < target) {
                search(arr, mid + 1, right, target);
            }
            else {
                search(arr, left, mid - 1, target);
            }
        }
        else {
            System.out.println("Not Found...");
        }
    }
}
