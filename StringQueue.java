public class StringQueue
{
    private class Node 
    {
        private String item;
        private Node next;
    }
    
    private Node head;
    private Node tail;
    
    public StringQueue() {
        head = null;
        tail = null;
    }
    
    public void enqueue(String newItem) {
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
    
    public String dequeue() {
        if (isEmpty()) 
        {
            return "";
        }
        String item = head.item;
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