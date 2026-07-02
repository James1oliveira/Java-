/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 33980
 */
public class output {

    public static void main(String[] args) {

        // Create an instance of the output class
        output output = new output();

        // Call the go() method on the object
        output.go();
    }

    void go() {

        // Initialize value to 7
        int value = 7;

        // Loop from i = 1 to i < 8 (i = 1 to 7)
        for (int i = 1; i < 8; i++) {

            // Increase value by 1 on each loop iteration
            value++;

            // Only execute this block when i is greater than 4
            if (i > 4) {

                // Pre-increment value, then print it followed by a space
                System.out.print(++value + " ");
            }

            // If value becomes greater than 14, print i and stop the loop
            if (value > 14) {

                System.out.println(" i = " + i);

                // Exit the loop immediately
                break;
            }
        }
    }
}