
import java.util.*;

public class armstrong_no {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Please enter a 3-digit number:");
        int num = s1.nextInt();

        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + (digit * digit * digit);
            num = num / 10;
        }
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is NOT an Armstrong number.");
        }
    }
}
