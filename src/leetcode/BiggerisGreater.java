package leetcode;

public class BiggerisGreater {
    public static void main(String[] args) {
        String str = "ab";
        char[] c = str.toCharArray();
        nextBigger(c);
        String res = str.equals(new String(c)) ? "no answer": new String(c);
        System.out.println(str);
        System.out.println(new String(c));
    }

    static void nextBigger(char[] c) {
        int index = c.length - 2;

        while (index >= 0 && c[index] > c[index + 1]) {
            index--;
        }
        if ( index < 0) return;

        int temp = c.length - 1;
        if ( index >= 0) {
            while (index < temp && c[index] > c[temp]) {
                temp--;
            }
        }
        swap(c,index,temp);
        int start = index + 1;
        int end = c.length - 1;
        reverse(c,start,end);

    }
    static void swap(char[] c, int a, int b) {
        char temp = c[a];
        c[a] = c[b];
        c[b] = temp;
    }
    static void reverse(char[] c, int a, int b) {
        while ( a < b) {
            swap(c,a,b);
            a++;
            b--;
        }
    }
}
