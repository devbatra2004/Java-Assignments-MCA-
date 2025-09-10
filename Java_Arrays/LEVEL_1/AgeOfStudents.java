
// Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
// Hint => 
// Define an array of 10 integer elements and take user input for the student's age. 
// Loop through the array using the length property and for the element of the array check If the age is a negative number print an invalid age and if 18 or above, print The student with the age ___ can vote. Otherwise, print The student with the age ___ cannot vote. 
import java.util.*;

public class AgeOfStudents {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        int[] student_age = new int[10];

        for (int i = 0; i < student_age.length; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            student_age[i] = s1.nextInt();
        }
        for (int i = 0; i < student_age.length; i++) {
            if (student_age[i] < 0) {
                System.out.println("Invalid age entered for student " + (i + 1));
            } else if (student_age[i] >= 18) {
                System.out.println("The student with age " + student_age[i] + " can vote.");
            } else {
                System.out.println("The student with age " + student_age[i] + " cannot vote.");
            }
        }
    }
}
