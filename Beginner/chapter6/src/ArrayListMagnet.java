```java
import java.util.ArrayList; 

public class ArrayListMagnet {
    public static void main(String[] args) {

        // Create an ArrayList that stores String values
        ArrayList<String> a = new ArrayList<String>();

        // Add elements at specific index positions
        a.add(0, "zero");
        a.add(1, "one");
        a.add(2, "two");
        a.add(3, "three");

        // Display the original list
        printList(a);                          // Output: zero one two three

        // Check if "three" exists in the list
        // If it does, add "four" to the end of the list
        if (a.contains("three")) {
            a.add("four");
        }

        // Remove the element at index 2 ("two")
        a.remove(2);

        // Display the updated list
        printList(a);                          // Output: zero one three four

        // Check if "four" is NOT at index 4
        // Since "four" is currently at index 3, add "4.2" at index 4
        if (a.indexOf("four") != 4) {
            a.add(4, "4.2");
        }

        // Display the updated list
        printList(a);                          // Output: zero one three four 4.2

        // Check if "two" is still in the list
        // It was removed earlier, so this block will not execute
        if (a.contains("two")) {
            a.add("2.2");
        }

        // Display the final list (no changes from previous output)
        printList(a);                          // Output: zero one three four 4.2
    }

    // Method to print every element in the ArrayList
    public static void printList(ArrayList<String> list) {

        // Enhanced for loop to go through each element
        for (String element : list) {
            System.out.print(element + " ");
        }

        // Move to the next line after printing all elements
        System.out.println();
    }
}
```
