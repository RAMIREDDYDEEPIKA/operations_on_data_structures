public class LikdListMain
{
    public static void main(String[] args)
    {
        LinkedList<Integer> number=new LinkedList<>();
        number.add(10);
        number.add(30);
        number.add(20);
        number.add(50);
        number.printList();
        number.searching(20);
        System.out.println();
        number.remove(2);
        number.remove(20);
        number.addFirst(70);
        number.printList();
        number.addAtPosition(40,2);
        number.printList();
        number.removeFirst();
        number.printList();
        number.removeByIndex(3);
        number.countNodes();
        number.topElement();
        number.printList();

        System.out.println();
        LinkedList<Character> letters=new LinkedList<>();
        letters.add('d');
        letters.add('e');
        letters.add('a');
        letters.printList();
        System.out.println();
        letters.remove('e');
        letters.printList();
    }
}