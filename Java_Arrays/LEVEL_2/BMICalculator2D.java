
import java.util.*;

public class BMICalculator2D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        // personData[i][0] = height, personData[i][1] = weight, personData[i][2] = BMI
        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            double height;
            do {
                System.out.print("Enter height (in meters) of person " + (i + 1) + ": ");
                height = sc.nextDouble();
            } while (height <= 0);

            double weight;
            do {
                System.out.print("Enter weight (in kg) of person " + (i + 1) + ": ");
                weight = sc.nextDouble();
            } while (weight <= 0);

            personData[i][0] = height;
            personData[i][1] = weight;

            // bmi
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // display result
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + ": Height = " + personData[i][0]
                    + " m, Weight = " + personData[i][1]
                    + " kg, BMI = " + String.format("%.2f", personData[i][2])
                    + ", Status = " + weightStatus[i]);
        }

        sc.close();
    }
}
