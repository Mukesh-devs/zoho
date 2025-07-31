package timecomplexity;

public class Ex1 {
    public static void main(String[] args) {
        int n = 8;
        int count = 0;
        for ( int i = 1; i <= n; i++ ){
            for ( int j = 1; j <= n; j = j+i) {
                count =+ 1;
            }
        }
        System.out.println(count);
    }
}
