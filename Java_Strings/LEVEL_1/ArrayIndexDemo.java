// NAME - DEV   ROLL_NO - 2510987011
// Program: Demonstrate ArrayIndexOutOfBoundsException

import java.util.Scanner;

public class ArrayIndexDemo {

    static void generateException(String[] names) {

        System.out.println("Accessing invalid index: " + names[names.length]);
    }

    static void handleException(String[] names) {
        try {
            System.out.println("Accessing invalid index: " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }
        System.out.println("\nGenerating Exception...");
        try {
            generateException(names);
        } catch (Exception e) {
            System.out.println("Exception generated: " + e);
        }
        System.out.println("\nHandling Exception...");
        handleException(names);

        sc.close();
    }
}
