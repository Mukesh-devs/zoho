package practice;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int key) {
        data = key;
        left = right = null;
    }
}
public class BinaryTree {
    Node root;
    void inorder(Node node) {
        if ( node == null ) {
            return;
        }
        inorder(node.left);
        System.out.println(node.data);
        inorder(node.right);

    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);
        System.out.println("Inorder....");

        tree.inorder(tree.root);
    }
}
