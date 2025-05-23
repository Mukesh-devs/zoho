package leetcode;
import java.util.*;

public class StringAlternate {
    public static void main(String[] args) {
        String s = "asdcbsdcagfsdbgdfanfghbsfdab";
//        String s = "beabeefeab";
        System.out.println(alternate(s));
//        List<List<Character>> cc = new ArrayList<>();
//        List<Character> c = new ArrayList<>();
//        perm(s,cc,c,0,s.length());
//        System.out.println(cc);
    }
    public static int alternate(String s) {
        Set<Character> ch = new HashSet<>();
        String st = "";

        for ( int i = 0; i < s.length(); i++ ) {
            ch.add(s.charAt(i));
        }
        for ( Character cc : ch) {
            st += cc;
        }
        List<List<Character>> cc = new ArrayList<>();
        List<Character> c = new ArrayList<>();
        perm(st,cc,c,0,st.length());
        System.out.println(cc);
        int max = 0;
        for ( int x = 0; x < cc.size(); x++) {
            String temp=s;
            List<Character> inerlist = cc.get(x);
            for ( int y = 0; y < inerlist.size(); y++ ) {
               temp=temp.replaceAll( inerlist.get(y)+"","");
            }

            String res = temp;
            int len=res.length();
            int i = 0;
            int j = 1;
            while ( i < len && j < len ) {
                if ( res.charAt(0) != res.charAt(i) ) {
                    len=0;
                    break;
                }
                i += 2;
                if ( j < len && res.charAt(1) != res.charAt(j) ) {
                    len = 0;
                    break;
                }
                j += 2;
            }
            System.out.println(res + " " + len);
            max = Math.max(max, len);
        }
        return max;
    }
    static void perm(String s, List<List<Character>> cc, List<Character> c, int index, int len) {
        if ( index == len || len - 2 == c.size() ) {
            if ( len - 2 == c.size() ) {
                cc.add(new ArrayList<>(c));
            }
            return;
        }
        c.add(s.charAt(index));
        perm(s,cc,c,index+1,len);
        c.removeLast();
        perm(s,cc,c,index+1,len);
    }
}
