package leetcode;

import java.util.Arrays;

public class ConstructProductMatrix {
    public static void main(String[] args) {
//        int[][] arr = {{1, 2}, {3, 4}};
        int[][] arr = {{12345},{2},{1}};
        productMatrix(arr);

    }

        static void productMatrix( int[][] arr) {
            int[] prefix = new int[arr.length * arr[0].length ];
            int[] suffix = new int[arr.length * arr[0].length ];
            int m = arr.length * arr[0].length;
            int t = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    if ( i == 0 && j == 0 ) {
                        prefix[t++] = arr[i][j];
                    }
                    else {
                        prefix[t] = arr[i][j] * prefix[t - 1];
                        t++;
                    }
                }
            }
            System.out.println(t);
            for (int i = arr.length - 1; i >= 0; i--) {
                for (int j = arr[0].length - 1; j >= 0; j--) {
                    if ( i == arr.length - 1 && j == arr[0].length -1) {
                        suffix[--t] = arr[i][j];
                    }
                    else {
                        t--;
                        suffix[t] = arr[i][j] * suffix[t + 1];

                    }
                }
            }
            System.out.println(Arrays.toString(prefix));
            System.out.println(Arrays.toString(suffix));
            t = 0;
            for ( int i = 0; i < arr.length; i++ ) {
                for ( int j = 0; j < arr[0].length; j++, t++ ) {
                    if ( t == 0 ) {
                        arr[i][j] = suffix[t + 1];
                    }
                    else if ( t == prefix.length - 1 ) {
                        arr[i][j] = prefix[t - 1];
                    }
                    else {
                        arr[i][j] = (prefix[t - 1] * suffix[t + 1]);
                    }
                    arr[i][j] = arr[i][j] % 12345;
                }
            }
            System.out.println(Arrays.deepToString(arr));
        }
    }
