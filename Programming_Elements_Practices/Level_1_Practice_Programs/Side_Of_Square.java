
import java.util.Scanner;

public class Side_Of_Square {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();

        double side = perimeter / 4;

        System.out.println("The side of the square is: " + side);
    }
}
