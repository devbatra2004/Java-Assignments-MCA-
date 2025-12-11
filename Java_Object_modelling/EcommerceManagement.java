
import java.util.ArrayList;
import java.util.List;

class Product {

    private String productName;
    private double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}

class Order {

    int orderId;
    private List<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public void showOrderDetails() {
        System.out.println("\nOrder ID: " + orderId);
        System.out.println("Products in this order:");
        double total = 0;
        for (Product p : products) {
            System.out.println("- " + p.getProductName() + " : Rs." + p.getPrice());
            total += p.getPrice();
        }
        System.out.println("Total Amount: Rs." + total);
    }
}

class Customers {

    private String customerName;
    private List<Order> orders;

    public Customers(String customerName) {
        this.customerName = customerName;
        orders = new ArrayList<>();
    }

    public void placeOrder(Order o) {
        System.out.println("\n" + customerName + " placed Order ID " + o.orderId);
        orders.add(o);
    }

    public void showMyOrders() {
        System.out.println("\nOrders placed by: " + customerName);
        for (Order o : orders) {
            o.showOrderDetails();
        }
    }
}

public class EcommerceManagement {

    public static void main(String[] args) {

        Product p1 = new Product("Earbuds", 1239);
        Product p2 = new Product("sleve", 299);
        Product p3 = new Product("USB", 299);
        Product p4 = new Product("Speaker", 99);

        Customers c1 = new Customers("kaalu singh");

        Order o1 = new Order(101);
        Order o2 = new Order(102);

        o1.addProduct(p1);
        o1.addProduct(p3);

        o2.addProduct(p2);
        o2.addProduct(p4);
        o2.addProduct(p3);

        c1.placeOrder(o1);
        c1.placeOrder(o2);

        c1.showMyOrders();
    }
}
