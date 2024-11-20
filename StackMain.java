public class StackMain {

    public static void main(String[] args) {

        Stack<Integer> numbers = new Stack<>();

        numbers.push(10);
        numbers.push(20);
        numbers.push(30);
        numbers.printStack();

        numbers.peek();
        numbers.pop();
        numbers.printStack();

        numbers.removeFirst();
        numbers.countNodes();
        numbers.search(23);

        Stack<String> words = new Stack<>();
        words.push("Deepika");
        words.push("Lakshmi");
        words.push("Ramya");
        words.printStack();

        words.pop();
        words.printStack();
    }
}