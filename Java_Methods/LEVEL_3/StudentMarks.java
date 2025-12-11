
import java.util.*;

public class StudentMarks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] marks = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = 10 + (int) (Math.random() * 90);
            }
        }
        System.out.println("ID\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");

        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = Math.round((total / 3.0) * 100.0) / 100.0;
            double percent = Math.round((total / 300.0 * 100) * 100.0) / 100.0;

            System.out.println((i + 1) + "\t" + marks[i][0] + "\t" + marks[i][1] + "\t\t"
                    + marks[i][2] + "\t" + total + "\t" + avg + "\t" + percent + "%");
        }

        sc.close();
    }
}
