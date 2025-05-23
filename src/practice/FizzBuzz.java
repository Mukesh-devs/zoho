package practice;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        int n = 5;
        String str;
        List<String> list = new ArrayList<>();
        for ( int i = 1; i <= n; i++ ) {
            str = "";
            if ( i % 3 == 0 || i % 5 == 0) {
                str += "Fizz";
                if ( i % 5 == 0) {
                    str += "Buzz";
                }
            }
            else {
                str = i + "";
            }
            list.add(str);
        }
        System.out.println(list);
    }
}
