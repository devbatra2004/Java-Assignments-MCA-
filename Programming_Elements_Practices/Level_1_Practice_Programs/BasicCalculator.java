
import java.util.*;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();

        double sum = number1 + number2;
        double difference = number1 - number2;
        double product = number1 * number2;
        double quotient = number1 / number2;

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);

        if (number2 != 0) {
            System.out.println("Division: " + quotient);
        } else {
            System.out.println("Division: Cannot divide by zero!");
        }
    }
}
