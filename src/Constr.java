import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Constr extends NeizmenniePolia implements ActionListener {
    public static void main(String[] args) {
        Constr constr = new Constr();
    }

    public Constr(){

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b1){
                    text = text + b1.getText();
                    tf.setText(text);
                }
            }
        });



        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b2){
                    text = text + b2.getText();
                    tf.setText(text);
                }
            }
        });


        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == c){
                    text = "";
                    tf.setText(text);
                }
            }
        });


        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == plus){
                    x = Integer.parseInt(text);
                    tf.setText(text + plus.getText());
                    text = "";
                    z = '+';
                }
            }
        });


        umn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == umn){
                    x = Integer.parseInt(text);
                    tf.setText(text + umn.getText());
                    text = "";
                    z = '*';
                }
            }
        });


        result.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == result){
                    if (z == '+'){
                        y = Integer.parseInt(text);
                        resultat = String.valueOf(x+y);
                        tf.setText(resultat);
                    }
                    else if (z == '*'){
                        y = Integer.parseInt(text);
                        resultat = String.valueOf(x*y);
                        tf.setText(resultat);
                    }
                }
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
