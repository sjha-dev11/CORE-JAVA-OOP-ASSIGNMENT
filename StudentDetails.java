public class StudentDetails {
    // Student attributes
    int rollNo;
    String name;
    int age;
    String course;

    // Default constructor (optional, provided by compiler if not explicitly
    // declared)
    public StudentDetails() {
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        // Creating the first student object
        StudentDetails student1 = new StudentDetails();

        // Assigning values to the student1 object's properties
        student1.rollNo = 44;
        student1.name = "Asmit Rawat";
        student1.age = 20;
        student1.course = "Computer Science";

        // Creating a second student object
        StudentDetails student2 = new StudentDetails();

        // Assigning values to the student2 object's properties
        student2.rollNo = 148;
        student2.name = "Tanish Singhal";
        student2.age = 20;
        student2.course = "Information Technology";

        // Displaying details using the objects' method
        student1.displayDetails();
        student2.displayDetails();
    }
}
