// WAP in java of event handling by outer class.

package src.com.mkpits.java.awtexamples;

import java.awt.*;
import java.awt.event.*;

class Outer implements ActionListener {
    EventHandlingByOuterClass obj;

    Outer(EventHandlingByOuterClass obj) {
        this.obj = obj;
    }

    public void actionPerformed(ActionEvent e) {
        obj.tf1.setText("Welcome");
    }

}

public class EventHandlingByOuterClass extends Frame {
    TextField tf1;

    EventHandlingByOuterClass() {
        tf1 = new TextField();
        tf1.setBounds(20, 50, 170, 20);

        Button b = new Button("CLick me");
        b.setBounds(40, 120, 80, 30);

        Outer out = new Outer(this);
        b.addActionListener(out); // Passing outer class instance

        add(tf1);
        add(b);

        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        EventHandlingByOuterClass ev = new EventHandlingByOuterClass();
    }
}


