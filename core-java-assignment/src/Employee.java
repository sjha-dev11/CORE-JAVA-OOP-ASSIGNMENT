public class Employee {
    private int empId;
    private String empName;
    private double salary;
    public static String companyName = "Training Institute Inc.";

    public Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: $" + salary);
        System.out.println("Company Name: " + companyName);
    }
}
/*
Explanation:
This file defines the Employee class to demonstrate constructors, the 'this' keyword, and static variables.
The core idea is to store employee details and a shared company name across all instances.

Methods:
- Constructor: Uses the 'this' keyword to differentiate between instance variables and parameters, properly initializing the object state.
- displayEmployeeDetails(): Prints the specific employee's details along with the shared static companyName, proving that the static variable accurately reflects across all instances.
*/
