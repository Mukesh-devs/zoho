package dsa.linkedlist;

public class DoubleLL {
    DNode head;
    private int size;
    public void insert(int data) {
        DNode dnode = new DNode(data);

        if ( head == null ) {
            head = dnode;
            size = 1;
            return;
        }

        DNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = dnode;
        dnode.prev = temp;
        size++;
    }
    public void remove(int data) {
        if ( head == null ) {
            return;
        }
        DNode node = head;
        if ( node.data == data) {
            head = node.next;
            if ( head != null) {
                head.prev = null;
            }
            size--;
            return;
        }
        while (node != null && node.data != data) {
            node = node.next;
        }
        if ( node == null) {
            return;
        }
        if (node.prev != null) {
            node.prev.next = node.next;
        }
        if (node.next != null) {
            node.next.prev = node.prev;
        }
        size--;
    }
    public int get(int index) {
        int count = 0;
        DNode node = head;
        if ( index < 0 || index >= size ) {
            return -1;
        }
        while (count < index) {
            node = node.next;
            count++;
        }
        return node.data;
    }
    public String toString() {
        if ( head == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        DNode temp = head;
        sb.append("[");
        while (temp != null ) {
            sb.append(temp.data);
            temp = temp.next;
            if ( temp != null ) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.insert(10);
        dll.insert(30);
        dll.insert(89);
        System.out.println(dll.toString());
        System.out.println(dll.size());
        dll.remove(10);
        System.out.println(dll.get(2));
        System.out.println(dll.toString());
    }
}
