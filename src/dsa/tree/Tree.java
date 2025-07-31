package dsa.tree;

public class Tree extends TreeTraversal{
    TreeNode root;
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
//    TreeNode remove(TreeNode root, int data) {
//
//    }
}
