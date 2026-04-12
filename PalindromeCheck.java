import java.util.Scanner;

/**
 * Program: 6. Palindrome Check
 * Concepts Covered: String manipulation, reverse()
 * Why it's Important: Introduces how Java handles text (Strings) vs Characters.
 */
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string to check if it's a palindrome: ");
        String original = scanner.nextLine();
        
        // Reversing string using StringBuilder
        String reversed = new StringBuilder(original).reverse().toString();
        
        // Checking if original equals reversed (ignoring case for robust check)
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("\"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + original + "\" is Not a Palindrome.");
        }
        scanner.close();
    }
}
