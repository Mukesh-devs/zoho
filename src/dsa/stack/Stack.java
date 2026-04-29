package dsa.stack;

public class Stack<T> {
    int top = -1;
    final int DEFAULT_SIZE = 100;
    Object[] stackArray;

    public Stack() {
        stackArray = new Object[DEFAULT_SIZE];
    }

    public boolean push(T data) {
        if ( isFull()) {
            return false;
        }
        stackArray[++top] = data;
        return true;
    }
    @SuppressWarnings("unchecked")
    public T pop() {
        if ( isEmpty()) {
            throw new RuntimeException("Stack underflow, could not pop element");
        }
        return (T) stackArray[top--];
    }

    @SuppressWarnings("unchecked")
    public T peek() {
        if ( isEmpty()) {
            throw new RuntimeException("Stack underflow, nothing to peek");
        }
        return (T) stackArray[top];
    }

    private boolean isFull() {
        return top == DEFAULT_SIZE - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

}
