public class TreeMain {

    public static void main(String[] args) {

        BinaryTree<Integer> numbers = new BinaryTree<>();

        numbers.insert(40);
        numbers.insert(20);
        numbers.insert(60);
        numbers.insert(10);
        numbers.insert(30);
        numbers.insert(50);
        numbers.insert(70);

        numbers.inOrder();
        numbers.preOrder();
        numbers.postOrder();
    }
}