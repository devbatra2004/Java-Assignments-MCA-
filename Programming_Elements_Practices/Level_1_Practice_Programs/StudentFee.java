
import java.util.*;

public class StudentFee {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter your university fees: ");
        double university_fee = s1.nextDouble();

        double discount = university_fee * 10 / 100;
        double discounted_price = university_fee - discount;

        System.out.println("University Fee: INR " + university_fee);
        System.out.println("Discount Amount: INR " + discount);
        System.out.println("Discounted Price to Pay: INR " + discounted_price);
    }
}
