// Abstract class

abstract class Employee {

    int id;
    String name;
    double baseSalary;

    public Employee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    abstract double calculateSalary();

    void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Final Salary: " + calculateSalary());
    }

    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(101, "Dev", 50000, 10000);
        Employee e2 = new PartTimeEmployee(102, "Rahul", 500, 40);

        e1.displayDetails();
        e2.displayDetails();
    }
}

class FullTimeEmployee extends Employee {

    double bonus;

    public FullTimeEmployee(int id, String name, double baseSalary, double bonus) {
        super(id, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }
}

class PartTimeEmployee extends Employee {

    int hoursWorked;
    double hourlyRate;

    public PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
        super(id, name, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}
