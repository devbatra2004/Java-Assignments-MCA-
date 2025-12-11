
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Department=" + department + ", Salary=" + salary + "]";
    }
}

public class EmployeeSerialization {

    public static void main(String[] args) {

        String fileName = "employees.dat";
        Scanner scanner = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<>();

        System.out.print("Enter number of employees to store: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Department: ");
            String department = scanner.nextLine();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();

            employeeList.add(new Employee(id, name, department, salary));
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(employeeList);
            System.out.println("\nEmployee data serialized to " + fileName);
        } catch (IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            List<Employee> retrievedList = (List<Employee>) ois.readObject();
            System.out.println("\nEmployees retrieved from file:");
            for (Employee emp : retrievedList) {
                System.out.println(emp);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
            e.printStackTrace();
        }

        scanner.close();
    }
}
