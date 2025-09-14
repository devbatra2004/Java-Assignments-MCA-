
class NumberChecker3 {

    public static int countDigits(int n) {
        int count = 0;
        for (int temp = n; temp > 0; temp /= 10) {
            count++;
        }
        return count;
    }

    public static int[] getDigits(int n) {
        int size = countDigits(n);
        int[] digits = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
        return rev;
    }

    public static boolean isPalindrome(int n) {
        int[] digits = getDigits(n);
        int[] rev = reverseArray(digits);
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != rev[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDuckNumber(int n) {
        int[] digits = getDigits(n);
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int num1 = 121;
        int num2 = 1023;

        System.out.println("Digits in " + num1 + " = " + countDigits(num1));
        System.out.println(num1 + " is Palindrome? " + isPalindrome(num1));
        System.out.println(num2 + " is Duck Number? " + isDuckNumber(num2));
    }
}
