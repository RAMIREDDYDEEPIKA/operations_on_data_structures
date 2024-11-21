public class Queue<T> {

    public Node<T> front, rear;
    public int size;

    public boolean isEmpty() {
        return true;
    }

    public static class Node<T> {
        T data;
        Node<T> next;
        Node<T> front;
        Node<T> rear;

        Node(T data) {
            this.data = data;
            this.next = null;
            this.front=null;
            this.rear=null;
        }
    }

    public Queue() {
        this.front = this.rear = null;
        this.size = 0;
    }

    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (rear == null) {
            rear = front = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Queue Elements : " + data);
    }

    public T dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return null;
        }
        T data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return data;
    }

    public T peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return null;
        }
        return front.data;
    }
    public int size() {
        
        return size;
    }

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        if (front == null) {
            front = rear = newNode;
        } else {
            newNode.next = front;
            front = newNode;
        }
        size++;
        System.out.println("Added element at first: " + data);
    }

    public void addAtPosition(int index, T data) {
        if (index < 0 || index > size) {
            System.out.println("Position out of bounds");
            return;
        }
        Node<T> newNode = new Node<>(data);
        if (index == 0) {
            addFirst(data);
            return;
        }

        Node<T> temp = front;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
        System.out.println("Element added at position " + index + ": " + data);
    }

    public void printQueue() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }
        Node<T> temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void removeFirst() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        System.out.println("Removed first element");
    }

    public void removeByIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        }

        Node<T> temp = front;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if (temp.next == null) {
            rear = temp;
        }
        size--;
        System.out.println("Removed element at index " + index);
    }

    public int countElements() {
        return size;
    }
}
