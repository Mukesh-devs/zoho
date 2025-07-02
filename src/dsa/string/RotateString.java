package dsa.string;
//796
public class RotateString {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(isRotate(s,goal));
    }

    public static boolean isRotate(String s, String goal) {
        if ( s.length() != goal.length()) {
            return false;
        }
        return (s + s).contains(goal);
    }
}
