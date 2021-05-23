import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//
//
//Этот класс не работает, если переношу весь экшнперформед сюда, то он начинает троить
//поэтому данные действия пришлось оставить в классе Constr
//

public class Perform implements ActionListener {
    JButton b1;
    JButton b2;
    JTextField tf;
    String text;
    JButton c;
    JButton plus;
    JButton umn;
    JButton result;
    int x;
    int y;
    int z;
    Perform(JButton b1, JButton b2, JTextField tf, String text, JButton c, JButton plus, JButton umn,
            JButton result, int x, int y, int z){
        this.b1 = b1;
        this.b2 = b2;
        this.tf = tf;
        this.text = text;
        this.c = c;
        this.plus = plus;
        this.umn = umn;
        this.result = result;
        this.x = x;
        this.y = y;
        this.z = z;
    }
    @Override
    public void actionPerformed(ActionEvent a) {
        if (a.getSource() == b1){
            text = text + b1.getText();
            tf.setText(text);
        }
        if (a.getSource() == c){
            text = "";
            tf.setText(text);
        }
        if (a.getSource() == b2){
            text = text + b2.getText();
            tf.setText(text);
        }
        if (a.getSource() == plus){
            x = Integer.parseInt(text);
            tf.setText(text + plus.getText());
            text = "";
            z = '+';
        }

        if (a.getSource() == umn){
            x = Integer.parseInt(text);
            tf.setText(text + umn.getText());
            text = "";
            z = '*';
        }
        if (a.getSource() == result){
            if (z == '+'){
                y = Integer.parseInt(text);
                tf.setText(String.valueOf(x+y));
            }
            else if (z == '*'){
                y = Integer.parseInt(text);
                tf.setText(String.valueOf(x * y));
            }
        }
    }
}
