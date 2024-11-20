public class LinkedList<T>
{
    public Node<T> head;
    public void add(T data)
    {
        Node<T> newNode = new Node<>(data);
        if (head == null)
        {
            head = newNode;
        }
        else {
            Node<T> current = head;
            while (current.next != null)
            {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Added: " + data);
    }
    public void remove(T data)
    {
        if (head == null)
        {
            System.out.println("List is empty");
            return;
        }
        if (head.data.equals(data))
        {
            head = head.next;
            System.out.println("Removed a element " + data);
            return;
        }
        Node<T> current = head;
        while (current.next != null)
        {
            if (current.next.data.equals(data))
            {
                current.next = current.next.next;
                System.out.println("Removed a element: " + data);
                return;
            }
            current = current.next;
        }
        System.out.println();
        System.out.println("Element not found: " + data);
    }
    public void addFirst(T data)
    {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        System.out.println("Added at first: " + data);
    }
    public void addAtPosition(int position, T data)
    {
        if (position <= 0)
        {
            System.out.println("Invalid position!");
            return;
        }
        Node<T> newNode = new Node<>(data);
        if (position == 1)
        {
            addFirst(data);
            return;
        }
        Node<T> current = head;
        int currentIndex = 1;
        while (current != null && currentIndex < position - 1)
        {
            current = current.next;
            currentIndex++;
        }
        if (current == null)
        {
            System.out.println("Position out of bounds.");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
        System.out.println("Added at position " + position + ": " + data);
    }
    public void removeByIndex(int index)
    {
        if (index < 0 || head == null)
        {
            System.out.println("Invalid index or empty list!");
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        Node<T> current = head;
        int currentIndex = 0;
        while (current.next != null && currentIndex < index - 1) {
            current = current.next;
            currentIndex++;
        }
        if (current.next == null)
        {
            System.out.println("Index out of bounds!");
            return;
        }
        current.next = current.next.next;
        System.out.println("Removed element at index " + index);
    }
    public void removeFirst()
    {
        if (head == null) {
            System.out.println("List is empty. Nothing to remove.");
            return;
        }
        System.out.println("Removed first element: " + head.data);
        head = head.next;
    }
    public int countNodes()
    {
        int count = 0;
        Node<T> current = head;
        while (current != null)
        {
            count++;
            current = current.next;
        }
        System.out.println("Total nodes: " + count);
        return count;
    }
    public boolean searching(T data)
    {
        Node<T> current = head;
        while (current != null)
        {
            if (current.data.equals(data))
            {
                System.out.println("Element found: " + data);
                return true;
            }
            current = current.next;
        }
        System.out.println("Element not found: " + data);
        return false;
    }
    public T topElement()
    {
        if (head == null)
        {
            System.out.println("List is empty.");
            return null;
        }
        System.out.println("Top element: " + head.data);
        return head.data;
    }
    public void printList()
    {
        if (head == null)
        {
            System.out.println("List is empty.");
            return;
        }
        Node<T> current = head;
        System.out.print("LinkedList: ");
        while (current != null)
        {
            System.out.print(current.data + "  ");
            current = current.next;
        }
        System.out.println();
    }
}
