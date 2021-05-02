package src.com.mkpits.java.awtexamples;

import java.awt.*;
import java.awt.event.*;

public class EventHandlingByAnnonymousClassEx1 extends Frame {
    TextField tf3;

    EventHandlingByAnnonymousClassEx1() {
        tf3 = new TextField();
        tf3.setBounds(20, 40, 170, 40);

        Button b = new Button("Click me");
        b.setBounds(40, 80, 60, 30);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf3.setText("Hello Swati");
            }
        });

        Button b1 = new Button("Clear");
        b1.setBounds(120, 80, 60, 30);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf3.setText(" ");
            }
        });
        add(tf3);
        add(b);
        add(b1);

        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new EventHandlingByAnnonymousClassEx1();
    }
}
