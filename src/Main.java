import javax.swing.*;
import java.awt.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
   public static void main(String[] arg){
       JFrame frame = new JFrame("tex");
       frame.setSize(500,500);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
       frame.getContentPane().setBackground(new Color(83, 150, 239));

       random_tex tex = new random_tex();
       frame.add(tex.label);
   }
}