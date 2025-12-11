
import java.util.*;

public class SimpleInterest {

    // calculate Simple Interest
    static double calculateSI(double principal, double rate, int time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        int time = sc.nextInt();

        double si = calculateSI(principal, rate, time);

        System.out.println("The Simple Interest is " + si
                + " for Principal " + principal
                + ", Rate of Interest " + rate
                + " and Time " + time + " years.");

        sc.close();
    }
}
