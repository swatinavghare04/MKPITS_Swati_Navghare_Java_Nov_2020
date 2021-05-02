// program to accept 2 no. from the user and display the additon of 2 no.

import java.awt.*;
import java.awt.event.*;

public class DisplayAdditionOfTwoNum extends Frame {
    DisplayAdditionOfTwoNum() {
        Label l1 = new Label("num1");
        l1.setBounds(10, 40, 240, 25);
        add(l1);

        TextField tf = new TextField();
        tf.setBounds(260, 40, 240, 25);
        add(tf);

        Label l2 = new Label("num2");
        l2.setBounds(10, 70, 240, 25);
        add(l2);

        TextField tf1 = new TextField();
        tf1.setBounds(260, 70, 240, 25);
        add(tf1);

        Label l3 = new Label("res");
        l3.setBounds(10, 130, 240, 25);
        add(l3);

        TextField tf2 = new TextField();
        tf2.setBounds(260, 130, 240, 25);
        add(tf2);

        Button b = new Button("Addition");
        b.setBounds(100, 100, 80, 20);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str1 = tf.getText();
                double fn = Double.parseDouble(str1);
                double sn = Double.parseDouble(tf1.getText());
                tf2.setText("sum is" + (fn + sn));
            }
        });
        add(b);

        setSize(500, 500);
        setTitle("Calculator");
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new DisplayAdditionOfTwoNum();
    }

}
