package dsa.linkedlist;

public class CircularLL {
    private int size;
    SNode tail;
    public void insert(int data) {
        SNode newNode = new SNode(data);
        if ( tail == null) {
            tail = newNode;
            tail.next = tail;
            size = 1;
            return;
        }
        else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    public void remove(int data) {
        if (tail == null) {
            return;
        }

        SNode curr = tail.next;
        SNode prev = tail;
        boolean found = false;

        do {
            if (curr.data == data) {
                found = true;
                break;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != tail.next);

        if (!found) {
            return;
        }

        if (curr == tail && curr == tail.next) {
            tail = null;
        } else {
            prev.next = curr.next;
            if (curr == tail) {
                tail = prev;
            }
        }
        size--;
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
    public int size() {

        return size;
    }
    public static void main(String[] args) {
        CircularLL cll = new CircularLL();
        cll.insert(10);
        cll.insert(20);
        cll.insert(85);
        cll.insert(45);
        System.out.println(cll.toString());
        cll.remove(45);
        System.out.println(cll.toString());
        System.out.println(cll.size());

    }
}
