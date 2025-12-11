
import java.util.Scanner;

public class ChocolateDivision {

    public static int[] divideChocolates(int chocolates, int children) {
        int perChild = chocolates / children;
        int remaining = chocolates % children;
        return new int[]{perChild, remaining};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of chocolates: ");
        int chocolates = sc.nextInt();

        System.out.print("Enter total number of children: ");
        int children = sc.nextInt();

        if (children <= 0) {
            System.out.println("Number of children must be greater than 0.");
        } else {
            int[] result = divideChocolates(chocolates, children);
            System.out.println("Each child will get: " + result[0] + " chocolates");
            System.out.println("Remaining chocolates: " + result[1]);
        }

        sc.close();
    }
}
