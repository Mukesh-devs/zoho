package zoho.pattern;

public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 5; 

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            int value = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}