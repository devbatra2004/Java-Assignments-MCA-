// finding the sum of digit of a number

public class SumOfDigit {

    public static void main(String[] args) {
        int number = 1234;
        int n = number;
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            int digit = number % 10;
            sum = sum + digit;
            n = n / 10;

        }
        System.out.println("Number: " + number);
        System.out.println("Sum of digits: " + sum);
    }
}
