
public class CartItem {

    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    void addItem(int qty) {
        quantity = quantity + qty;
    }

    void removeItem(int qty) {
        quantity = quantity - qty;
    }

    void displayTotalCost() {
        double total = price * quantity;
        System.out.println("Total cost = " + total);
    }

    public static void main(String[] args) {
        CartItem cart = new CartItem("Book", 100, 2);

        cart.displayTotalCost();

        cart.addItem(3);
        cart.displayTotalCost();

        cart.removeItem(2);
        cart.displayTotalCost();
    }
}
