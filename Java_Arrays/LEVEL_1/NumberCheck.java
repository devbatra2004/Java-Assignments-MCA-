
import java.util.*;

public class NumberCheck {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int Number[] = new int[5];

        for (int i = 0; i < Number.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            Number[i] = s1.nextInt();
        }

        for (int i = 0; i < Number.length; i++) {
            if (Number[i] > 0) {
                System.out.print("The number " + Number[i] + " is Positive");

                if (Number[i] % 2 == 0) {
                    System.out.println(" and Even.");
                } else {
                    System.out.println(" and Odd.");
                }
            } else if (Number[i] < 0) {
                System.out.println("The number " + Number[i] + " is Negative.");
            } else {
                System.out.println("The number is Zero.");
            }
        }
        int first = Number[0];
        int last = Number[Number.length - 1];

        if (first == last) {
            System.out.println("The first element " + first + " is equal to the last element " + last);
        } else if (first > last) {
            System.out.println("The first element " + first + " is greater than the last element " + last);
        } else {
            System.out.println("The first element " + first + " is less than the last element " + last);
        }
    }
}
