// Design a Java program with an Employee class 
// (having ID, name, designation, salary, and methods to display details and get salary) and 
// an HRDepartment class (to add employees, display all employees, and fetch salary by ID), then create three employees,
//  add them to HR, display details, and retrieve a specific employee’s salary.
import java.util.*;

class Employee {
    private int id;
    private String name;
    private String designation;
    private double salary;

    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
}

class HRDepartment {
    private List<Employee> employees;

    public HRDepartment() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayAllEmployees() {
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println("--------------------");
        }
    }

    public Double fetchSalaryById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee.getSalary();
            }
        }
        return null; // Return null if employee not found
    }
}

public class Class1 {
    public static void main(String[] args) {
        HRDepartment hr = new HRDepartment();

        // Creating three employees
        Employee emp1 = new Employee(1, "Alice", "Developer", 60000);
        Employee emp2 = new Employee(2, "Bob", "Designer", 55000);
        Employee emp3 = new Employee(3, "Charlie", "Manager", 75000);

        // Adding employees to HR
        hr.addEmployee(emp1);
        hr.addEmployee(emp2);
        hr.addEmployee(emp3);

        // Displaying all employees
        System.out.println("All Employees:");
        hr.displayAllEmployees();

        // Fetching salary by ID
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee ID to fetch salary: ");
        int idToFetch = scanner.nextInt();
        Double salary = hr.fetchSalaryById(idToFetch);

        if (salary != null) {
            System.out.println("Salary of employee with ID " + idToFetch + " is: " + salary);
        } else {
            System.out.println("Employee with ID " + idToFetch + " not found.");
        }

        scanner.close();
    }
}