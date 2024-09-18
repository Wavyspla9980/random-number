package org.example;

import javax.swing.*;

public class Menu_start {;

    JButton button = new JButton("Start");

    public  Menu_start(){
        button.addActionListener(e -> {
            Main.frame.getContentPane().removeAll();
            SwingUtilities.updateComponentTreeUI(Main.frame);

            Main.frame.add(new Gui().button).setBounds(500,500,200,50);
        });
    }
}
