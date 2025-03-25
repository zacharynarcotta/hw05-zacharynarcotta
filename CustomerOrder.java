public class CustomerOrder {
    public String name;
    public String date;
    public int quantity = 0;

    public CustomerOrder() {
        name = null;
        date = null;
    }

    public CustomerOrder(String name, String date, int quantity) {
        this.name = name;
        this.date = date;
        this.quantity = quantity;
    }

    void ship(int quantity) {
        if(!(this.quantity - 1 < 0)) {
            this.quantity--;
        }
    }
}