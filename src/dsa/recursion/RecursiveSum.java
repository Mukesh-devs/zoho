package dsa.recursion;

public class RecursiveSum {
    static void sum(int n, int sum) {
        if ( n < 0) {
            System.out.println(sum);
            return;
        }
        sum = sum + n;
        sum(n - 1, sum);
    }

    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        sum(10009,0);
        long t2 = System.currentTimeMillis();
        System.out.println(t2-t1);
    }
}
