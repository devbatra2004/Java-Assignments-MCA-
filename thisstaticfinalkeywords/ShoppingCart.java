
class Product {

    private static double discount = 50.0;
    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayProductDetails() {

        System.out.println("Product ID: " + productID);
        System.out.println("Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }
}

public class ShoppingCart {

    public static void main(String[] args) {
        Product prod1 = new Product(1, "Laptop", 120000, 2);
        Product prod2 = new Product(2, "Phone", 80000, 5);

        prod1.displayProductDetails();
        prod2.displayProductDetails();
        Product.updateDiscount(15);
        System.out.println("New Discount Updated!");
    }
}
