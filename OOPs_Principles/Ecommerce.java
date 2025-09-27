
abstract class Product {

    int productId;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.productId = id;
        this.name = name;
        this.price = price;
    }

    abstract double calculateDiscount();

    abstract double calculateTax();

    void printFinalPrice() {
        double discount = calculateDiscount();
        double tax = calculateTax();
        double finalPrice = price + tax - discount;
        System.out.println(name + " Final Price: " + finalPrice);
    }
}

class Electronics extends Product {

    Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    double calculateDiscount() {
        return price * 0.1;
    }

    double calculateTax() {
        return price * 0.18;
    }
}

class Clothing extends Product {

    Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    double calculateDiscount() {
        return price * 0.2;
    }

    double calculateTax() {
        return price * 0.05;
    }
}

class Groceries extends Product {

    Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    double calculateDiscount() {
        return price * 0.05;
    }

    double calculateTax() {
        return 0;
    }
}

public class Ecommerce {

    public static void main(String[] args) {
        Electronics e = new Electronics(1, "Laptop", 50000);
        Clothing c = new Clothing(2, "Shirt", 2000);
        Groceries g = new Groceries(3, "Rice", 1000);

        e.printFinalPrice();
        c.printFinalPrice();
        g.printFinalPrice();
    }
}
