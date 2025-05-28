package dsa.tree;

public class TreeTraversal {
    TreeNode root;
    public void Inorder(TreeNode node) {
        if ( node == null) {
            return;
        }
        Inorder(node.left);
        System.out.print(node.data + " - ");
        Inorder(node.right);
    }
    public void PreOrder(TreeNode node) {
        if ( node == null ){
            return;
        }
        System.out.print(node.data + " - ");
        PreOrder(node.left);
        PreOrder(node.right);
    }
    public void PostOrder(TreeNode node) {
        if ( node == null ) {
            return;
        }
        PostOrder(node.left);
        PostOrder(node.right);
        System.out.print(node.data + " - ");
    }
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(10);
        tree.left = new TreeNode(8);
        tree.right = new TreeNode(20);
        tree.left.left = new TreeNode(5);
        tree.left.right = new TreeNode(10);
        tree.right.left = new TreeNode(15);
        tree.right.right = new TreeNode(30);
        System.out.println("Inorder Traversal...");
        TreeTraversal trav = new TreeTraversal();
        trav.Inorder(tree);
        System.out.println("\nPreOrder Traversal...");
        trav.PreOrder(tree);
        System.out.println("\nPostOrder Traversal...");
        trav.PostOrder(tree);
    }
}
