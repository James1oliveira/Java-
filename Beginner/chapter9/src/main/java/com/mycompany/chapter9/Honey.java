/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 * to edit this template.
 */

/**
 * Demonstrates object references and why an object is not
 * garbage collected while another object still references it.
 *
 * @author Admin
 */
public class Honey {

    // Constructor - called automatically whenever a Honey object is created.
    public Honey() {
        System.out.println("Honey object created");
    }

    public static void main(String[] args) {

        // Display a heading to show the program has started.
        System.out.println("=== Starting Program ===\n");

        // Create one Honey object.
        Honey honeyPot = new Honey();

        // Create an array with four elements.
        // Each element points to the SAME Honey object (honeyPot),
        // not four different Honey objects.
        Honey[] ha = {
            honeyPot, honeyPot,
            honeyPot, honeyPot
        };

        // Inform the user that all array elements reference
        // the same Honey object.
        System.out.println(
                "\nCreated Honey array with 4 references to the same Honey object.");

        // Create a Kit object.
        Kit kit = new Kit();

        // Store a reference to the Honey object inside the Kit object.
        kit.honey = honeyPot;

        // Display confirmation.
        System.out.println("\nKit now references the Honey object.");

        // Create a Raccoon object.
        Raccoon raccoon = new Raccoon();

        // Give the Raccoon a reference to the Honey object.
        raccoon.rh = honeyPot;

        // Give the Raccoon a reference to the Kit object.
        raccoon.rk = kit;

        // Display confirmation.
        System.out.println("Raccoon references the Honey object.");
        System.out.println("Raccoon also references the Kit object.");

        // Remove the local variable's reference to the Kit object.
        System.out.println("\nSetting kit = null...");
        kit = null;

        // Even though the local variable is null,
        // the Kit object still exists because raccoon.rk
        // is still pointing to it.
        // Therefore, it is NOT eligible for garbage collection.
        System.out.println("The Kit object is NOT garbage collectible.");
        System.out.println("Reason: raccoon.rk still references it.");

        // Program finished.
        System.out.println("\n=== End of main() ===");
    }
}
