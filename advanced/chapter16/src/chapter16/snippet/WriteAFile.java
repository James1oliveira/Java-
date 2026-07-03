/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter16.snippet;

/**
 *
 * @author 33980
 */
import java.io.*;

public class WriteAFile {
  public static void main(String[] args) {
    try {
      FileWriter writer = new FileWriter("Foo.txt");
      writer.write("hello foo!");
      writer.close();
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }
}