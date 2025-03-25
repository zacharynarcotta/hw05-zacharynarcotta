public class OrderTester {
    public static void main(String[] args) {
        OrderQueue queue = new OrderQueue(14);
        queue.addOrder("Richard", "March 25, 2025", 5);
        queue.addOrder("Petunia", "March 25, 2025", 5);
        queue.addOrder("Samuel", "March 25, 2025", 8);
        System.out.println(queue.toString());

        queue.sellStock();
        System.out.println(queue.toString());

        queue.addStock(10);
        queue.addOrder("Elvira", "March 25, 2025", 3);
        queue.addOrder("Melusina", "March 25, 2025", 3);
        queue.addOrder("Magdalena", "March 25, 2025", 5);
        queue.sellStock();
        System.out.println(queue.toString());
    }
}