
import java.util.ArrayList;
import java.util.List;

abstract class WarehouseItem {

    private String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void showDetails();
}

class Electronics extends WarehouseItem {

    private double price;

    public Electronics(String name, double price) {
        super(name);
        this.price = price;
    }

    public void showDetails() {
        System.out.println("Electronics: " + getName() + ", Price: Rs." + price);
    }
}

class Groceries extends WarehouseItem {

    private int quantity;

    public Groceries(String name, int quantity) {
        super(name);
        this.quantity = quantity;
    }

    public void showDetails() {
        System.out.println("Groceries: " + getName() + ", Quantity: " + quantity);
    }
}

class Furniture extends WarehouseItem {

    private String material;

    public Furniture(String name, String material) {
        super(name);
        this.material = material;
    }

    public void showDetails() {
        System.out.println("Furniture: " + getName() + ", Material: " + material);
    }
}

class Storage<T extends WarehouseItem> {

    private List<T> items;

    public Storage() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
        System.out.println(item.getName() + " added to storage.");
    }

    public void showAllItems() {
        System.out.println("\nItems in storage:");
        for (T item : items) {
            item.showDetails();
        }
    }

    public static void displayItems(List<? extends WarehouseItem> itemList) {
        System.out.println("\nDisplaying items:");
        for (WarehouseItem item : itemList) {
            item.showDetails();
        }
    }

    public List<T> getItems() {
        return items;
    }
}

public class SmartWarehouseManagement {

    public static void main(String[] args) {

        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        Electronics e1 = new Electronics("Smartphone", 25000);
        Electronics e2 = new Electronics("Laptop", 55000);

        Groceries g1 = new Groceries("Rice", 50);
        Groceries g2 = new Groceries("Wheat", 100);

        Furniture f1 = new Furniture("Chair", "Wood");
        Furniture f2 = new Furniture("Table", "Metal");

        electronicsStorage.addItem(e1);
        electronicsStorage.addItem(e2);

        groceriesStorage.addItem(g1);
        groceriesStorage.addItem(g2);

        furnitureStorage.addItem(f1);
        furnitureStorage.addItem(f2);

        electronicsStorage.showAllItems();
        groceriesStorage.showAllItems();
        furnitureStorage.showAllItems();

        // Demonstrating wildcard method
        Storage.displayItems(electronicsStorage.getItems());
        Storage.displayItems(groceriesStorage.getItems());
        Storage.displayItems(furnitureStorage.getItems());
    }
}
