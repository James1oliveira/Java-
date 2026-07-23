/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter18.exercise;

/**
 *
 * @author 33980
 */

```java
import java.util.*;
import java.util.concurrent.*;

public class TwoThreadsWriting {

    public static void main(String[] args) {

        // Create a thread pool with two worker threads
        ExecutorService threadPool = Executors.newFixedThreadPool(2);

        // Create one shared Data object that both threads will access
        Data data = new Data();

        // First thread adds lowercase letters (a-z)
        threadPool.execute(() -> addLetterToData('a', data));

        // Second thread adds uppercase letters (A-Z)
        threadPool.execute(() -> addLetterToData('A', data));

        // Stop accepting new tasks after the current ones finish
        threadPool.shutdown();
    }

    // Adds 26 letters to the shared Data object
    private static void addLetterToData(char letter, Data data) {

        // Loop through the alphabet
        for (int i = 0; i < 26; i++) {

            // Add the current letter to the shared list
            data.addLetter(letter++);

            try {
                // Pause briefly to make thread interleaving easier to observe
                Thread.sleep(50);
            } catch (InterruptedException ignored) {
                // Ignore interruption for this example
            }
        }

        // Display the contents of the shared list
        System.out.println(Thread.currentThread().getName() + data.getLetters());

        // Display the total number of items in the shared list
        System.out.println(Thread.currentThread().getName()
                + " size = " + data.getLetters().size());
    }
}

// Class that stores letters in a shared list
final class Data {

    // List used to store the letters added by both threads
    private final List<String> letters = new ArrayList<>();

    // Returns the list of stored letters
    public List<String> getLetters() {
        return letters;
    }

    // Adds a letter to the list
    public void addLetter(char letter) {
        letters.add(String.valueOf(letter));
    }
}
```
