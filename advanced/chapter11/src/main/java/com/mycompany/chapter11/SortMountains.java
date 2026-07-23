```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 * to edit this template.
 */
package com.mycompany.chapter11;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates how to sort a list of Mountain objects
 * by name and by height using lambda expressions.
 *
 * @author letha
 */
public class SortMountains {

    // Program entry point
    public static void main(String[] args) {
        new SortMountains().go();
    }

    // Creates and sorts a list of mountains
    public void go() {

        // Create an ArrayList to store Mountain objects
        List<Mountain> mountains = new ArrayList<>();

        // Add Mountain objects to the list
        mountains.add(new Mountain("Longs", 14255));
        mountains.add(new Mountain("Elbert", 14433));
        mountains.add(new Mountain("Maroon", 14156));
        mountains.add(new Mountain("Castle", 14265));

        // Display the list in the order it was added
        System.out.println("as entered:\n" + mountains);

        // Sort the mountains alphabetically by name
        mountains.sort((m1, m2) -> m1.name.compareTo(m2.name));

        // Display the sorted list
        System.out.println("by name:\n" + mountains);

        // Sort the mountains by height from tallest to shortest
        mountains.sort((m1, m2) -> m2.height - m1.height);

        // Display the sorted list
        System.out.println("by height:\n" + mountains);
    }
}

// Class representing a mountain
class Mountain {

    // Mountain name
    String name;

    // Mountain height in feet
    int height;

    // Constructor to initialize the mountain's name and height
    Mountain(String name, int height) {
        this.name = name;
        this.height = height;
    }

    // Returns a readable string representation of the mountain
    @Override
    public String toString() {
        return name + " " + height;
    }
}
```
