package dsa.math;

public class CountOddNumbers {
    public static void main(String[] args) {
        int low = 0;
        int high = 10000000;
        System.out.println(countOdds(low, high));
    }

    static int countOdds(int low, int high) {
        int count = (high - low)/2;
        if ( low % 2 != 0) count++;
        else {
            if (high % 2 != 0) count++;
        }
        return count;
    }




}
