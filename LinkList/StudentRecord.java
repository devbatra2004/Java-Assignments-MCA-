
import java.util.*;

class Student {

    int rollNo;
    String name;
    int age;
    String grade;
    Student next;
}

public class StudentRecord {

    static Student head = null;

    static void addStudent(int roll, String name, int age, String grade) {
        Student newStudent = new Student();
        newStudent.rollNo = roll;
        newStudent.name = name;
        newStudent.age = age;
        newStudent.grade = grade;
        newStudent.next = null;

        if (head == null) {
            head = newStudent;
        } else {
            Student temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newStudent;
        }
    }

    static void deleteStudent(int roll) {
        if (head == null) {
            System.out.println("No students to delete!");
            return;
        }

        if (head.rollNo == roll) {
            head = head.next;
            System.out.println("Student deleted!");
            return;
        }

        Student temp = head;
        Student prev = null;

        while (temp != null && temp.rollNo != roll) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Student not found!");
        } else {
            prev.next = temp.next;
            System.out.println("Student deleted!");
        }
    }

    static void displayStudents() {
        if (head == null) {
            System.out.println("No records found!");
            return;
        }

        Student temp = head;
        System.out.println("\n--- Student Records ---");
        while (temp != null) {
            System.out.println("Roll: " + temp.rollNo
                    + ", Name: " + temp.name
                    + ", Age: " + temp.age
                    + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        addStudent(1, "Dev", 20, "A");
        addStudent(2, "Riya", 19, "B");
        addStudent(3, "Aman", 21, "A+");

        displayStudents();

        System.out.print("\nEnter roll number to delete: ");
        int roll = sc.nextInt();
        deleteStudent(roll);

        displayStudents();
    }
}
