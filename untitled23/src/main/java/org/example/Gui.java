package org.example;

import javax.swing.*;
import java.util.Random;

import static java.lang.Math.random;

public class Gui {
    JButton button = new JButton("generator");

    public  Gui(){
        button.addActionListener(e -> {
            int random = new Random((long) 49999).nextInt();

            Main.frame.getContentPane().removeAll();

            JLabel label = new JLabel(String.valueOf(random()));

            Main.frame.add(label).setBounds(600,300,300,300);
            Main.frame.add(new Gui().button).setBounds(500,500,200,50);

            System.out.println(random());
        });
    }
}
