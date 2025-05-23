package leetcode;

public class GcdOfStrings {
    public static void main(String[] args) {
        String str1 = "ABABAB";
        String str2 = "ABAB";
        System.out.println(Gcd.gcdOfStrings(str1,str2));
//        System.out.println();
    }
}

class Gcd {
    public static String gcdOfStrings(String str1, String str2) {
        String res = "d";
        if ( !(str2 + str1).equals(str1 + str2) ) {
            return "";
        }
        int gcd = gcdOf2Numbers(str1.length(),str2.length());

        return str2.substring(0,gcd);
    }
    static int gcdOf2Numbers(int num1, int num2) {
        return num2 == 0 ? num1 : gcdOf2Numbers(num2,num1 % num2);
    }
}