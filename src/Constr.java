import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Constr extends NeizmenniePolia implements ActionListener {

    public Constr(){

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
        b1.addActionListener(new Perform(b1, b2, tf, text, c, plus, umn, result, x, y, z));

        frame.add(b2);
        b2.setLocation(100, 200);
        b2.setFont(font);
        b2.setVisible(true);
        b2.setSize(width, hight);
        b2.addActionListener(new Perform(b1, b2, tf, text, c, plus, umn, result, x, y, z));

        frame.add(c);
        c.setLocation(250, 200);
        c.setFont(font);
        c.setVisible(true);
        c.setSize(width, hight);
        c.addActionListener(new Perform(b1, b2, tf, text, c, plus, umn, result, x, y, z));

        frame.add(plus);
        plus.setLocation(100, 300);
        plus.setFont(font);
        plus.setVisible(true);
        plus.setSize(width, hight);
        plus.addActionListener(new Perform(b1, b2, tf, text, c, plus, umn, result, x, y, z));

        frame.add(umn);
        umn.setLocation(180, 300);
        umn.setFont(font);
        umn.setVisible(true);
        umn.setSize(width, hight);
        umn.addActionListener(new Perform(b1, b2, tf, text, c, plus, umn, result, x, y, z));

        frame.add(result);
        result.setLocation(40, 300);
        result.setFont(font);
        result.setVisible(true);
        result.setSize(width, hight);
        result.addActionListener(new Perform(b1, b2, tf, text, c, plus, umn, result, x, y, z));//
//если вместо this пишу (new Perform()) ошибки не выдает, но троит если запускаю через него
        //
        //
        //
        //
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

//    @Override
//    public void actionPerformed(ActionEvent a) {
//        if (a.getSource() == b1){
//            text = text + b1.getText();
//            tf.setText(text);
//        }
//        if (a.getSource() == c){
//            text = "";
//            tf.setText(text);
//        }
//        if (a.getSource() == b2){
//            text = text + b2.getText();
//            tf.setText(text);
//        }
//        if (a.getSource() == plus){
//            x = Integer.parseInt(text);
//            tf.setText(text + plus.getText());
//            text = "";
//            z = '+';
//        }
//
//        if (a.getSource() == umn){
//            x = Integer.parseInt(text);
//            tf.setText(text + umn.getText());
//            text = "";
//            z = '*';
//        }
//        if (a.getSource() == result){
//            if (z == '+'){
//                y = Integer.parseInt(text);
//                tf.setText(String.valueOf(x+y));
//            }
//            else if (z == '*'){
//                y = Integer.parseInt(text);
//                tf.setText(String.valueOf(x * y));
//            }
//        }
//    }
}
