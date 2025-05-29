package dsa.tree;

public class Tree {
    TreeNode root;
    Tree() {
        root = null;
    }
    
    void insert(int data) {
        root = insertRec(root, data);
    }

    TreeNode insertRec(TreeNode root, int data) {
        if ( root == null) {
            root = new TreeNode(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        }
        else if ( data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    
    public static void Inorder(TreeNode node) {
        if ( node == null) {
            return;
        }
        Inorder(node.left);
        System.out.print(node.data + " - ");
        Inorder(node.right);
    }
    public static void PreOrder(TreeNode node) {
        if ( node == null ){
            return;
        }
        System.out.print(node.data + " - ");
        PreOrder(node.left);
        PreOrder(node.right);
    }
    public static void PostOrder(TreeNode node) {
        if ( node == null ) {
            return;
        }
        PostOrder(node.left);
        PostOrder(node.right);
        System.out.print(node.data + " - ");
    }
}
