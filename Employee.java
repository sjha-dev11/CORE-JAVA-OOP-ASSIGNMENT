public class Employee {
    int empId;
    String name;
    String department;
    double salary;

    // Parameterized Constructor: Used to initialize the object with specific values
    public Employee(int empId, String name, String department, double salary) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
        System.out.println("Employee object created using parameterized constructor for " + name);
    }

    // Default Constructor: A constructor with no parameters
    public Employee() {
        System.out.println("Employee object created using default constructor");
    }

    // Method to display employee details
    public void displayProfile() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        System.out.println("--- Employee Management System ---\n");

        // 1. Creating an Employee object using the Parameterized Constructor
        Employee emp1 = new Employee(148, "Tanish Singhal", "Information Technology", 75000.0);
        emp1.displayProfile();

        // 2. Creating an Employee object using the Default Constructor
        Employee emp2 = new Employee();

        // Since we used the default constructor, we set the values manually
        emp2.empId = 44;
        emp2.name = "Asmit Rawat";
        emp2.department = "Computer Science";
        emp2.salary = 60000.0;
        emp2.displayProfile();
    }
}
