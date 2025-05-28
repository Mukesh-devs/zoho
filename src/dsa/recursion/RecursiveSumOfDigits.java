package dsa.recursion;

public class RecursiveSumOfDigits {
    public static void main(String[] args) {
        int num = 50;
        int sum = 0;
        sum(num,0,sum);

    }
    public static void sum(int num,int rem, int sum) {
        if ( num > 0 ) {
            rem = num % 10;
            num = num / 10;
            sum += rem;
            sum(num,rem,sum);
        }
        else {
            System.out.println(sum);
        }
    }
}
