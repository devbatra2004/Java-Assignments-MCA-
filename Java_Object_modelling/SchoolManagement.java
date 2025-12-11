/*School and Students with Courses (Association and Aggregation)*/

import java.util.ArrayList;
import java.util.List;

class Course {

    private String courseName;
    private List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void showStudents() {
        System.out.println("\nStudents enrolled in " + courseName + ":");
        for (Student s : students) {
            System.out.println("- " + s.getStudentName());
        }
    }
}

class Student {

    private String studentName;
    private List<Course> courses;

    public Student(String studentName) {
        this.studentName = studentName;
        this.courses = new ArrayList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public void enroll(Course c) {
        courses.add(c);
        c.addStudent(this);
    }

    public void showCourses() {
        System.out.println("\nCourses of " + studentName + ":");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}

class School {

    private String schoolName;
    private List<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void showSchoolStudents() {
        System.out.println("\nStudents in " + schoolName + ":");
        for (Student s : students) {
            System.out.println("- " + s.getStudentName());
        }
    }
}

public class SchoolManagement {

    public static void main(String[] args) {
        School school = new School("DAV");
        Student s1 = new Student("Aarav Tanwar");
        Student s2 = new Student("amarneet rana");
        Student s3 = new Student("manoj kumar");
        school.addStudent(s1);
        school.addStudent(s2);
        school.addStudent(s3);
        Course c1 = new Course("economics");
        Course c2 = new Course("accounts");
        Course c3 = new Course("english");
        s1.enroll(c1);
        s1.enroll(c3);
        s2.enroll(c1);
        s2.enroll(c2);
        s3.enroll(c2);
        s1.showCourses();
        s2.showCourses();
        s3.showCourses();
        c1.showStudents();
        c2.showStudents();
        c3.showStudents();
        school.showSchoolStudents();
    }
}
