public class TreeNode<T>
{
    T data;
    TreeNode<T> left, right;
    TreeNode(T data)
    {
        this.data = data;
        this.left = this.right = null;
    }
}
