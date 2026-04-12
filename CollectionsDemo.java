/* Collections in Java 
1) Array list: it is a resizable array implementation of the List interface 
2) Linked list: it is a doubly-linked list implementation of the List interface 
3) Hash set: it is a collection that does not allow duplicate elements and is implemented using a hash table 
4) Tree set: it is a collection that stores elements in a sorted order and is implemented using a tree structure 
5) Hash map: it is a collection that stores key-value pairs and is implemented using a hash table 
6) Tree map: it is a collection that stores key-value pairs in a sorted order and is implemented using a tree structure 


*/ 

// limittations of array in java
//1) fixed size: once an array is created, its size cannot be changed. This can lead to wasted memory if the array is larger than needed, or to errors if the array is too small to hold all the data.
//2) homogeneous data: an array can only hold elements of the same data type. This can be limiting if you need to store different types of data in the same collection.
//3) lack of built-in methods: arrays do not have built-in methods for common operations such as adding, removing, or searching for elements. This can make it more difficult to work with arrays compared to other collection types that have these methods built-in.
//4) performance issues: when adding or removing elements from an array, it may require shifting    elements to maintain the order, which can lead to performance issues, especially for large arrays. Additionally, searching for elements in an array can be inefficient if the array is not sorted.
//5) lack of flexibility: arrays do not provide the flexibility to easily resize or change the structure of the collection, which can be a limitation in certain use cases where dynamic data structures are needed.

import java.util.ArrayList;

class ArrayDemo {
    public static void main(String[] args) {
        int[] numbers = new int[5]; // creating an array of size 5
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // numbers[5] = 60; // would throw ArrayIndexOutOfBoundsException

        // Mixed data using Object array
        Object[] mixedArray = new Object[5];
        mixedArray[0] = 10;
        mixedArray[1] = "Hello";
        mixedArray[2] = 3.14;
        mixedArray[3] = true;
        mixedArray[4] = 'A';

        System.out.println("Elements in the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("Elements in the mixed array:");
        for (Object item : mixedArray) {
            System.out.println(item);
        }
    }
}

class CollectionsDemo {
    public static void main(String[] args) {
        // ArrayList Demo
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Alice");
        arrayList.add("Bob");
        arrayList.add("Charlie");

        System.out.println("Elements in ArrayList:");
        for (String name : arrayList) {
            System.out.println(name);
        }

        // Removing an element
        arrayList.remove("Bob");

        System.out.println("After removing Bob:");
        for (String name : arrayList) {
            System.out.println(name);
        }

        // Accessing element
        System.out.println("First element: " + arrayList.get(0));
    }
}
