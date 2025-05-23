package dsa.linkedlist;

class SNode {
    int data;
    SNode next;

    SNode(int data) {
        this.data = data;
        this.next = null;
    }
}
class DNode {
    int data;
    DNode next;
    DNode prev;

    DNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
