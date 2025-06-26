package leetcode;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {
    public static void main(String[] args) {
        String[] words = {"What","must","be","acknowledgment","shall","be"};
        int maxWidth = 16;

        List<String> res = new ArrayList<>();
        justify(words,maxWidth,res,0,new StringBuilder());
        res.set(res.size() - 1, lastIndex(res.get(res.size() - 1),maxWidth));
        System.out.println(res.get(res.size() - 1));
        System.out.println(res);
//        System.out.println(space("This is an ",16));
    }

    static void justify(String[] words, int max, List<String> res, int index, StringBuilder temp) {
        if( index >= words.length) {
            res.add(space(temp.toString(),max));
            return;
        }
        if ( temp.length() + words[index].length() > max) {
            res.add(space(temp.toString(),max));
            temp.delete(0,temp.length());
        }
        if ( temp.length() + words[index].length() <= max) {
            temp.append(words[index]);
            temp.append(" ");
        }
        justify(words,max,res,index + 1, temp);
    }
    static String space(String str, int max) {
        int totalSpaces = (int) str.chars().filter(c -> c == ' ').count();
        String[] words = str.trim().split("\\s+");
        int numWords = words.length;
        int wordLen = 0;
        for ( int i = 0; i < words.length; i++ ){
            wordLen += words[i].length();
        }
//        System.out.println("lone" + wordLen);
//        System.out.println(wordLen);
        totalSpaces = max - wordLen;
        int spaceBetween = (numWords == 1) ? 0 : totalSpaces / (numWords - 1);
        int extraSpaces = (numWords == 1) ? totalSpaces : totalSpaces % (numWords - 1);
        System.out.println(spaceBetween);
        System.out.println(extraSpaces);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);
            if ( i < words.length - 1) {
                sb.append(" ".repeat(spaceBetween));
            }
            if ( extraSpaces > 0) {
                sb.append(" ");
                extraSpaces--;
            }
        }
        sb.append(" ".repeat(extraSpaces));
//        sb.append(" ".repeat(extraSpaces));
        return sb.toString();
    }
    static String lastIndex(String str, int max) {
        String[] words = str.trim().split("\\s+");
        int wordLen = 0;
        for ( int i = 0; i < words.length; i++ ){
            wordLen += words[i].length();
        }
        int totalSpace = max - wordLen;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++ ) {
            sb.append(words[i]);
            sb.append(" ");
            totalSpace--;
        }
        if ( totalSpace > 0) {
            sb.append(" ".repeat(totalSpace));
        }
        return sb.toString();
    }
}
