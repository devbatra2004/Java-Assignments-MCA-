
import java.util.Scanner;

public class PriceOfItem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the unit price of the item: ");
        double unitPrice = sc.nextDouble();
        System.out.print("Enter the quantity: ");
        int quantity = sc.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + totalPrice);
    }
}
