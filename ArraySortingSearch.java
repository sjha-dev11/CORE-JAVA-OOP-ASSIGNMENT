import java.util.Arrays;
import java.util.Scanner;

/**
 * Program: 7. Array Sorting/Search
 * Concepts Covered: Arrays, nested loops, indexing
 * Why it's Important: Understands how to store and manage data collections.
 */
public class ArraySortingSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = {45, 12, 85, 32, 89, 39, 69, 44, 42, 1, 6, 8};
        
        System.out.println("Original Array: " + Arrays.toString(numbers));
        
        // Sorting the array
        Arrays.sort(numbers);
        System.out.println("Sorted Array:   " + Arrays.toString(numbers));
        
        // Searching in the array
        System.out.print("Enter a number to search in the array: ");
        int key = scanner.nextInt();
        
        int index = Arrays.binarySearch(numbers, key);
        
        if (index >= 0) {
            System.out.println("Element " + key + " found at index " + index + " in the sorted array.");
        } else {
            System.out.println("Element " + key + " not found in the array.");
        }
        scanner.close();
    }
}
