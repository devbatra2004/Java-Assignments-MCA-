
import java.util.Scanner;

class NumberCheck {

    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (isPositive(arr[i])) {
                System.out.print(arr[i] + " is positive and ");
                if (isEven(arr[i])) {
                    System.out.println("even");
                } else {
                    System.out.println("odd");
                }
            } else {
                System.out.println(arr[i] + " is negative");
            }
        }

        if (arr[0] > arr[arr.length - 1]) {
            System.out.println("First element is greater than last element");
        } else if (arr[0] == arr[arr.length - 1]) {
            System.out.println("First element is equal to last element");
        } else {
            System.out.println("First element is less than last element");
        }

        sc.close();
    }
}
