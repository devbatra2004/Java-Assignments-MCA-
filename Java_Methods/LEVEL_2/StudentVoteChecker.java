
import java.util.Scanner;

public class StudentVoteChecker {

    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        } else if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();

        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();

            boolean result = checker.canStudentVote(ages[i]);

            if (ages[i] < 0) {
                System.out.println("Invalid age entered for student " + (i + 1));
            } else if (result) {
                System.out.println("Student " + (i + 1) + " (Age " + ages[i] + ") can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " (Age " + ages[i] + ") cannot vote.");
            }
        }

        sc.close();
    }
}
