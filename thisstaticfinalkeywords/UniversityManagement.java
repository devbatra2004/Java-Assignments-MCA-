
class Student {

    private static String universityName = "Amity University";
    private final int rollNumber;
    private String name;
    private String grade;

    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
    }

    public void displayStudentDetails() {

        System.out.println("University: " + universityName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }
}

public class UniversityManagement {

    public static void main(String[] args) {
        Student stu1 = new Student(101, "dev", "o");
        Student stu2 = new Student(102, "Aayush", "B");

        stu1.displayStudentDetails();
        stu2.displayStudentDetails();
    }
}
