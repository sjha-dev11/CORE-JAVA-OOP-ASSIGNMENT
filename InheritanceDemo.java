// Parent class (Superclass)
class Animal {
    // Properties of the parent
    String name;
    int age;

    // Behaviors of the parent
    public void eat() {
        System.out.println(name + " is eating its food.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Child class (Subclass) inheriting from Parent Animal
class Dog extends Animal {
    // Property specific to the child class
    String breed;

    // Behavior specific to the child class
    public void bark() {
        System.out.println(name + " the " + breed + " is barking (Woof!).");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("--- Creating a Dog Object ---");
        Dog myDog = new Dog();
        
        // The child object has inherited the 'name' and 'age' properties from the parent Animal class
        myDog.name = "Archie";
        myDog.age = 3;
        
        // Specific property of the child dog class
        myDog.breed = "Golden Retriever";

        // Calling inherited methods from parent class
        myDog.eat();
        myDog.sleep();

        // Calling method specific to child class
        myDog.bark();
        System.out.println("Age of dog: " + myDog.age);
    }
}

/*
 * SUMMARY / LEARNING OBJECTIVES:
 * This program teaches the Object-Oriented principle of Inheritance.
 * - A Subclass (Child) uses the 'extends' keyword to inherit from a Superclass (Parent).
 * - The Child automatically gains access to the Parent's non-private properties and methods.
 * - This promotes code reusability by establishing an IS-A relationship (e.g., Dog IS AN Animal).
 */
