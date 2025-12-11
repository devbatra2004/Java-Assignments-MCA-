
import java.util.Scanner;

public class MultipleCatchExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter size of array: ");
            int size = scanner.nextInt();
            scanner.nextLine();

            int[] arr = null;

            if (size > 0) {
                arr = new int[size];
                System.out.println("Enter " + size + " integers:");
                for (int i = 0; i < size; i++) {
                    arr[i] = scanner.nextInt();
                }
            }

            System.out.print("Enter index to retrieve: ");
            int index = scanner.nextInt();
            int value = arr[index];
            System.out.println("Value at index " + index + ": " + value);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");

        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
