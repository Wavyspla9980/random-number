import javax.swing.*;
import java.util.Random;

public class random_tex extends JFrame {
    Random random = new Random();
    int a = random.nextInt(500);
    int b = random.nextInt(599);
    JLabel label = new JLabel("number:"+a+b);
}
