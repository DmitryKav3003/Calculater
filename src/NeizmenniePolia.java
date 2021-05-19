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
    int width = 50;
    int hight = 50;
    int x;
    int y;
    int z;
    Font font = new Font("", Font.BOLD, 24);
}
