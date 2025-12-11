
import java.util.Scanner;

public class FactorsProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Factors of " + num + " are: ");
        int sum = 0;
        long product = 1;
        long sumSquares = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                sum += i;
                product *= i;
                sumSquares += i * i;
            }
        }

        System.out.println("\nSum of factors = " + sum);
        System.out.println("Product of factors = " + product);
        System.out.println("Sum of squares of factors = " + sumSquares);

        sc.close();
    }
}
