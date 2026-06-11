/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 33980
 */
public class TestBoats {
    public static void main(String[] args) {
        Boat b1 = new Boat();
        Sailboats b2 = new Sailboats();
        Rowboat b3 = new Rowboat();

        b2.setLength(32);
        b1.move();    // drift
        b3.move();    // drift  (Rowboat inherits move() from Boat)
        b2.move();    // hoist sail
    }
}