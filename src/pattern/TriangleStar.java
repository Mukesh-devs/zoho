package zoho.pattern;

public class TriangleStar {
    
    public static void main(String[] args) {
        
        int n = 5;

        for ( int i = 1; i <= n; i++ ) {
            for ( int j = 1; j <= n ; j++ ) {
                System.out.print( j <= n - i ? " " : "* ");
            }
            System.out.println();
        }
    }
}
