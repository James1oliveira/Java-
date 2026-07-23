/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter14.Exercise;

/**
 *
 * @author 33980
 */

// Import Swing classes for creating the GUI
import javax.swing.*;

// Import AWT classes for layouts
import java.awt.*;

// Import event classes for handling button clicks
import java.awt.event.*;

public class InnerButton {

    // Declare a button that can be accessed throughout the class
    private JButton button;

    // Main method - program execution starts here
    public static void main(String[] args) {

        // Create an object of the InnerButton class
        InnerButton gui = new InnerButton();

        // Call the method that builds and displays the GUI
        gui.go();
    }

    // Method to create and display the GUI
    public void go() {

        // Create a new window (JFrame)
        JFrame frame = new JFrame();

        // Close the program when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a button with the text "A"
        button = new JButton("A");

        // Register an ActionListener to respond when the button is clicked
        button.addActionListener(new ButtonListener());

        // Add the button to the bottom (South) of the frame
        frame.getContentPane().add(BorderLayout.SOUTH, button);

        // Set the size of the window
        frame.setSize(200, 100);

        // Make the window visible
        frame.setVisible(true);
    }

    // Inner class that handles button click events
    class ButtonListener implements ActionListener {

        // This method is automatically called whenever the button is clicked
        public void actionPerformed(ActionEvent e) {

            // Check if the button currently displays "A"
            if (button.getText().equals("A")) {

                // Change the button text to "B"
                button.setText("B");

            } else {

                // Otherwise, change the button text back to "A"
                button.setText("A");
            }
        }
    }
}