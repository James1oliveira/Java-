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

public class ExecutorTester {
  public static void main(String[] args) {
    Runnable job = new MyRunnable();
    ExecutorService executor = Executors.newSingleThreadExecutor();
    executor.execute(job);
    System.out.println(Thread.currentThread().getName() +
                       ": back in main");
    Thread.dumpStack();
    executor.shutdown();
  }
}