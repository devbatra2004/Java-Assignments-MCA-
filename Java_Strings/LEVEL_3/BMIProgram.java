
import java.util.Scanner;

public class BMIProgram {

    static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);

        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal";
        } else if (bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[]{String.format("%.2f", bmi), status};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] hw = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            hw[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            hw[i][1] = sc.nextDouble();
        }

        System.out.println("\nWeight\tHeight\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            String[] result = calculateBMI(hw[i][0], hw[i][1]);
            System.out.println(hw[i][0] + "\t" + hw[i][1] + "\t" + result[0] + "\t" + result[1]);
        }
        sc.close();
    }
}
