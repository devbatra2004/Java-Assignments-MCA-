
import java.util.ArrayList;

class Employee {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department {

    private String deptName;
    private ArrayList<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        employees = new ArrayList<>();
    }

    public void addEmployee(String name) {
        employees.add(new Employee(name));
        System.out.println("Employee " + name + " added to " + deptName);
    }

    public void showEmployees() {
        System.out.println("\nEmployees in " + deptName + ":");
        for (Employee e : employees) {
            System.out.println(" - " + e.getName());
        }
    }

    public void deleteDepartment() {
        employees.clear();
        System.out.println("Department " + deptName + " deleted with all employees.");
    }
}

class Company {

    private String companyName;
    private ArrayList<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        departments = new ArrayList<>();
    }

    public Department addDepartment(String deptName) {
        Department d = new Department(deptName);
        departments.add(d);
        System.out.println("Department " + deptName + " added to " + companyName);
        return d;
    }

    public void showCompanyStructure() {
        System.out.println("\nCompany: " + companyName);
        for (Department d : departments) {
            d.showEmployees();
        }
    }

    public void deleteCompany() {
        System.out.println("\nDeleting Company " + companyName + " ...");
        for (Department d : departments) {
            d.deleteDepartment();
        }
        departments.clear();
        System.out.println("Company deleted. All departments and employees removed.");
    }
}

public class CompanyManagement {

    public static void main(String[] args) {
        Company comp = new Company("bebo technologies");
        Department hr = comp.addDepartment("Human Resources");
        Department it = comp.addDepartment("IT Department");
        hr.addEmployee("pepsi");
        hr.addEmployee("kaalu");
        it.addEmployee("sheeru");
        it.addEmployee("billa");
        comp.showCompanyStructure();
        comp.deleteCompany();
        comp.showCompanyStructure();
    }
}
