package dsa.stack;

public class CheckStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack();
        stack.push("Apple");
        stack.push("banana");
        System.out.println(stack.peek());
        stack.push("cat");
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());
    }
}
