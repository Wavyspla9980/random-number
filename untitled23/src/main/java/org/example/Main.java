package org.example;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main {
    static JFrame frame = new JFrame();
    static  private  JButton button = new Menu_start().button;

    public static void main(String[] args) {
        frame.setLayout(null);
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(button).setBounds(400,500,500,50);
    }
}