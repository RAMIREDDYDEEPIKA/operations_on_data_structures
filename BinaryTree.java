public class BinaryTree<T> {

    public TreeNode<T> root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(T data) {
        root = insertRec(root, data);
    }

    public TreeNode<T> insertRec(TreeNode<T> node, T data) {
        if (node == null) {
            node = new TreeNode<>(data);
            return node;
        }

        if (data.hashCode() < node.data.hashCode()) {
            node.left = insertRec(node.left, data);
        } else {
            node.right = insertRec(node.right, data);
        }
        return node;
    }

    public void inOrder() {
        System.out.print("In-order Traversal: ");
        inOrderRec(root);
        System.out.println();
    }

    private void inOrderRec(TreeNode<T> node) {
        if (node != null) {
            inOrderRec(node.left);
            System.out.print(node.data + " ");
            inOrderRec(node.right);
        }
    }

    public void preOrder() {
        System.out.print("Pre-order Traversal: ");
        preOrderRec(root);
        System.out.println();
    }

    public void preOrderRec(TreeNode<T> node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrderRec(node.left);
            preOrderRec(node.right);
        }
    }

    public void postOrder() {
        System.out.print("Post-order Traversal: ");
        postOrderRec(root);
        System.out.println();
    }

    public void postOrderRec(TreeNode<T> node) {
        if (node != null) {
            postOrderRec(node.left);
            postOrderRec(node.right);
            System.out.print(node.data + " ");
        }
    }
}
