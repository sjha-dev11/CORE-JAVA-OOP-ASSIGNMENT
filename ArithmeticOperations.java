import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Arithmetic Operations ---");
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("\nResults:");
        // Addition
        System.out.println("Addition (" + num1 + " + " + num2 + ") = " + (num1 + num2));

        // Subtraction
        System.out.println("Subtraction (" + num1 + " - " + num2 + ") = " + (num1 - num2));

        // Multiplication
        System.out.println("Multiplication (" + num1 + " * " + num2 + ") = " + (num1 * num2));

        // Division and Modulus (with a check to prevent dividing by zero)
        if (num2 != 0) {
            System.out.println("Division (" + num1 + " / " + num2 + ") = " + (num1 / num2));
            System.out.println("Modulus (" + num1 + " % " + num2 + ") = " + (num1 % num2));
        } else {
            System.out.println("Division: Cannot divide by zero!");
            System.out.println("Modulus: Cannot find remainder when dividing by zero!");
        }

        scanner.close();
    }
}
