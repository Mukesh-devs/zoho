package zoho.pattern;

public class HollowHourGlass {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                if (j == 0 || i == 0 || i == n || j == 2 * (n - i) - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); 
                }
            }
            System.out.println();
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" "); 
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j == 0 || i == n - 1 || j == 2 * i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}