package src.com.mkpits.java.awtexamples;

import java.awt.*;

public class AwtByInheritanceEx2 extends Frame {
    AwtByInheritanceEx2() {
        TextField tf = new TextField();
        tf.setBounds(10, 40, 240, 25);
        add(tf);
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        b1.setBounds(10, 50, 80, 50);
        add(b1);
        b2.setBounds(90, 50, 80, 50);
        add(b2);
        b3.setBounds(170, 50, 80, 50);
        add(b3);
        setSize(300, 200);
        setTitle("Calculator");
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        AwtByInheritanceEx2 fr = new AwtByInheritanceEx2();
    }
}
