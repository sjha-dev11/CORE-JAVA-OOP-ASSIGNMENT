public class Main {
    public static void main(String[] args) {
        System.out.println("--- Student Management System ---\n");
        int[] marks1 = {85, 90, 78, 92, 88};
        Student student1 = new Student(101, "Tannish Singhal", marks1);
        student1.displayDetails();
        student1.formatName();
        student1.displayMarks();
        student1.calculateAverage();

        System.out.println("\n--- College Student (Inheritance) ---\n");
        int[] marks2 = {75, 80, 85, 90, 95};
        CollegeStudent collegeStudent = new CollegeStudent(102, "Aditi Singh", marks2, "Tech University", "Computer Science");
        collegeStudent.displayDetails();

        System.out.println("\n--- Static Value Check ---\n");
        System.out.println("Total Students Created: " + Student.studentCount);

        System.out.println("\n--- Employee Management ---\n");
        Employee emp1 = new Employee(1, "Preeti Mehta", 55000);
        Employee emp2 = new Employee(2, "asmit rawat", 65000);
        emp1.displayEmployeeDetails();
        System.out.println();
        emp2.displayEmployeeDetails();

        System.out.println("\n--- Product & Encapsulation ---\n");
        Product p1 = new Product(501, "Laptop", 1200.0);
        Product p2 = new Product(502, "Mouse", 25.0);
        Product p3 = new Product();
        p3.setProductId(503);
        p3.setProductName("Keyboard");
        p3.setPrice(100.0);
        
        System.out.println("Products securely retrieved using getters:");
        System.out.println(p1.getProductName() + " - $" + p1.getPrice());
        System.out.println(p2.getProductName() + " - $" + p2.getPrice());
        System.out.println(p3.getProductName() + " - $" + p3.getPrice());

        System.out.println("\n--- Billing System (Method Overloading) ---\n");
        ProductBilling billing = new ProductBilling();
        billing.calculateBill(p1);
        billing.calculateBill(p1, p2);
        billing.calculateBill(p1, p2, p3);
    }
}
/*
Explanation:
This file executes all the user stories together to demonstrate the complete functionality of the application.
It follows a chronological sequence proving Object Creation, String Formatting, Array iteration, Constructor usage, Encapsulation, Inheritance, Method Overloading, and Static Variables.

Methods:
- main(String[] args): The entry point for the Application. Instantiates all previous classes dynamically, supplies the required data (like hardcoded arrays), and systematically outputs the interactions to the standard output.
*/
