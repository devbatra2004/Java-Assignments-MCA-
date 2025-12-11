// NAME - DEV   ROLL_NO - 2510987011
// Program: Demonstrate NullPointerException

public class NullPointerDemo {

    static void generateException() {
        String text = null;
        System.out.println("Length of string: " + text.length());
    }

    static void handleException() {
        String text = null;
        try {
            System.out.println("Length of string: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: String is null!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Generating Exception...");
        try {
            generateException();
        } catch (Exception e) {
            System.out.println("Exception generated: " + e);
        }
        System.out.println("\nHandling Exception...");
        handleException();
    }
}
