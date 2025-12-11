
import java.util.ArrayList;
import java.util.List;

class Faculty {

    private String facultyName;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyName() {
        return facultyName;
    }
}

class Departments {

    private String deptName;

    public Departments(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}

class University {

    private String universityName;
    private List<Departments> departments;
    private List<Faculty> facultyList;

    public University(String universityName) {
        this.universityName = universityName;
        departments = new ArrayList<>();
        facultyList = new ArrayList<>();
    }

    public void addDepartment(Departments d) {
        departments.add(d);
    }

    public void addFaculty(Faculty f) {
        facultyList.add(f);
    }

    public void showDepartments() {
        System.out.println("\nDepartments in " + universityName + ":");
        for (Departments d : departments) {
            System.out.println("- " + d.getDeptName());
        }
    }

    public void showFaculty() {
        System.out.println("\nFaculty Members in " + universityName + ":");
        for (Faculty f : facultyList) {
            System.out.println("- " + f.getFacultyName());
        }
    }

    public void deleteUniversity() {
        System.out.println("\nDeleting University: " + universityName);
        System.out.println("All associated departments are also deleted.");

        departments.clear();
    }
}

public class UniversityManagement {

    public static void main(String[] args) {
        University uni = new University("chitkara");
        Departments d1 = new Departments("Computer Science");
        Departments d2 = new Departments("Mechanical Engineering");
        Departments d3 = new Departments("Biotechnology");

        uni.addDepartment(d1);
        uni.addDepartment(d2);
        uni.addDepartment(d3);
        Faculty f1 = new Faculty("Dr. hemraj bishnoi");
        Faculty f2 = new Faculty("Prof. dev batra");
        Faculty f3 = new Faculty("Dr. kaalu singh");

        uni.addFaculty(f1);
        uni.addFaculty(f2);
        uni.addFaculty(f3);

        uni.showDepartments();
        uni.showFaculty();

        uni.deleteUniversity();

        uni.showDepartments();
        uni.showFaculty();
        System.out.println("\nNote: Faculty still exist because aggregation does not destroy them.");
    }
}
