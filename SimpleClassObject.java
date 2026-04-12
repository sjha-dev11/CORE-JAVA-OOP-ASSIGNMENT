/**
 * Program: 10. Simple Class & Object
 * Concepts Covered: Constructor, this keyword, instantiation
 * Why it's Important: The gateway to OOP - modeling real-world entities.
 */
public class SimpleClassObject {
    String name;
    int age;
    
    // Constructor
    public SimpleClassObject(String name, int age) {
        this.name = name; // Using 'this' keyword to refer to current object's attributes
        this.age = age;
    }
    
    // Method to display object details
    public void displayProfile() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }
    
    public static void main(String[] args) {
        // Instantiating objects from the class Let's make an Alice and a Bob!
        SimpleClassObject person1 = new SimpleClassObject("Alice", 25);
        SimpleClassObject person2 = new SimpleClassObject("Bob", 30);
        
        // Calling method on objects
        person1.displayProfile();
        person2.displayProfile();
    }
}
