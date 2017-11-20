public class GenericQueue {
    private class Node {
        private T item;
        private Node next;
    }
    
    private Node head;
    private Node tail;
    
    public GenericQueue() {
        head = null;
        tail = null;
    }
    
    public void enqueue(T newItem) {
        Node oldlast = tail;
        tail = new Node();
        tail.item = newItem;
        tail.next = null;
        if (isEmpty()) 
        {
            head = tail;
        }
        else 
        {
        oldlast.next = tail;
        }
    }
    
    public T dequeue() {
        if (isEmpty()) 
        {
            return null;
        }
        T item = head.item;
        head = head.next;
        if (isEmpty()) 
        {
            tail = null;
        }
        return item;
    }
    public boolean isEmpty()
    {
        return head == null;
    }
}