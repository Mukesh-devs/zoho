package dsa.recursion;

public class Square {
    static int sq(int n , int p) {
        if ( p == 0) {
            return 0;
        }
        return n + sq(n,p-1);
    }
    static int square(int n) {
        return sq(n,n);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(square(n));
    }
}
