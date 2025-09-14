
import java.util.Scanner;

public class SumOfNaturalNumbers {

    static int sumRecursive(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumRecursive(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number!");
        } else {
            int sum1 = sumRecursive(n);
            int sum2 = n * (n + 1) / 2;

            System.out.println("Sum by recursion = " + sum1);
            System.out.println("Sum by formula   = " + sum2);
        }
        sc.close();
    }
}
