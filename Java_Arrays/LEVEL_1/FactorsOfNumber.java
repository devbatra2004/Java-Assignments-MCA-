
import java.util.*;

public class FactorsOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors.add(i);
            }
        }

        System.out.println("Factors of " + number + " are: " + factors);
        sc.close();
    }
}
