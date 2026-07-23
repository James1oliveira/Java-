/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter18.snippet;

/**
 *
 * @author 33980
 */
public final class ImmutableData {
  private final String name;
  private final int value;

  public ImmutableData(String name, int value) {
    this.name = name;
    this.value = value;
  }

  public String getName() { return name; }
  public int getValue() { return value; }
}
