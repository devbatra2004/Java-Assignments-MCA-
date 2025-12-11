//Given a list of Employee objects, group them by their department using a Map<Department, List<Employee>>.

import java.util.*;

class Employee {

    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String toString() {
        return name;
    }
}

public class GroupByDepartment {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Dev", "HR"));
        employees.add(new Employee("kaalu", "IT"));
        employees.add(new Employee("vaayu", "HR"));
        employees.add(new Employee("sheru", "Finance"));

        Map<String, List<Employee>> deptMap = new HashMap<>();

        for (Employee e : employees) {
            deptMap.putIfAbsent(e.department, new ArrayList<>());
            deptMap.get(e.department).add(e);
        }

        System.out.println(deptMap);
    }
}
