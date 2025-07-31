package dsa.recursion;

public class DivisionRecusive {
    static int divide(int dd, int dr) {
        if ( dd < dr ) {
            return 0;
        }
        return 1 + divide(dd-dr,dr);
    }
    public static void main(String[] args) {
        System.out.println(divide(11,7));
    }
}
