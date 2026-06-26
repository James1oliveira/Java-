/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chapter2;

/**
 *
 * 
 */
public class EchoTestDrive {

    public static void main(String[] args) {

        // Create the first Echo object
        Echo e1 = new Echo();

        // Create a second, separate Echo object
        Echo e2 = new Echo();

        // Loop counter
        int x = 0;

        // Repeat the loop while x is less than 4
        while (x < 4) {

            // Call the hello() method on the first object
            e1.hello();

            // Increase e1's count by 1 each time through the loop
            e1.count = e1.count + 1;

            // On the last iteration (when x == 3),
            // increase e2's count by 1
            if (x == 3) {
                e2.count = e2.count + 1;
            }

            // From the second iteration onwards (x > 0),
            // add e1's current count to e2's count
            if (x > 0) {
                e2.count = e2.count + e1.count;
            }

            // Increase the loop counter
            x = x + 1;
        }

        // Display the final value of e2's count
        System.out.println(e2.count);
    }
}
