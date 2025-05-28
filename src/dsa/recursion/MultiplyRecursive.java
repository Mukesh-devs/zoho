package dsa.recursion;

public class MultiplyRecursive {
    static int multiply(int n, int m) {
        if ( m == 0 ) {
            return 0;
        }
        return n + multiply(n,m-1);
    }
    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        System.out.println(multiply(12,34));
        long t2 = System.currentTimeMillis();
        System.out.println(t2-t1);
    }
}
