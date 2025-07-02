package dsa.string;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

//451
public class SortCharacterByFrequency {
    public static void main(String[] args) {
        String str = "tree";
        System.out.println(characterSort(str));
    }
    public static String characterSort(String str) {
        Map<Character,Integer> freq = new HashMap<>();
        for (char c : str.toCharArray()) {
            freq.put(c,freq.getOrDefault(c,0) + 1);
        }

        PriorityQueue<Character> maxheap = new PriorityQueue<>((a,b) -> freq.get(b) - freq.get(a));

        maxheap.addAll(freq.keySet());

        StringBuilder result = new StringBuilder();
        char ch = ' ';
        int num = 0;
        while (!maxheap.isEmpty()) {
            ch = maxheap.poll();
            num = freq.get(ch);
            result.append(("" + ch).repeat(num));
        }
        return result.toString();
    }
}
