
public class NumberChecker4 {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNeon(int n) {
        int square = n * n;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == n;
    }

    public static boolean isSpy(int n) {
        int sum = 0, product = 1;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int n) {
        int square = n * n;
        return String.valueOf(square).endsWith(String.valueOf(n));
    }

    public static boolean isBuzz(int n) {
        return (n % 7 == 0) || (n % 10 == 7);
    }

    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 9;
        int num3 = 1124;
        int num4 = 25;
        int num5 = 27;

        System.out.println(num1 + " is Prime? " + isPrime(num1));
        System.out.println(num2 + " is Neon? " + isNeon(num2));
        System.out.println(num3 + " is Spy? " + isSpy(num3));
        System.out.println(num4 + " is Automorphic? " + isAutomorphic(num4));
        System.out.println(num5 + " is Buzz? " + isBuzz(num5));
    }
}
