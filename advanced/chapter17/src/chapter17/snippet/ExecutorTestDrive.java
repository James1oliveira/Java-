/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter17.snippet;

/**
 *
 * @author 33980
 */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTestDrive {
  public static void main(String[] args) {
    ExecutorService executor =
      Executors.newSingleThreadExecutor();
    executor.execute(() ->
      System.out.println("top o' the stack"));
    System.out.println("back in main");
    executor.shutdown();
  }
}