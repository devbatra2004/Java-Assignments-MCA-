
import java.util.*;

public class Triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base of the triangle (in inches): ");
        double baseInInch = sc.nextDouble();

        System.out.print("Enter height of the triangle (in inches): ");
        double heightInInch = sc.nextDouble();

        double areaInInches = 0.5 * baseInInch * heightInInch;

        double baseInCm = baseInInch * 2.54;
        double heightInCm = heightInInch * 2.54;
        double areaInCm = 0.5 * baseInCm * heightInCm;
        System.out.println("Area of Triangle in square inches: " + areaInInches);
        System.out.println("Area of Triangle in square centimeters: " + areaInCm);
    }
}
