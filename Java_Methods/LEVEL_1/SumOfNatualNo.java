
import java.util.*;

public class SumOfNatualNo {

    static int natural_no(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("enter a number ");
        int n = s1.nextInt();

        int result = natural_no(n);
        System.out.println("The sum of first " + n + " natural numbers is: " + result);
    }

}
