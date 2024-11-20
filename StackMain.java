public class StackMain
{
    public static void main(String[] args)
    {
        Stack<Integer> numbers = new Stack<>();

        numbers.push(10);
        numbers.push(20);
        numbers.push(30);
        numbers.printStack();
        numbers.search(10);
        numbers.countNodes();
        numbers.removeFirst();

        numbers.peek();
        numbers.pop();
        numbers.printStack();
        numbers.addFirst(23);
        numbers.removeByIndex(2);
        numbers.removeByElement(34);

        Stack<String> words = new Stack<>();
        words.push("Deepika");
        words.push("Lakshmi");
        words.push("Ramya");
        words.printStack();

        words.pop();
        words.printStack();
    }
}