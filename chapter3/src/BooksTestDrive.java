/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * 
 */
public class BooksTestDrive {

    public static void main(String[] args) {

        // Create an array that can hold 3 Books objects
        Books[] myBooks = new Books[3];

        // Loop counter
        int x = 0;

        // Create three separate Books objects and store them in the array
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        // Assign a title to each book
        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";

        // Assign an author to each book
        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";

        // Loop through each Books object in the array
        while (x < 3) {

            // Print the title of the current book
            System.out.print(myBooks[x].title);

            // Print " by " after the title
            System.out.print(" by ");

            // Print the author of the current book
            System.out.println(myBooks[x].author);

            // Move to the next book in the array
            x = x + 1;
        }
    }
}