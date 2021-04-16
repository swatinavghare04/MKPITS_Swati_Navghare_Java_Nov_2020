package src.com.mkpits.java.awtexamples;

import java.awt.*;

public class AwtByInheritanceCalculatorEx extends Frame {
    AwtByInheritanceCalculatorEx() {
        TextField tf1 = new TextField();
        tf1.setBounds(10, 30, 240, 25);
        add(tf1);
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("/");
        Button b5 = new Button("4");
        Button b6 = new Button("5");
        Button b7 = new Button("6");
        Button b8 = new Button("*");
        Button b9 = new Button("7");
        Button b10 = new Button("8");
        Button b11 = new Button("9");
        Button b12 = new Button("-");
        Button b13 = new Button("0");
        Button b14 = new Button(".");
        Button b15 = new Button("=");
        Button b16 = new Button("+");
        b1.setBounds(10, 50, 60, 30);
        add(b1);
        b2.setBounds(70, 50, 60, 30);
        add(b2);
        b3.setBounds(130, 50, 60, 30);
        add(b3);
        b4.setBounds(190, 50, 60, 30);
        add(b4);
        b5.setBounds(10, 80, 60, 30);
        add(b5);
        b6.setBounds(70, 80, 60, 30);
        add(b6);
        b7.setBounds(130, 80, 60, 30);
        add(b7);
        b8.setBounds(190, 80, 60, 30);
        add(b8);
        b9.setBounds(10, 110, 60, 30);
        add(b9);
        b10.setBounds(70, 110, 60, 30);
        add(b10);
        b11.setBounds(130, 110, 60, 30);
        add(b11);
        b12.setBounds(190, 110, 60, 30);
        add(b12);
        b13.setBounds(10, 140, 60, 30);
        add(b13);
        b14.setBounds(70, 140, 60, 30);
        add(b14);
        b15.setBounds(130, 140, 60, 30);
        add(b15);
        b16.setBounds(190, 140, 60, 30);
        add(b16);

        setSize(252, 178);
        setLayout(null);
        setTitle("Calculator");
        setVisible(true);
    }

    public static void main(String[] args) {
        AwtByInheritanceCalculatorEx a1 = new AwtByInheritanceCalculatorEx();
    }

}
