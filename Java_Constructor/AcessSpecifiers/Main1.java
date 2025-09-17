
class Student {

    public int rollNumber;
    protected String name;
    private double CGPA;

    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }
}

class PostgraduateStudent extends Student {

    String thesis;

    PostgraduateStudent(int rollNumber, String name, double CGPA, String thesis) {
        super(rollNumber, name, CGPA);
        this.thesis = thesis;
    }

    void show() {
        System.out.println(rollNumber);
        System.out.println(name);
        System.out.println(getCGPA());
        System.out.println(thesis);
    }
}

public class Main1 {

    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(1, "Dev", 9.1, "AI");
        pg.show();
    }
}
