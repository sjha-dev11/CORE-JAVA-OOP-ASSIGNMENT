public class CollegeStudent extends Student {
    private String collegeName;
    private String major;

    public CollegeStudent(int rollNo, String name, int[] marks, String collegeName, String major) {
        super(rollNo, name, marks);
        this.collegeName = collegeName;
        this.major = major;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("College: " + collegeName);
        System.out.println("Major: " + major);
    }
}
/*
 * Explanation:
 * This file defines the CollegeStudent class, which demonstrates the
 * Object-Oriented concept of Inheritance.
 * It extends the generic Student class to inherit its properties and methods,
 * while adding specific fields suitable for a college student.
 * 
 * Methods:
 * - Constructor: Uses the 'super' keyword to invoke the parent class (Student)
 * constructor and then initializes its own fields (collegeName, major).
 * - displayDetails(): Overrides the parent class's displayDetails() method. It
 * first calls the parent's version using 'super' and then appends the specific
 * college and major details to the output.
 */
