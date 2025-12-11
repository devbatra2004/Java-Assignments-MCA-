// NAME - DEV   ROLL_NO - 2510987011
// Program: Demonstrate StringIndexOutOfBoundsException

import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    static void generateException(String text) {
        System.out.println("Character at index " + text.length() + ": " + text.charAt(text.length()));
    }

    static void handleException(String text) {
        try {
            System.out.println("Character at index " + text.length() + ": " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e);
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
