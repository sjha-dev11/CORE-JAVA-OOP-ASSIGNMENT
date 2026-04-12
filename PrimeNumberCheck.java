import java.util.Scanner;

/**
 * Program: 8. Prime Number Check
 * Concepts Covered: break statement, nested logic
 * Why it's Important: Teaches efficiency and optimizing loop exits.
 */
public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer to check if it's prime: ");
        int num = scanner.nextInt();
        
        boolean isPrime = true;
        
        if (num <= 1) {
            isPrime = false;
        } else {
            // Loop optimizations - only check up to square root of num
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; // Early exit, efficiency
                }
            }
        }
        
        if (isPrime) {
            System.out.println(num + " is a Prime number.");
        } else {
            System.out.println(num + " is not a Prime number.");
        }
        scanner.close();
    }
}
