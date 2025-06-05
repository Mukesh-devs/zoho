package dsa.stack;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmallerElement {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        smallerElement(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void smallerElement(int[] arr) {
        Stack<Integer> st = new Stack();
        for ( int i = 0; i < arr.length; i++ ){
            int val = arr[i];
            while ( !st.isEmpty() && arr[i] < st.peek() ) {
                st.pop();
            }
            if ( !st.isEmpty())
                arr[i] = st.peek();
            if ( st.isEmpty())
                arr[i] = -1;
            st.push(val);
        }

    }
}
