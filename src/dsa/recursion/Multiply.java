package dsa.recursion;

public class Multiply {
    static void multiply(int n, int m) {
        if ( 10 < m) {
            return;
        }
        System.out.println(n + " * " +m+" = "+(n*m));
        multiply(n,m+1);
    }
    public static void main(String[] args) {
        multiply(2,1);
    }
}
