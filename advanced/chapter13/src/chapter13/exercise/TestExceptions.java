/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter13.exercise;

/**
 *
 * @author 33980
 */

public class TestExceptions {
    public static void main(String[] args) {

        // Change this to "yes" to trigger the exception
        String test = "no";

        try {
            // Code that may throw an exception
            System.out.println("start try");

            // Call the risky method
            doRisky(test);

            // Runs only if no exception occurs
            System.out.println("end try");

        } catch (ScaryException se) {
            // Handles the custom exception
            System.out.println("scary exception");

        } finally {
            // Always runs, whether an exception occurs or not
            System.out.println("finally");
        }

        // Program continues after try-catch-finally
        System.out.println("end of main");
    }

    // Method that may throw a ScaryException
    static void doRisky(String test) throws ScaryException {

        // Indicate the method has started
        System.out.println("start risky");

        // If test is "yes", throw the custom exception
        if ("yes".equals(test)) {
            throw new ScaryException();
        }

        // Runs only if no exception is thrown
        System.out.println("end risky");
    }
}

// Custom exception class
class ScaryException extends Exception {
}