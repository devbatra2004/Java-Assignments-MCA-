
import java.util.Scanner;

public class StudentReport {

    int rollNumber;
    String name;
    double marks;

    public StudentReport(int rollNumber, String name, double marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    void calculateGrade() {
        if (marks >= 90) {
            System.out.println("Grade : A");
        } else if (marks >= 75) {
            System.out.println("Grade : B");
        } else if (marks >= 50) {
            System.out.println("Grade : C");
        } else {
            System.out.println("Grade : D");
        }
    }

    void display() {
        System.out.println("\nRoll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("Marks       : " + marks);
        calculateGrade();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();
        StudentReport s1 = new StudentReport(roll, name, marks);
        s1.display();

        sc.close();
    }
}
