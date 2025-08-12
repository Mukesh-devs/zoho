package practice;

import java.util.Arrays;

public class CharArrayOccurance {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        int count = 1;
        int index = 0;
        int i = 0;
        char temp = ' ';
        while (i < chars.length) {
            temp = chars[i];
            count = 0;
            while ( i < chars.length && chars[i] == temp) {
                count++;
                i++;
            }
            chars[index++] = temp;
            if ( count > 1) {
                String str = String.valueOf(count);
                for (char c : str.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

//        chars[--index] = (char) (count + '0');
        System.out.println(Arrays.toString(chars));
        System.out.println(++index);
    }
}
