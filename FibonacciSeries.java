import java.util.Scanner;

/**
 * Program: 5. Fibonacci Series
 * Concepts Covered: while loops, swapping variables
 * Why it's Important: Enhances logical thinking for sequence generation.
 */
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms for Fibonacci sequence: ");
        int n = scanner.nextInt();
        
        int firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");
        
        int count = 1;
        // Using while loop to generate string of numbers
        while (count <= n) {
            System.out.print(firstTerm + (count < n ? ", " : ""));
            
            // Swap logic to update terms
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            
            count++;
        }
        System.out.println();
        scanner.close();
    }
}
