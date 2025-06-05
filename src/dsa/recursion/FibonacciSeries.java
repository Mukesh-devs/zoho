package dsa.recursion;

import java.util.Arrays;

public class FibonacciSeries {
    static int fibonacci(int n) {
        if ( n == 0 || n == 1 ) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    static int fibo(int[] fib,int n) {
        if ( n <= 1 ) {
            return fib[n];
        }
        if ( fib[n] != -1) {
            return fib[n];
        }
        return fib[n] = fib[n-1] + fib[n-2];
    }
    public static void main(String[] args) {
        int n = 5;
        int[] fib = new int[n +1];
        Arrays.fill(fib, -1);
//        System.out.println(fibo(fib,5));
        System.out.println(fibonacci(12));
    }
}
