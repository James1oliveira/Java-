/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter15.exercise;

/**
 *
 * @author 33980
 */

// Import Swing classes for creating the GUI
import javax.swing.*;

// Import AWT classes for layouts and colors
import java.awt.*;

public class SharpenYourPencil_ThreeButtons {

    // Main method - program execution starts here
    public static void main(String[] args) {

        // Create an object of the class and call the go() method
        new SharpenYourPencil_ThreeButtons().go();
    }

    // Method to build and display the GUI
    public void go() {

        // Create a new window (JFrame)
        JFrame frame = new JFrame();

        // Create a panel to hold the buttons
        JPanel panel = new JPanel();

        // Set the panel's background color to dark gray
        panel.setBackground(Color.darkGray);

        // Create three buttons with different labels
        JButton button = new JButton("shock me");
        JButton buttonTwo = new JButton("bliss");
        JButton buttonThree = new JButton("huh?");

        // Add the buttons to the panel
        panel.add(button);
        panel.add(buttonTwo);
        panel.add(buttonThree);

        // Add the panel to the right (East) side of the frame
        frame.getContentPane().add(BorderLayout.EAST, panel);

        // Set the size of the window
        frame.setSize(250, 200);

        // Display the window
        frame.setVisible(true);
    }
}