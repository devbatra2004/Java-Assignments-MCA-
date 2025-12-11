
class SchoolSystem {

    String name;
    int age;

    public SchoolSystem(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Teacher t = new Teacher(" Dev", 21, "Math");
        Student s = new Student("Aman", 15, "10th Grade");
        Staff st = new Staff("Raj", 40, "Administration");

        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}

class Teacher extends SchoolSystem {

    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        super.displayDetails();
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}

class Student extends SchoolSystem {

    String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        super.displayDetails();
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}

class Staff extends SchoolSystem {

    String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        super.displayDetails();
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}
