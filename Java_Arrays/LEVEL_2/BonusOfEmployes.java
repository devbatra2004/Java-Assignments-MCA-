
import java.util.Scanner;

public class BonusOfEmployes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary of employee " + (i + 1) + ": ");
            double sal = sc.nextDouble();
            System.out.println("Enter years of service of employee " + (i + 1) + ": ");
            double yrs = sc.nextDouble();
            if (sal <= 0 || yrs < 0) {
                System.out.println("Invalid input! Please enter again.");
                i--;
                continue;
            }

            salary[i] = sal;
            years[i] = yrs;
        }
        for (int i = 0; i < 10; i++) {
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        System.out.println("\n=== Bonus and Salary Report ===");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ": Old Salary = " + salary[i]
                    + ", Bonus = " + bonus[i]
                    + ", New Salary = " + newSalary[i]);
        }
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        sc.close();
    }
}
