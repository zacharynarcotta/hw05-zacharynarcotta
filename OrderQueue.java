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

    public void addOrder(String name, String date, int quantity) {
        CustomerOrder thisOrder = new CustomerOrder(name, date, quantity);
        this.queue.enqueue(thisOrder);
    }

    public void addStock(int addStock) {
        this.stock += addStock;
    }

    public void fillOrder() {
        CustomerOrder frontOrder = this.queue.getFront();
        frontOrder.quantity--;
        this.stock--;
        if(frontOrder.quantity <= 0) {
            this.queue.dequeue();
        }
    }

    public void sellStock() {
        CustomerOrder frontOrder = this.queue.getFront();
        while(this.stock > 0) {
            this.stock--;
            frontOrder.quantity++;
        }
    }

    @Override
    public String toString() {
        CustomerOrder frontOrder = this.queue.getFront();
        return "" + frontOrder.quantity;
    }
}