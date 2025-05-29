package zoho.pattern;

public class Reversenumbertriangle {
    
    public static void main(String[] args) {
        
        int n = 5;
        int t;
        for ( int i = 1; i <= n; i++ ) {
            t = i;
            for ( int j = 1; j <= n; j++ ) {
                System.out.print( j <= i ? " " : t++ + " " );
            }
            System.out.println();
        }
    }
}
