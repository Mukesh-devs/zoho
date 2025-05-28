package dsa.recursion;

public class NNaturalNum {
    static void natural(int n, int i) {
        if (n < i ) {
            return;
        }
        System.out.println(i);
        natural(n,i+1);
    }

    public static void main(String[] args) {
        natural(10,1);
    }
}
