public class Student {
    protected int rollNo;
    protected String name;
    protected int[] marks;
    public static int studentCount = 0;

    public Student(int rollNo, String name, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        studentCount++;
    }

    public void displayDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }

    public void formatName() {
        System.out.println("Original Name: " + name);
        System.out.println("Uppercase Name: " + name.toUpperCase());
        System.out.println("Lowercase Name: " + name.toLowerCase());
        System.out.println("Name Length: " + name.length());
    }

    public void displayMarks() {
        System.out.println("Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
    }

    public void calculateAverage() {
        if (marks == null || marks.length == 0) {
            System.out.println("Average Marks: 0.0");
            return;
        }
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        double average = (double) sum / marks.length;
        System.out.println("Average Marks: " + average);
    }
}
/*
Explanation:
This file defines the Student class which represents a generic student in the system.
The core idea is to store information such as roll number, name, and an array of marks for 5 subjects. 
We also maintain a static variable to keep track of the total number of students created, which demonstrates the use of shared static data.

Methods:
- Constructor: Initializes the rollNo, name, and marks. It also increments the static studentCount.
- displayDetails(): Prints the basic details (roll number and name) of the student.
- formatName(): Uses String methods to print the student's name in original, uppercase, and lowercase formats, as well as its length.
- displayMarks(): Iterates over the integer array of marks using a for loop and prints each mark.
- calculateAverage(): computes the sum of all marks and calculates the average, demonstrating array processing and basic math.
*/
