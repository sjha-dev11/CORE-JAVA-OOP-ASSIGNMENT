import java.util.Scanner;

/**
 * Program: 3. Odd or Even
 * Concepts Covered: if-else statements, Modulo operator (%)
 * Why it's Important: Introduces basic conditional decision-making logic.
 */
public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        
        // Checking if the number is divisible by 2 using modulo operator
        if (num % 2 == 0) {
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd.");
        }
        
        scanner.close();
    }
}
