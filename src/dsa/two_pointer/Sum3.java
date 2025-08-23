package dsa.two_pointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3 {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> res = new ArrayList<>();
        sum(arr, res);
        System.out.println(res);

    }
    static void sum(int[] arr, List<List<Integer>> res) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        int i = 0;
        int sum = 0;
        while ( i < arr.length - 1) {
            if ( i > 0 && arr[i] == arr[ i - 1]) {
                i++;
                continue;
            }
            left = i + 1;
            right = arr.length - 1;
            while ( left < right) {
                sum = arr[i] + arr[left] + arr[right];
                if ( sum == 0 ) {
                    res.add(new ArrayList<>(List.of(arr[i],arr[left],arr[right])));
                    left++;
                    right--;
                    while (left < right && arr[left] == arr[left - 1]) left++;
                    while (left < right && arr[right] == arr[right + 1]) right--;
                }
                else if ( sum < 0) {
                    left++;
                }
                else {
                    right--;
                }
            }
            i++;
        }
    }
}
