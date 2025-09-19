package dsa.recursion.backtracking;

import java.util.ArrayList;
import java.util.List;

public class WordSearch2 {
    public static void main(String[] args) {
        String[][] words = {{"o","a","a","n"},{"e","t","a","e"},
                {"i","h","k","r"},{"i","f","l","v"}};
        String[] word = {"eat"};
        boolean[][] seen = new boolean[words.length][words[0].length];
        List<String> res = new ArrayList<>();
        for ( int k = 0; k < word.length; k++ ) {
            for (int i = 0; i < words.length; i++) {
                for (int j = 0; j < words[0].length; j++) {
                    if ( word[k].charAt(0) == words[i][j].charAt(0)) {
                        search(words, word[k], seen, res, i, j , 0);
                    }
                }
            }
        }
        System.out.println(res);
    }

    static void search(String[][] words, String word, boolean[][] seen, List<String> res, int row, int col, int index) {
        if ( row < 0 || row >= words.length || col < 0 || col >= words[0].length || seen[row][col] || word.charAt(index) != words[row][col].charAt(0)) {
            return;
        }
        if ( index == word.length() - 1) {
            res.add(word);
            return;
        }
        seen[row][col] = true;
        search(words, word, seen, res, row + 1, col, index + 1);
        search(words, word, seen, res, row - 1, col, index + 1);
        search(words, word, seen, res, row, col + 1, index + 1);
        search(words, word, seen, res, row, col - 1, index + 1);
        seen[row][col] = false;
        return;
    }
}
