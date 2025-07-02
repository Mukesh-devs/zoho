package dsa.string;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "LVIII";
        System.out.println(romantoInteger(s));
    }

    public static int romantoInteger(String s) {
        int value = 0, res = 0;
        HashMap<Character,Integer> roman = new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
        for ( int i = 0;i < s.length(); i++ ){
            if ( i+1 < s.length() && roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1)) ) {
                value = roman.get(s.charAt(i+1)) - roman.get(s.charAt(i));
                i++;
            }
            else {
                value = roman.get(s.charAt(i));
            }
            res += value;
        }
        return res;
    }
}