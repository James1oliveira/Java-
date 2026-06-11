/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 33980
 */
public class MixedMessages {
    public static void main(String[] args) {
        int x = 0;
        int y = 30;
        for (int outer = 0; outer < 3; outer++) {
            for (int inner = 4; inner > 1; inner--) {
                y = y - 2;
                if (x == 6) {
                    break;
                }
                // CANDIDATE CODE GOES HERE
            }
            y = y - 2;
        }
        System.out.println(x + " " + y);
    }
}
