/**
 * Program: 9. Method Overloading
 * Concepts Covered: Methods, parameters, polymorphism
 * Why it's Important: Shows how to write reusable and flexible code blocks.
 */
public class MethodOverloading {
    
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }
    
    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Overloaded method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloading math = new MethodOverloading();
        
        System.out.println("Add two int (5 + 10): " + math.add(5, 10));
        System.out.println("Add three int (5 + 10 + 15): " + math.add(5, 10, 15));
        System.out.println("Add two double (5.5 + 4.2): " + math.add(5.5, 4.2));
    }
}
