// WAP in java of event handling by annonymous class.

package src.com.mkpits.java.awtexamples;

import java.awt.*;
import java.awt.event.*;

public class EventHandlingByAnnonymousClass extends Frame {
    TextField tf2;

    EventHandlingByAnnonymousClass() {
        tf2 = new TextField();
        tf2.setBounds(30, 50, 170, 40);

        Button b = new Button("Click me");
        b.setBounds(40, 100, 80, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf2.setText("Hello");
            }
        });

        add(b);
        add(tf2);
        setSize(280, 280);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new EventHandlingByAnnonymousClass();
    }
}
