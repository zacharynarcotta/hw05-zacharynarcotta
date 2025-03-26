public class LinkedQueue<T> implements Queue<T> {

    private LinkedNode<T> head; 
    private LinkedNode<T> tail;
    private int size = 0;

    public LinkedQueue() {
        head = null;
    }

    public void enqueue(T element) {
        if(head == null) {
            head = new LinkedNode<T>(element);
            tail = head; 
            size = 1;
        }
        else {
            tail.next = new LinkedNode<T>(element);
            tail = tail.next; 
            size++;
        }
    }

    public T dequeue() {
        if(head == null) {
            return null;
        }
        else if(head == tail) {
            LinkedNode<T> temp = head;
            head = head.next;
            tail = null;
            size--;
            return temp.element;
        }
        else {
            LinkedNode<T> temp = head;
            head = head.next;
            size--;
            return temp.element;
        }
    }

    public T getFront() {
        if(!isEmpty()) {
            return head.element;
        }
        else {
            return null;
        } 
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }
    
}