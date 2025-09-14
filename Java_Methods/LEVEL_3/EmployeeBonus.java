
public class EmployeeBonus {

    static int[][] generateData(int n) {
        int[][] data = new int[n][2];
        for (int i = 0; i < n; i++) {
            data[i][0] = 10000 + (int) (Math.random() * 90000);
            data[i][1] = 1 + (int) (Math.random() * 10);
        }
        return data;
    }

    static double[][] calculateBonus(int[][] data) {
        double[][] result = new double[data.length][4];

        for (int i = 0; i < data.length; i++) {
            int oldSalary = data[i][0];
            int years = data[i][1];
            double bonus;

            if (years > 5) {
                bonus = oldSalary * 0.05;
            } else {
                bonus = oldSalary * 0.02;
            }
            double newSalary = oldSalary + bonus;

            result[i][0] = oldSalary;
            result[i][1] = years;
            result[i][2] = bonus;
            result[i][3] = newSalary;
        }
        return result;
    }

    static void displayResults(double[][] result) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;

        System.out.printf("Emp ID", "Old Salary", "Years Service", "Bonus", "New Salary");
        System.out.println("-----------------------");

        for (int i = 0; i < result.length; i++) {
            totalOld += result[i][0];
            totalNew += result[i][3];
            totalBonus += result[i][2];

            System.out.printf("",
                    (i + 1), result[i][0], result[i][1], result[i][2], result[i][3]);
        }

        System.out.println("--------------------");
        System.out.printf(
                "TOTAL", totalOld, "", totalBonus, totalNew);
    }

    public static void main(String[] args) {
        int n = 10;
        int[][] data = generateData(n);
        double[][] result = calculateBonus(data);
        displayResults(result);
    }
}
