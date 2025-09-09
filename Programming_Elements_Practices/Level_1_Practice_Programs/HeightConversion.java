
import java.util.*;

public class HeightConversion {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter your height in cm: ");
        double height_in_cm = s1.nextDouble();

        double height_in_inch = height_in_cm / 2.54;

        double height_in_feet = height_in_cm / 30.48;

        System.out.println("Your height in cm is: " + height_in_cm);
        System.out.println("Your height in inches is: " + height_in_inch);
        System.out.println("Your height in feet is: " + height_in_feet);
    }
}
