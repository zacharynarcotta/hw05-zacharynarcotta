public class LinkedNode<T> {
    public T element;
    public LinkedNode<T> next; // pointer to the next element of the chain

    public LinkedNode(T element) {
        this.element = element;
    }
}
