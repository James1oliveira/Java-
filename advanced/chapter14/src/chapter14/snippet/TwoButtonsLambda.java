/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter14.snippet;

/**
 *
 * @author 33980
 */
import javax.swing.*;
import java.awt.*;

public class TwoButtonsLambda {
  private JFrame frame;
  private JLabel label;

  public static void main(String[] args) {
    TwoButtonsLambda gui = new TwoButtonsLambda();
    gui.go();
  }

  public void go() {
    frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JButton labelButton = new JButton("Change Label");
    labelButton.addActionListener(event -> label.setText("Ouch!"));
    JButton colorButton = new JButton("Change Circle");
    colorButton.addActionListener(event -> frame.repaint());
    label = new JLabel("I'm a label");
    MyDrawPanel drawPanel = new MyDrawPanel();
    frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
    frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
    frame.getContentPane().add(BorderLayout.EAST, labelButton);
    frame.getContentPane().add(BorderLayout.WEST, label);
    frame.setSize(500, 400);
    frame.setVisible(true);
  }
}