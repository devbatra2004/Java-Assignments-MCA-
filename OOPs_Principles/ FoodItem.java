
interface Discountable {

    void applyDiscount(double percent);

    void getDiscountDetails();
}

abstract class FoodItem {

    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void getItemDetails() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity);
    }

    abstract double calculateTotalPrice();

    public static void main(String[] args) {
        FoodItem f1 = new VegItem("Paneer", 150, 2);
        FoodItem f2 = new NonVegItem("Chicken", 200, 1);

        ((Discountable) f1).applyDiscount(10);
        ((Discountable) f2).applyDiscount(5);

        f1.getItemDetails();
        ((Discountable) f1).getDiscountDetails();
        System.out.println("Total Price: " + f1.calculateTotalPrice());

        f2.getItemDetails();
        ((Discountable) f2).getDiscountDetails();
        System.out.println("Total Price: " + f2.calculateTotalPrice());
    }
}

class VegItem extends FoodItem implements Discountable {

    private double discount;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    double calculateTotalPrice() {
        return (getPrice() * getQuantity()) - discount;
    }

    public void applyDiscount(double percent) {
        discount = (getPrice() * getQuantity()) * percent / 100;
    }

    public void getDiscountDetails() {
        System.out.println("Veg discount applied: " + discount);
    }
}

class NonVegItem extends FoodItem implements Discountable {

    private double extraCharge = 20;
    private double discount;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    double calculateTotalPrice() {
        return (getPrice() * getQuantity() + extraCharge) - discount;
    }

    public void applyDiscount(double percent) {
        discount = (getPrice() * getQuantity()) * percent / 100;
    }

    public void getDiscountDetails() {
        System.out.println("Non-Veg discount applied: " + discount);
    }
}
