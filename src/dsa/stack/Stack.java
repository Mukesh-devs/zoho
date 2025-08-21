package dsa.stack;

public class Stack<T> {
    int top = -1;
    final int DEFAULT_SIZE = 100;
    T[] stackArray;

    public Stack() {
        stackArray = (T[]) new Object[DEFAULT_SIZE];
    }

    public boolean push(T data) {
        if ( isFull()) {
            return false;
        }
        stackArray[++top] = data;
        return true;
    }

    public T pop() {
        if ( isEmpty()) {
            throw new RuntimeException("Stack underflow, could not pop element");
        }
        return stackArray[top--];
    }

    public T peek() {
        if ( isEmpty()) {
            throw new RuntimeException("Stack underflow, nothing to peek");
        }
        return stackArray[top];
    }

    private boolean isFull() {
        if ( top == DEFAULT_SIZE - 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if ( top == -1) {
            return true;
        }
        return false;
    }

}
