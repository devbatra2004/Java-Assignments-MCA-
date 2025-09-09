
import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        double height_cm = sc.nextDouble();
        double height_m = height_cm / 100;
        double bmi = weight / (height_m * height_m);
        System.out.println("BMI: " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight"); 
        }else if (bmi < 24.9) {
            System.out.println("Normal weight"); 
        }else if (bmi < 29.9) {
            System.out.println("Overweight"); 
        }else {
            System.out.println("Obese");
        }
        sc.close();
    }
}
