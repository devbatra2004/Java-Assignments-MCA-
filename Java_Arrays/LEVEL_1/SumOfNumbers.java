
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];
        double sum = 0;
        int count = 0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = sc.nextDouble();

            if (num <= 0 || count == 10) {
                break;
            }

            numbers[count] = num;
            sum += num;
            count++;
        }

        System.out.println("\nNumbers entered:");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\nSum = " + sum);

        sc.close();
    }
}
