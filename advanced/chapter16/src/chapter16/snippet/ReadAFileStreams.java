/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter16.snippet;

/**
 *
 * @author 33980
 */
import java.nio.file.*;
import java.io.IOException;

public class ReadAFileStreams {
  public static void main(String[] args) throws IOException {
    Files.lines(Path.of("MyText.txt"))
         .forEach(line -> System.out.println(line));
  }
}