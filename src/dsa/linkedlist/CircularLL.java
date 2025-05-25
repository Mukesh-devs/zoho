package dsa.linkedlist;

public class CircularLL {
    private int size;
    SNode tail;
    public void insert(int data) {
        SNode newNode = new SNode(data);
        if ( tail == null) {
            tail = newNode;
            tail.next = tail;
            return;
        }
        else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
        return;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        SNode node;

        if ( tail == null) {
            sb.append("[]");
        }
        else {
            node = tail.next;
            sb.append("[");
            while (node != tail) {
                sb.append(node.data);
                node = node.next;
                sb.append(",");
            }
            sb.append(tail.data);
            sb.append("]");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        CircularLL cll = new CircularLL();
        cll.insert(10);
        cll.insert(20);
        cll.insert(85);
        cll.insert(45);
        System.out.println(cll.toString());

    }
}
