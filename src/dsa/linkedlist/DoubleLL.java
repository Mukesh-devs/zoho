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
    }
}
