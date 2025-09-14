
import java.util.*;

public class PositiveOrNegative {

    int check(int a) {
        if (a > 0) {
            return 1;
        } else if (a < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = s1.nextInt();

        PositiveOrNegative obj = new PositiveOrNegative();
        int result = obj.check(a);

        if (result == 1) {
            System.out.println(a + " is a positive number");
        } else if (result == -1) {
            System.out.println(a + " is a negative number");
        } else {
            System.out.println(a + " is zero");
        }

        s1.close();
    }
}
