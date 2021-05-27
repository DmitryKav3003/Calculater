import javax.swing.*;
import java.awt.*;

abstract class NeizmenniePolia {
    JFrame frame = new JFrame();
    JTextField tf = new JTextField();
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton c = new JButton("c");
    JButton plus = new JButton("+");
    JButton result = new JButton("=");
    JButton umn = new JButton("*");
    String text = "";
    int width = 50, hight = 50, x, y, z;
    Font font = new Font("", Font.BOLD, 24);
    String resultat;

    public NeizmenniePolia(){
        frame.setLayout(null);
        frame.setSize(400, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tf.setSize(300, 60);
        tf.setVisible(true);
        tf.setLocation(40, 20);
        frame.add(tf);
        tf.setFont(font);

        frame.add(b1);
        b1.setLocation(40, 200);
        b1.setFont(font);
        b1.setVisible(true);
        b1.setSize(width, hight);

        frame.add(b2);
        b2.setLocation(100, 200);
        b2.setFont(font);
        b2.setVisible(true);
        b2.setSize(width, hight);

        frame.add(c);
        c.setLocation(250, 200);
        c.setFont(font);
        c.setVisible(true);
        c.setSize(width, hight);

        frame.add(plus);
        plus.setLocation(100, 300);
        plus.setFont(font);
        plus.setVisible(true);
        plus.setSize(width, hight);

        frame.add(umn);
        umn.setLocation(180, 300);
        umn.setFont(font);
        umn.setVisible(true);
        umn.setSize(width, hight);

        frame.add(result);
        result.setLocation(40, 300);
        result.setFont(font);
        result.setVisible(true);
        result.setSize(width, hight);
    }
}
