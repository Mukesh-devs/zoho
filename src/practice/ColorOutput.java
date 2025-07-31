package practice;


import java.util.Scanner;

public class ColorOutput {
        public static void main(String[] args) {
            final String RED = "\u001B[31m";
            final String GREEN = "\u001B[32m";
//            final String RESET = "\u001B[0m";
            final String CYAN = "\u001B[36m";
            final String RESET = "\u001B[0m";

            Scanner scanner = new Scanner(System.in);

            // Colored input prompt
            System.out.print(CYAN + "Enter your name: " + RESET);
            System.out.println(RED + "This is red text!" + RESET);
            System.out.println(GREEN + "This is green text!" + RESET);
        }


}
