package dsa.recursion;

public class FindEven {
    static int even(int n ) {
        if ( n == 1 ) {
            return 0;
        }
        if ( n % 2 == 0) {
            return 1 + even(n-1);
        }
        else {
            return even(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(even(n));
    }
}
