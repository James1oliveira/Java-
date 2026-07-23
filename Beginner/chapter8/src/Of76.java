/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 33980
 */

// Of76 inherits from Clowns
public class Of76 extends Clowns {

    // Main method - program entry point
    public static void main(String[] args) {

        // Create an array of Nose references that can store objects
        // implementing the Nose interface
        Nose[] i = new Nose[3];

        // Store different object types in the array
        i[0] = new Acts();     // Acts object
        i[1] = new Clowns();   // Clowns object
        i[2] = new Of76();     // Of76 object

        // Loop through each object in the array
        for (int x = 0; x < 3; x++) {

            // Call iMethod() using polymorphism
            // Print the returned value and the object's class name
            System.out.println(i[x].iMethod() + " " + i[x].getClass());
        }
    }
}

// Interface that requires implementing classes to define iMethod()
interface Nose {

    // Method that must return an integer
    public int iMethod();
}

// Abstract class that implements the Nose interface
abstract class Picasso implements Nose {

    // Default implementation of iMethod()
    public int iMethod() {
        return 7;
    }
}

// Clowns inherits Picasso's iMethod(), so it returns 7
class Clowns extends Picasso { }

// Acts also extends Picasso but overrides iMethod()
class Acts extends Picasso {

    // Override the inherited method to return 5 instead of 7
    public int iMethod() {
        return 5;
    }
}