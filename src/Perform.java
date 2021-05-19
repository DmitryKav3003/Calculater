import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//
//
//Этот класс не работает, если переношу весь экшнперформед сюда, то он начинает троить
//поэтому данные действия пришлось оставить в классе Constr
//

public class Perform extends Constr implements ActionListener {
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
