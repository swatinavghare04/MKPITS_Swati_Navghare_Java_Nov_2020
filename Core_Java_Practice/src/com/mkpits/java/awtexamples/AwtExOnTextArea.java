// WAP in java using AWT to demonstrate example on Text Area.

package src.com.mkpits.java.awtexamples;

import java.awt.*;

public class AwtExOnTextArea extends Frame {

    AwtExOnTextArea() {
        TextArea area = new TextArea("welcome to java");
        area.setBounds(10, 30, 300, 300);
        add(area);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {

        new AwtExOnTextArea();

    }
}
