public class Stack<T>
{
    public Node<T> top;

    public static class Node<T>
    {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(T data)
    {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed: " + data);
    }

    public T pop()
    {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        T poppedData = top.data;
        top = top.next;
        System.out.println("Popped: " + poppedData);
        return poppedData;
    }

    public T peek()
    {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }
        System.out.println("Top element is: " + top.data);
        return top.data;
    }

    public boolean isEmpty()
    {
        return top == null;
    }
    public void addFirst(T data) {
        if (top == null) {
            push(data);
            return;
        }
        Node<T> temp = top;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node<>(data);
    }

    public T removeFirst() {
        if (top == null) {
            System.out.println("Stack is empty, cannot remove bottom element.");
            return null;
        }
        if (top.next == null) {
            return pop();
        }
        Node<T> temp = top;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        T data = temp.next.data;
        temp.next = null;
        return data;
    }

    public T removeByIndex(int index) {
        if (index < 0) {
            System.out.println("Index must be non-negative.");
            return null;
        }
        if (top == null) {
            System.out.println("Stack is empty, cannot remove by index.");
            return null;
        }
        if (index == 0) {
            return pop();
        }
        Node<T> temp = top;
        for (int i = 0; i < index - 1; i++) {
            if (temp.next == null) {
                System.out.println("Index out of bounds.");
                return null;
            }
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Index out of bounds.");
            return null;
        }
        T data = temp.next.data;
        temp.next = temp.next.next;
        return data;
    }

    public boolean removeByElement(T data) {
        if (top == null) {
            System.out.println("Stack is empty, cannot remove element.");
            return false;
        }
        if (top.data.equals(data)) {
            pop();
            return true;
        }
        Node<T> temp = top;
        while (temp.next != null && !temp.next.data.equals(data)) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Element not found in the stack.");
            return false;
        }
        temp.next = temp.next.next;
        return true;
    }

    public int countNodes() {
        int count = 0;
        Node<T> temp = top;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Numbers of nodes: "+count);
        return count;
    }
    public void search(T data){
        int index=0;
        if(top==data){
            System.out.println("element found at top position :"+index);
        }
        else{
            Node<T> temp=top.next;
            while(temp==null){
                if(temp==data){
                    System.out.println();
                }
            }
        }


    }
    public void printStack() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return;
        }
        Node<T> temp = top;
        while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
        System.out.println();
    }
}
