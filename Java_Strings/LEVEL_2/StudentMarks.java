
import java.util.*;

public class StudentMarks {

    static int[][] generateMarks(int n) {
        Random rand = new Random();
        int[][] marks = new int[n][3];
        for (int i = 0; i < n; i++) {
            marks[i][0] = 40 + rand.nextInt(61);
            marks[i][1] = 40 + rand.nextInt(61);
            marks[i][2] = 40 + rand.nextInt(61);
        }
        return marks;
    }

    static String calcGrade(double percent) {
        if (percent >= 90) {
            return "A+";
        } else if (percent >= 80) {
            return "A";
        } else if (percent >= 70) {
            return "B";
        } else if (percent >= 60) {
            return "C";
        } else if (percent >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        int[][] marks = generateMarks(5);

        System.out.println("Phy\tChem\tMath\tTotal\tPercent\tGrade");
        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double percent = Math.round((total / 3.0) * 100.0) / 100.0;
            String grade = calcGrade(percent);
            System.out.println(marks[i][0] + "\t" + marks[i][1] + "\t" + marks[i][2]
                    + "\t" + total + "\t" + percent + "\t" + grade);
        }
    }
}
