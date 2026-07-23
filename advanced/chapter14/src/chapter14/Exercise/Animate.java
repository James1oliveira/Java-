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

// Import AWT classes for drawing graphics
import java.awt.*;

// Import TimeUnit to pause the animation
import java.util.concurrent.TimeUnit;

public class Animate {

    // Starting x and y coordinates for the rectangle
    int x = 1;
    int y = 1;

    // Main method - program execution starts here
    public static void main(String[] args) {

        // Create an Animate object
        Animate gui = new Animate();

        // Call the method to build and display the GUI
        gui.go();
    }

    // Method to create the window and run the animation
    public void go() {

        // Create a new window (JFrame)
        JFrame frame = new JFrame();

        // Close the application when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create an object of the custom drawing panel
        MyDrawP drawP = new MyDrawP();

        // Add the drawing panel to the frame
        frame.getContentPane().add(drawP);

        // Set the window size
        frame.setSize(500, 270);

        // Display the window
        frame.setVisible(true);

        // Loop to animate the rectangle
        for (int i = 0; i < 124; i++, y++, x++) {

            // Increase the x-coordinate by an additional 1 each loop
            x++;

            // Redraw the panel with the updated coordinates
            drawP.repaint();

            // Pause for 50 milliseconds to slow the animation
            try {
                TimeUnit.MILLISECONDS.sleep(50);
            } catch (Exception ex) {
                // Ignore any interruption exceptions
            }
        }
    }

    // Inner class that creates a custom drawing panel
    class MyDrawP extends JPanel {

        // This method is automatically called whenever repaint() is executed
        public void paintComponent(Graphics g) {

            // Paint the background white
            g.setColor(Color.white);
            g.fillRect(0, 0, 500, 250);

            // Set the drawing color to blue
            g.setColor(Color.blue);

            // Draw a blue rectangle that becomes smaller
            // as x and y increase during the animation
            g.fillRect(x, y, 500 - x * 2, 250 - y * 2);
        }
    }
}