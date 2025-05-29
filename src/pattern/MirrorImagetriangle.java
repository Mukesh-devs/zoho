package zoho.pattern;

public class MirrorImagetriangle {
    
    public static void main(String[] args) {
        
        int n = 4;
        int t;
        for ( int i = 1; i <= n * 2 - 1; i++ ) {
            t = i <= n ? i : n - i % n;
            for ( int j = 1; j <= n; j++ ) {
                System.out.print( j < t  ? " " : t++ + " " );
            }
            System.out.println();
        }
    }
}
