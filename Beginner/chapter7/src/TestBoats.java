/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 33980
 */
public class TestBoats {

    public static void main(String[] args) {

        // Create a general Boat object
        Boat b1 = new Boat();

        // Create a Sailboats object (special type of Boat)
        Sailboats b2 = new Sailboats();

        // Create a Rowboat object (also a type of Boat)
        Rowboat b3 = new Rowboat();

        // Set the length of the sailboat
        b2.setLength(32);

        // Call move() on the Boat object
        // Expected behavior: drift (default Boat movement)
        b1.move();

        // Call move() on Rowboat
        // Rowboat does NOT override move(),
        // so it inherits Boat's move() method → drift
        b3.move();

        // Call move() on Sailboats
        // Sailboats overrides move(), so it behaves differently → hoist sail
        b2.move();
    }
}