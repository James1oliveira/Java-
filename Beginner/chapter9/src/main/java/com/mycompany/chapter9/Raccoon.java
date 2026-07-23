/*
 * Raccoon class used to demonstrate object references.
 * A Raccoon object can hold references to both a Honey
 * object and a Kit object.
 */


// Class representing a Raccoon
public class Raccoon {

    // Reference variable that can point to a Honey object.
    // Default value is null until a Honey object is assigned.
    public Honey rh;

    // Reference variable that can point to a Kit object.
    // Default value is null until a Kit object is assigned.
    public Kit rk;

    // Constructor
    // Runs automatically whenever a new Raccoon object is created.
    public Raccoon() {

        // Display a message showing that the Raccoon object
        // has been successfully created.
        System.out.println("Raccoon object created");
    }
}