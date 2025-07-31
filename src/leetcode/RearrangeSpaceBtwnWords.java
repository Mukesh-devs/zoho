package leetcode;

public class RearrangeSpaceBtwnWords {
    public static void main(String[] args) {
        String str = "  hello";

        int totalSpaces = (int) str.chars().filter(c -> c == ' ').count();

        String[] words = str.trim().split("\\s+");
        int numWords = words.length;

        int spaceBetween = (numWords == 1) ? 0 : totalSpaces / (numWords - 1);
        int extraSpaces = (numWords == 1) ? totalSpaces : totalSpaces % (numWords - 1);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);
            if (i < words.length - 1) {
                sb.append(" ".repeat(spaceBetween));
            }
        }
        sb.append(" ".repeat(extraSpaces));

        System.out.println("[" + sb.toString() + "]");
    }
}
