package practice;

public class Recu {
    public static void main(String[] args) {
//        System.out.println(rec(5));
        rec(5);
    }
    static int rec(int n) {
        if ( n == 0) {
            return 0;
        }
        System.out.println(n + rec(n - 1));
        return 0;
    }
}
