
import java.util.Scanner;

public class StudentGrades2D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // 2D array to store marks 
        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                System.out.print(subject + ": ");
                int mark = sc.nextInt();

                if (mark < 0) {
                    System.out.println("Invalid input! Marks must be positive. Enter again.");
                    j--;
                    continue;
                }
                marks[i][j] = mark;
            }
        }
        for (int i = 0; i < n; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }
            percentage[i] = total / 3.0;

            if (percentage[i] >= 90) {
                grade[i] = 'A';
            } else if (percentage[i] >= 75) {
                grade[i] = 'B';
            } else if (percentage[i] >= 50) {
                grade[i] = 'C';
            } else {
                grade[i] = 'D';
            }
        }

        System.out.println("\n--- Results ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": ");
            System.out.println(" Physics: " + marks[i][0]);
            System.out.println(" Chemistry: " + marks[i][1]);
            System.out.println(" Maths: " + marks[i][2]);
            System.out.println(" Percentage: " + percentage[i]);
            System.out.println(" Grade: " + grade[i]);
            System.out.println();
        }

        sc.close();
    }
}
