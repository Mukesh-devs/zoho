package dsa.tree;

public class TreeMain {
    
    public static void main(String[] args) {
        // TreeNode tree = new TreeNode(10);
        // tree.left = new TreeNode(8);
        // tree.right = new TreeNode(20);
        // tree.left.left = new TreeNode(5);
        // tree.left.right = new TreeNode(10);
        // tree.right.left = new TreeNode(15);
        // tree.right.right = new TreeNode(30);
        // System.out.println("Inorder Traversal...");
        // TreeTraver trav = new TreeTraversal();
        // trav.Inorder(tree);
        // System.out.println("\nPreOrder Traversal...");
        // trav.PreOrder(tree);
        // System.out.println("\nPostOrder Traversal...");
        // trav.PostOrder(tree);
        Tree tree = new Tree();
        tree.insert(10);
        tree.insert(8);
        tree.insert(20);
        tree.insert(5);
        tree.insert(10);
        tree.insert(15);
        tree.insert(30);

        tree.PreOrder(tree.root);

    }
}
