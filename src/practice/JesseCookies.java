package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JesseCookies {
    public static void main(String[] args) {
        int k = 9;
        List<Integer> li = new ArrayList<>(Arrays.asList(1,62,14));
        Collections.sort(li);
        System.out.println(li);
        int res = cookies(li,k,0);
        for ( int t : li) {
            if ( t < k) {
                System.out.println(-1);
                break;
            }
        }
        System.out.println(res);
    }

    static int cookies(List<Integer> list, int k, int count) {
        if ( list.size() > 2 &&  list.get(0) < k && list.get(1) < k) {
            int temp = list.get(0) + (2 * list.get(1));
            list.remove(0);
            list.remove(0);
            list.add(temp);
            count++;
            Collections.sort(list);
            System.out.println(list);
        }
        else {
            return count;
        }
        return cookies(list,k,count);
    }
}
