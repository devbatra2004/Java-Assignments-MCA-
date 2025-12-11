// NAME - DEV   ROLL_NO - 2510987011
// Program: Demonstrate IllegalArgumentException

import java.util.Scanner;

class IllegalArgumentDemo {

    static void generateException(String text) {
        System.out.println("Substring: " + text.substring(5, 2));
    }

    static void handleException(String text) {
        try {
            System.out.println("Substring: " + text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e);
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
