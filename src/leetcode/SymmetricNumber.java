package leetcode;

public class SymmetricNumber {
    public static void main(String[] args) {
        Symmetric sy = new Symmetric();
        int low = 1200;
        int high = 1230;
        System.out.println(sy.countSymmetricIntegers(low, high));
    }

}
    class Symmetric {
        public int countSymmetricIntegers(int low, int high) {
            int count = 0;
            String s = "";
            for ( int i = low; i <= high; i++ ) {
                s = i + "";
    //            System.out.println(s);
                if ( s.length() >= 2 && s.length() % 2 == 0 && checkEquals(s) ) {
    //                System.out.println(s);
                    count++;
                }
            }
            return count;
        }
        static boolean checkEquals(String s) {
            int leftSum = 0;
            int rightSum = 0;
            int tempSum = 0;
    //        System.out.println(s);
    //        if ( s.length() % 2 != 0) {
    //            System.out.println(s);
    //            return false;
    //        }
            for (int i = 0; i < s.length(); i++ ) {
                tempSum += Character.getNumericValue(s.charAt(i));
    //            System.out.println(tempSum);
                if ( (s.length() / 2) - 1 == i) {
                    leftSum = tempSum;
                    tempSum = 0;
                }
            }
            rightSum = tempSum;
            return leftSum == rightSum ? true : false;
        }
    }