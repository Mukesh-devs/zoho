package dsa.linkedlist;

public class DoubleLL {
    DNode head;
    public void insert(int data) {
        DNode dnode = new DNode(data);

        if ( head == null ) {
            head = dnode;
        }

        DNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = dnode;
        dnode.prev = temp;
    }

    public String toString() {
        if ( head == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        DNode temp = head;
        while (temp.next != null ) {
            sb.append(temp.data);
            temp = temp.next;
            sb.append(",");
        }
        return sb.toString();
    }
    

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.insert(10);
        dll.insert(30);
        dll.insert(89);
        System.out.println(dll.toString());
    }
}
