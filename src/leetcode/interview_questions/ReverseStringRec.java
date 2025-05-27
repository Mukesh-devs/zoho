package leetcode.interview_questions;

public class ReverseStringRec {
    public static void rev(String str, StringBuilder sb, int index, StringBuilder ans) {
        if ( index == -1 ) {
            ans.append(sb.reverse().toString());
            return;
        }
        if ( str.charAt(index) == ' ') {
            ans.append(sb.reverse().toString() + " ");
            sb = new StringBuilder();
            index--;
        }
        rev(str,sb.append(str.charAt(index)),index-1,ans);
    }
    public static void main(String[] args) {
        String str = "One Two Three Four";
        String res = "";
        StringBuilder sb = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        rev(str,sb,str.length()-1,ans);
        System.out.println(ans.toString());
    }
}
