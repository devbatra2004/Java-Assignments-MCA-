
import java.util.Scanner;

public class HarshadNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0, original = num;
        while (original != 0) {
            sum += original % 10;
            original /= 10;
        }
        System.out.println(num % sum == 0 ? "Harshad Number" : "Not Harshad Number");
        sc.close();
    }
}
