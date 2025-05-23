package practice;

public class MyArrayList {
    private int[] data;
    private int size;


    public MyArrayList(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    public void insert(int index, int value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if (size == data.length) {
            System.out.println("Array is full, cannot insert.");
            return;
        }
        // Shift elements to the right
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = value;
        size++;
    }

    public void delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    public void update(int index, int value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        data[index] = value;
    }

    public void printList() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList(10);

        list.insert(0, 5);
        list.insert(1, 10);
        list.insert(2, 15);
        list.printList(); // 5 10 15

        list.update(1, 20);
        list.printList(); // 5 20 15

        list.delete(0);
        list.printList(); // 20 15

        list.delete(1);
        list.printList();
    }
}
