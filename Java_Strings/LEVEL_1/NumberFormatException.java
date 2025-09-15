// NAME - DEV   ROLL_NO - 2510987011
// Program: Demonstrate NumberFormatException

import java.util.Scanner;

public class NumberFormatException {

    static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Converted Number: " + number);
    }

    static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println("\nGenerating Exception...");
        try {
            generateException(input);
        } catch (Exception e) {
            System.out.println("Exception generated: " + e);
        }
        System.out.println("\nHandling Exception...");
        handleException(input);

        sc.close();
    }
}
