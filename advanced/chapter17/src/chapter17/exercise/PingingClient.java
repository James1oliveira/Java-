/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter17.exercise;

/**
 *
 * @author 33980
 */
```java
import java.io.*;
import java.net.InetSocketAddress;
import java.nio.channels.*;
import java.time.format.FormatStyle;
import java.util.concurrent.TimeUnit;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.time.LocalDateTime.now;
import static java.time.format.DateTimeFormatter.ofLocalizedTime;

public class PingingClient {

    public static void main(String[] args) {

        // Create the server address using localhost and port 5000
        InetSocketAddress server = new InetSocketAddress("127.0.0.1", 5000);

        // Open a connection to the server
        try (SocketChannel channel = SocketChannel.open(server)) {

            // Create a PrintWriter to send text data through the socket
            PrintWriter writer = new PrintWriter(Channels.newWriter(channel, UTF_8));

            // Confirm that the connection was successful
            System.out.println("Networking established");

            // Send 10 ping messages to the server
            for (int i = 0; i < 10; i++) {

                // Create the message to send
                String message = "ping " + i;

                // Send the message to the server
                writer.println(message);

                // Ensure the message is immediately transmitted
                writer.flush();

                // Get the current time for logging
                String currentTime = now().format(ofLocalizedTime(FormatStyle.MEDIUM));

                // Display the time and message that was sent
                System.out.println(currentTime + " Sent " + message);

                // Wait one second before sending the next message
                TimeUnit.SECONDS.sleep(1);
            }

        } catch (IOException | InterruptedException e) {
            // Display any networking or interruption errors
            e.printStackTrace();
        }
    }
}
```

