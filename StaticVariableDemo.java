public class StaticVariableDemo {
    // Instance variables: unique to each employee object
    int empId;
    String name;

    // Static variable: shared among ALL instances of this class
    static String companyName = "Tech Solutions Inc.";

    public StaticVariableDemo(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public void display() {
        System.out.println("Employee ID: " + empId + ", Name: " + name + ", Company: " + companyName);
    }

    public static void main(String[] args) {
        // Creating multiple employee objects
        StaticVariableDemo emp1 = new StaticVariableDemo(101, "Alice");
        StaticVariableDemo emp2 = new StaticVariableDemo(102, "Bob");

        System.out.println("--- Initial Employee Details ---");
        emp1.display();
        emp2.display();

        System.out.println("\n--- Changing the Shared Static Variable ---");
        // We can access and change a static variable using the class name
        StaticVariableDemo.companyName = "Global Tech Solutions";

        // Both objects now reflect the updated shared company name! 
        // We didn't change emp1 or emp2 directly, but the shared static variable.
        emp1.display();
        emp2.display();
    }
}

/*
 * SUMMARY / LEARNING OBJECTIVES:
 * This program teaches the concept of 'static' variables in Java.
 * - Unlike instance variables which are unique per object, a static variable is shared globally by the class.
 * - There is only one copy of a static variable in memory.
 * - Modifying a static variable will reflect that change across all objects of the class.
 */
