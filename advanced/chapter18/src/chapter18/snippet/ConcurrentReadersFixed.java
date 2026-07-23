/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter18.snippet;

/**
 *
 * @author 33980
 */
import java.util.*;
import java.util.concurrent.*;
import java.time.LocalDateTime;
import static java.time.format.DateTimeFormatter.ofLocalizedTime;
import static java.time.format.FormatStyle.MEDIUM;

public class ConcurrentReadersFixed {
  public static void main(String[] args) {
    List<ChatFixed> chatHistory = new CopyOnWriteArrayList<>();
    ExecutorService executor = Executors.newFixedThreadPool(3);
    for (int i = 0; i < 5; i++) {
      executor.execute(() -> chatHistory.add(new ChatFixed("Hi there!")));
      executor.execute(() -> System.out.println(chatHistory));
      executor.execute(() -> System.out.println(chatHistory));
    }
    executor.shutdown();
  }
}

final class ChatFixed {
  private final String message;
  private final LocalDateTime timestamp;

  public ChatFixed(String message) {
    this.message = message;
    timestamp = LocalDateTime.now();
  }

  public String toString() {
    String time = timestamp.format(ofLocalizedTime(MEDIUM));
    return time + " " + message;
  }
}