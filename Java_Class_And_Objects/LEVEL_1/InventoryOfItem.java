
import java.util.Scanner;

public class InventoryOfItem {

    int itemCode;
    String itemName;
    double price;

    InventoryOfItem(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    double calculatePrice(int quantity) {
        return quantity * price;
    }

    void display(int quantity) {
        double totalCost = calculatePrice(quantity);
        System.out.println("Item Code : " + itemCode);
        System.out.println("Item Name : " + itemName);
        System.out.println("Price per Item : " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Total Cost : " + totalCost);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        InventoryOfItem obj = new InventoryOfItem(1001, "Mobile Phone", 100000);

        System.out.print("Enter quantity to purchase: ");
        int qty = sc.nextInt();
        obj.display(qty);

        sc.close();
    }
}
