import java.util.Scanner;

/**
 * Program: 4. Factorial of a Number
 * Concepts Covered: for loops, integer limits
 * Why it's Important: Master the concept of iteration and cumulative values.
 */
public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();
        
        long factorial = 1; // Using long to handle larger results
        
        // Calculating factorial: n! = n * (n-1) * ... * 1
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        
        System.out.println("Factorial of " + num + " is: " + factorial);
        scanner.close();
    }
}
