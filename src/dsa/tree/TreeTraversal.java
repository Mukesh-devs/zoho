package dsa.tree;

public class TreeTraversal {
    TreeNode root;
    TreeTraversal() {
        root = null;
    }

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
}
