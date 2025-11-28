package dsa.string;

public class Lcp {
    public static void main(String[] args) {
        String[] arr = {"Geeks", "geek", "geet", "geeksfor"};
        System.out.println(prefix(arr));
    }
    static String prefix(String[] arr) {
        String Short = "";
        int min = Integer.MAX_VALUE;
        for ( String s : arr) {
            if ( s.length() < min) {
                min = s.length();
                Short = s;
            }
        }
        System.out.println(Short);
        int end = Integer.MAX_VALUE;
        for ( String s : arr) {
            for ( int i = 1; i < min; i++ ) {
                if ( !s.substring(0,i).equals(Short.substring(0,i))) {
                    end = Math.min(end, i);
                    break;
                }
            }
        }
        return Short.substring(0,min);
    }
}
