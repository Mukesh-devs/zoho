package dsa.trie;

import java.util.*;

public class FindWords2 {
    public static class TrieNode {
        Map<Character, TrieNode> map = new HashMap<>();
        String word = null;
    }
    public static void main(String[] args) {
        char[][] words = {{'o','a','a','n'},{'e','t','a','e'},
                {'i','h','k','r'},{'i','f','l','v'}};
        String[] word = {"eat"};
        boolean[][] seen = new boolean[words.length][words[0].length];
        TrieNode root = new TrieNode();
        for ( String s : word) {
            TrieNode node = root;
            for ( char c : s.toCharArray() ) {
                node = node.map.computeIfAbsent(c, k -> new TrieNode());
            }
            node.word = s;
        }
        Set<String> res = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[0].length; j++) {
                search(words, root, seen, res, i, j , 0);
            }
        }
        System.out.println(res);
    }

    static void search(char[][] words, TrieNode root, boolean[][] seen, Set<String> res, int row, int col, int index) {
        if ( row < 0 || row >= words.length || col < 0 || col >= words[0].length || seen[row][col]) {
            return;
        }
        char c = words[row][col];
        TrieNode next = root.map.get(c);
        if ( next == null ) {
            return;
        }
        if ( next.word != null) {
            res.add(next.word);
            next.word = null;
        }
        seen[row][col] = true;
        search(words, next, seen, res, row + 1, col, index + 1);
        search(words, next, seen, res, row - 1, col, index + 1);
        search(words, next, seen, res, row, col + 1, index + 1);
        search(words, next, seen, res, row, col - 1, index + 1);
        seen[row][col] = false;
        return;
    }
}
