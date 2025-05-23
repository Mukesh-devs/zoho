package dsa.linkedlist;

public class SingleLL {
    private SNode head;
    public void insert(int data) {
        SNode newNode = new SNode(data);
        if ( head == null ) {
            head = newNode;
            return;
        }
        SNode temp = head;
        while ( temp.next != null ) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public int get(int index) {
        SNode newNode;
        if ( head == null ) {
            return -1;
        }
        if ( index == 0 ) {
            return head.data;
        }
        int i = 1;
        newNode = head.next;
        while ( newNode.next != null ) {
            if ( i == index ) {
                return newNode.data;
            }
            i++;
            newNode = newNode.next;
        }
        if ( index == i ) {
            return newNode.data;
        }
        return -1;
    }
    public void set(int index, int value) {
        SNode node1;
        node1 = head;
        if ( index == 0) {
           node1.data = value;
        }
        for ( int i = 0; i < index; i++ ) {
            try {
                node1 = node1.next;
                if ( index == i ) {
                    node1.data = value;
                }
            }
            catch (NullPointerException E) {
                System.out.println("Index out of Bounds...");
            }
        }
        return;
    }
    public void remove(int data) {
        SNode newNode;
        if ( head == null) {
            return;
        }
        if ( head.data == data) {
            head = head.next;
        }
        newNode = head;
        while (newNode.next != null && newNode.next.data != data) {
            newNode = newNode.next;
        }
        if( newNode.next != null) {
            newNode.next = newNode.next.next;
        }
    }

    public String toString() {
        if ( head == null ) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        SNode trav = head;
        while( trav != null ) {
            sb.append(trav.data);
            trav = trav.next;
            if ( trav != null) sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        SingleLL sll = new SingleLL();
        sll.insert(10);
        sll.insert(20);
        sll.insert(30);
        System.out.println(sll.toString());
        sll.remove(20);
        sll.remove(10);
        System.out.println(sll.toString());
        sll.insert(90);
        sll.insert(12);
        sll.insert(45);
        System.out.println(sll.toString());
        System.out.println(sll.get(0));
        sll.set(5,50);
        System.out.println(sll.toString());
    }
}
