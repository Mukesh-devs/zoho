package zoho.pattern;

public class HollowReverseTriangle {
    
    public static void main(String[] args) {
        
        int n = 5;

        for ( int i = n; i >= 1; i-- ) {
            for ( int j = 1; j <= n + i - 1 ; j++ ) {
                if ( j < n - i + 1 ) {
                    System.out.print(" ");
                }
                else if ( j == n - i + 1 || j == n + i - 1 || i == n ) {
                    System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
