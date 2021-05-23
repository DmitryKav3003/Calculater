import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcTest {

    public static void main(String[] args) {
        CalcTest calcTest = new CalcTest();
        calcTest.go();
    }
    public void go(){

//Задаю размеры фрэйма и ее положение
        JFrame frame = new JFrame("Калькулятор");
        frame.setSize(300, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false); //делаем размеры окна неизменными
        frame.setLocationRelativeTo(null);

//Создаю панель и три пустых поля
        JPanel panelinput = new JPanel();
        frame.getContentPane().add(BorderLayout.NORTH, panelinput);
        panelinput.setBackground(Color.green);
        JTextField chislo1 = new JTextField("", 5);
        panelinput.add(BorderLayout.EAST, chislo1);
        JTextField chislo2 = new JTextField("", 5);
        panelinput.add(BorderLayout.WEST, chislo2);
        JTextField result = new JTextField("", 10);
        panelinput.add(BorderLayout.SOUTH, result);

//Создаю 4 кнопки и вставляю их в отдельную панель с расположением внизу
        JButton minus = new JButton("-");
        JButton plus = new JButton("+");
        JButton umnozh = new JButton("*");
        JButton delitel = new JButton("/");
        JButton deliteResult = new JButton("deliteResult");
        JPanel panelButtons = new JPanel();
        panelButtons.setBackground(Color.yellow);
        panelButtons.add(minus);
        panelButtons.add(plus);
        panelButtons.add(umnozh);
        panelButtons.add(delitel);
        panelButtons.add(deliteResult);
        frame.getContentPane().add(BorderLayout.SOUTH, panelButtons);

//Скармливаю кнопкам команду
        minus.addActionListener(new Min(chislo1, chislo2, result));
        plus.addActionListener(new Plu(chislo1, chislo2, result));
        umnozh.addActionListener(new Umn(chislo1, chislo2, result));
        delitel.addActionListener(new Del(chislo1, chislo2, result));
        deliteResult.addActionListener(new DeliteResult(chislo1, chislo2, result));

//Создаю панель с цифрами и добавля. ее во фрэйм
        JPanel cifriVse = new JPanel();
        JButton cifra1 = new JButton("1");
        JButton cifra4 = new JButton("4");
        JButton cifra7 = new JButton("7");
        JButton cifra2 = new JButton("2");
        JButton cifra5 = new JButton("5");
        JButton cifra8 = new JButton("8");
        JButton cifra0 = new JButton("0");
        JButton cifra3 = new JButton("3");
        JButton cifra6 = new JButton("6");
        JButton cifra9 = new JButton("9");
        cifriVse.add(cifra1);
        cifriVse.add(cifra2);
        cifriVse.add(cifra3);
        cifriVse.add(cifra4);
        cifriVse.add(cifra5);
        cifriVse.add(cifra6);
        cifriVse.add(cifra7);
        cifriVse.add(cifra8);
        cifriVse.add(cifra9);
        cifriVse.add(cifra0);
        frame.add(cifriVse);

//Желаемого расположения кнопок добился путем увеличения шрифта, по другому не получилось, так хоть смотриться
        Font font = new Font("", Font.BOLD, 60);
        cifra0.setFont(font);
        cifra1.setFont(font);
        cifra2.setFont(font);
        cifra3.setFont(font);
        cifra4.setFont(font);
        cifra5.setFont(font);
        cifra6.setFont(font);
        cifra7.setFont(font);
        cifra8.setFont(font);
        cifra9.setFont(font);





//класс Znachenie - попытка попытка заставить поля реагировать на кнопки вводом нажатия на цифры
//попытка провальная(((
        cifra1.addActionListener(new Znachenie(cifra1, chislo1, chislo2));
    }

    class Znachenie implements ActionListener{
        JButton cifra1;
        JTextField chislo1;
        JTextField chislo2;
        Znachenie(JButton cifra1, JTextField chislo1, JTextField chislo2){
            this.cifra1 = cifra1;
            this.chislo1 = chislo1;
            this.chislo2 = chislo2;
        }
        public void actionPerformed(ActionEvent a){
            if (a.getSource() == cifra1) chislo1.setText("1");
            else if (a.getSource() == cifra1) chislo2.setText("1");
        }
    }



    //Ниже задаю кнопкам команду, пришлось в каждый класс добавлять констуктор, чтобы класс видел кнопки
//было бы здорого иметь один общий конструктор, вот можно ли...
    class Min implements ActionListener{

        JTextField chislo1;
        JTextField chislo2;
        JTextField result;

        Min(JTextField chislo1, JTextField chislo2, JTextField result){
            this.chislo1 = chislo1;
            this.chislo2 = chislo2;
            this.result = result;
        }

        public void actionPerformed(ActionEvent event){
            float a = Float.parseFloat(chislo1.getText());
            float b = Float.parseFloat(chislo2.getText());
            result.setText(String.valueOf(a - b));
        }
    }
    class Plu implements ActionListener{

        JTextField chislo1;
        JTextField chislo2;
        JTextField result;

        Plu(JTextField chislo1, JTextField chislo2, JTextField result){
            this.chislo1 = chislo1;
            this.chislo2 = chislo2;
            this.result = result;
        }

        public void actionPerformed(ActionEvent event){
            float a = Float.parseFloat(chislo1.getText());
            float b = Float.parseFloat(chislo2.getText());
            result.setText(String.valueOf(a + b));
        }
    }
    class Umn implements ActionListener{

        JTextField chislo1;
        JTextField chislo2;
        JTextField result;

        Umn(JTextField chislo1, JTextField chislo2, JTextField result){
            this.chislo1 = chislo1;
            this.chislo2 = chislo2;
            this.result = result;
        }

        public void actionPerformed(ActionEvent event){
            float a = Float.parseFloat(chislo1.getText());
            float b = Float.parseFloat(chislo2.getText());
            result.setText(String.valueOf(a * b));
        }
    }
    class Del implements ActionListener{

        JTextField chislo1;
        JTextField chislo2;
        JTextField result;

        Del(JTextField chislo1, JTextField chislo2, JTextField result){
            this.chislo1 = chislo1;
            this.chislo2 = chislo2;
            this.result = result;
        }

        public void actionPerformed(ActionEvent event){
            float a = Float.parseFloat(chislo1.getText());
            float b = Float.parseFloat(chislo2.getText());
            result.setText(String.valueOf(a / b));
        }
    }
    class DeliteResult implements ActionListener{
        JTextField chislo1;
        JTextField chislo2;
        JTextField result;

        DeliteResult(JTextField chislo1, JTextField chislo2, JTextField result){
            this.chislo1 = chislo1;
            this.chislo2 = chislo2;
            this.result = result;
        }
        public void actionPerformed(ActionEvent e){
            chislo1.setText("");
            chislo2.setText("");
            result.setText("");

        }
    }
}