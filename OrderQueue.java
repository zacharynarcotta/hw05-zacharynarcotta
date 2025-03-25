public class OrderQueue {
    public LinkedQueue<CustomerOrder> queue = new LinkedQueue<CustomerOrder>();
    public int stock;
    public int sizeOfQueue = 0;

    public OrderQueue() {
        stock = 0;
    }
    public OrderQueue(int stock) {
        this.stock = stock;
    }
}