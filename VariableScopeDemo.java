public class VariableScopeDemo {
    // Instance variable: declared inside the class, outside any method.
    // It belongs to the object (instance) of the class and has a default value (e.g., 0 for int).
    int instanceVar = 10;

    public void demonstrateVariables() {
        // Local variable: declared inside a method.
        // It must be initialized before use, and only exists within this method.
        // It does not have a default value.
        int localVar = 20;

        System.out.println("Inside demonstrateVariables method:");
        System.out.println("  Local Variable: " + localVar);
        System.out.println("  Instance Variable: " + instanceVar);
        
        // Modifying both variables
        localVar += 5;
        instanceVar += 5;
        System.out.println("  After modification:");
        System.out.println("  Local: " + localVar + ", Instance: " + instanceVar);
    }

    public static void main(String[] args) {
        VariableScopeDemo obj1 = new VariableScopeDemo();
        System.out.println("--- First Object ---");
        obj1.demonstrateVariables();

        System.out.println("\n--- Second Object ---");
        VariableScopeDemo obj2 = new VariableScopeDemo();
        // Since the instance variable belongs to the object, obj2 starts with a fresh instanceVar of 10.
        // The local variable is recreated entirely inside memory every time the method is called.
        obj2.demonstrateVariables();
    }
}

/*
 * SUMMARY / LEARNING OBJECTIVES:
 * This program teaches the difference between instance variables and local variables.
 * - Instance variables belong to an object and maintain state as long as the object exists.
 * - Local variables belong to a specific method and are created/destroyed each time the method runs.
 */
