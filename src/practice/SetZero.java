package practice;

import java.util.Arrays;

class Solution1 {
    public void setZeroes(int[][] matrix) {
        int col = matrix[0].length;
        int row = matrix.length;
//        List<List<Integer>> zero = new ArrayList<>();
        int fr = 0;
        int fc = 0;

        for ( int i = 0; i < row; i++) {
            for ( int j = 0; j < col; j++) {
                if ( matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;

//                    matrix[i][j] = 1;
//                    1 1 1     0 0 0   1 0 1
//                    1 0 1     0 0 0   0 0 1
//                    0 1 1     0 0 1   0 1 1
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        for ( int x = 0; x < col; x++) {
            if ( matrix[0][x] == 0 ) {
                for ( int y = 0; y < row; y++ ) {
                    matrix[y][x] = 0;
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        for ( int x = 1; x < row; x++) {
            if ( matrix[x][0] == 0 ) {
                for ( int y = 0; y < col; y++ ) {
                    matrix[x][y] = 0;
                }
            }
        }
//        for ( int y = 0; y < col; y++) {
//            matrix[rowtemp][y] = 0;
//        }
//        zero.forEach( a -> {
//            int rowtemp = a.get(0);
//            int coltemp = a.get(1);
//
//            for ( int x = 0; x < row; x++) {
//                matrix[x][coltemp] = 0;
//            }
//
//            for ( int y = 0; y < col; y++) {
//                matrix[rowtemp][y] = 0;
//            }
//
//        });
    }
}

public class SetZero {
    public static void main(String[] args) {
        Solution1 s = new Solution1();

        int[][] matrix = {{1,1,1},{1,0,1},{0,1,1}};
        s.setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}