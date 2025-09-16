
public class EmployeeDetails {

    String name;
    int id;
    double salary;

    EmployeeDetails(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID   : " + id);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        EmployeeDetails emp1 = new EmployeeDetails("Dev", 11, 5500000.50);
        emp1.displayDetails();
    }
}
