package zoho.pattern;

public class PalindromeTriangle {
    
    public static void main(String[] args) {
        
        int n = 5;
        int t;
        for ( int i = 1; i <= n; i++ ) {
            for ( int j = n - 1; j >= i; j-- ) {
                System.out.print(" ");
            }
            t = i;
            for ( int k = 1; k <= 2 * i - 1 ; k++) {
                System.out.print(k < i ? t-- : t++);
            }
            System.out.println();
        }
    }
}
