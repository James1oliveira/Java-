/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter17.snippet;

/**
 *
 * @author 33980
 */
import java.util.concurrent.*;

public class PredictableLatch {
  public static void main(String[] args) {
    ExecutorService executor = Executors.newSingleThreadExecutor();
    CountDownLatch latch = new CountDownLatch(1);
    executor.execute(() -> waitForLatchThenPrint(latch));
    System.out.println("back in main");
    latch.countDown();
    executor.shutdown();
  }

  private static void waitForLatchThenPrint(CountDownLatch latch) {
    try {
      latch.await();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("top o' the stack");
  }
}