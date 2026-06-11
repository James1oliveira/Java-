/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 33980
 */
public class DogBark {
    void bark(int numOfBarks) {
        while (numOfBarks > 0) {
            System.out.println("ruff");
            numOfBarks = numOfBarks - 1;
        }
    }

    public static void main(String[] args) {
        DogBark d = new DogBark();
        d.bark(3);
    }
}
