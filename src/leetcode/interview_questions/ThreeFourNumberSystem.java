package leetcode.interview_questions;

public class ThreeFourNumberSystem {
    public static int find(int find) {
        int count = 0;
        int i = 3;
        while ( count != find ) {
            if ( ThreeFour(i) ) {
                count++;
            }
            i++;
        }
        return i-1;
    }
    static boolean ThreeFour(int num ) {
        int rem = 0;
        while ( num != 0 ) {
            rem = num % 10;
            num = num / 10;
            if ( rem != 3 && rem != 4) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int num = 6;
        System.out.println(find(num));
        System.out.println(find(25));
    }
}
