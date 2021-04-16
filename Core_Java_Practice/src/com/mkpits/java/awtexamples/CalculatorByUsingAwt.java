// WAP in java for calculator using AWT.

package src.com.mkpits.java.awtexamples;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorByUsingAwt extends Frame implements ActionListener {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18;
    TextField t1;
    double pn = 0;
    double curno = 0;

    CalculatorByUsingAwt() {
        t1 = new TextField();
        t1.setBounds(10, 30, 240, 30);
        add(t1);
        b1 = new Button("1");
        b1.setBounds(10, 50, 80, 50);
        add(b1);
        b1.addActionListener(this);
        b2 = new Button("2");
        b2.setBounds(90, 50, 80, 50);
        add(b2);
        b2.addActionListener(this);
        b3 = new Button("3");
        b3.setBounds(170, 50, 80, 50);
        add(b3);
        b3.addActionListener(this);
        b4 = new Button("4");
        b4.setBounds(10, 100, 80, 50);
        add(b4);
        b4.addActionListener(this);
        b5 = new Button("5");
        b5.setBounds(90, 100, 80, 50);
        add(b5);
        b5.addActionListener(this);
        b6 = new Button("6");
        b6.setBounds(170, 100, 80, 50);
        add(b6);
        b6.addActionListener(this);
        b7 = new Button("7");
        b7.setBounds(10, 150, 80, 50);
        add(b7);
        b7.addActionListener(this);
        b8 = new Button("8");
        b8.setBounds(90, 150, 80, 50);
        add(b8);
        b8.addActionListener(this);
        b9 = new Button("9");
        b9.setBounds(170, 150, 80, 50);
        add(b9);
        b9.addActionListener(this);
        b10 = new Button("0");
        b10.setBounds(10, 200, 80, 50);
        add(b10);
        b10.addActionListener(this);
        b11 = new Button(".");
        b11.setBounds(90, 200, 80, 50);
        add(b11);
        b11.addActionListener(this);
        b12 = new Button("=");
        b12.setBounds(170, 200, 80, 50);
        add(b12);
        b12.addActionListener(this);
        b13 = new Button("+");
        b13.setBounds(10, 250, 80, 50);
        add(b13);
        b13.addActionListener(this);
        b14 = new Button("-");
        b14.setBounds(90, 250, 80, 50);
        add(b14);
        b14.addActionListener(this);
        b15 = new Button("*");
        b15.setBounds(170, 250, 80, 50);
        add(b15);
        b15.addActionListener(this);
        b16 = new Button("/");
        b16.setBounds(10, 300, 80, 50);
        add(b16);
        b16.addActionListener(this);
        b17 = new Button("%");
        b17.setBounds(90, 300, 80, 50);
        add(b17);
        b17.addActionListener(this);
        b18 = new Button("<-");
        b18.setBounds(170, 300, 80, 50);
        add(b18);
        b18.addActionListener(this);
        setSize(260, 350);
        setTitle("Calculator");
        setLayout(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {
            String str1 = t1.getText();
            if (str1.equals("+") || str1.equals("-") || str1.equals("*")) {
                t1.setText("");
                t1.setText("1");
            } else {
                t1.setText(str1 + "1");
            }
        }
        if (ae.getSource() == b2) {
            String str1 = t1.getText();
            t1.setText(str1 + "2");
        }
        if (ae.getSource() == b3) {
            String str1 = t1.getText();
            t1.setText(str1 + "3");
        }
        if (ae.getSource() == b4) {
            t1.setText("4");
        }
        if (ae.getSource() == b5) {
            t1.setText("5");
        }
        if (ae.getSource() == b6) {
            t1.setText("6");
        }
        if (ae.getSource() == b7) {
            t1.setText("7");
        }
        if (ae.getSource() == b8) {
            t1.setText("8");
        }
        if (ae.getSource() == b9) {
            t1.setText("9");
        }
        if (ae.getSource() == b10) {
            t1.setText("0");
        }
        if (ae.getSource() == b11) {
            t1.setText(".");
        }
        if (ae.getSource() == b12) {
            String str1 = t1.getText();
            curno = Double.parseDouble(str1);
            curno = pn + curno;
            t1.setText(String.valueOf(curno));
        }
        if (ae.getSource() == b13) {

            String str1 = t1.getText();
            double fn = Double.parseDouble(str1);
            pn = fn;
            t1.setText("");
            t1.setText("+");
        }
        if (ae.getSource() == b14) {
            String str1 = t1.getText();
            double fn = Double.parseDouble(str1);
            t1.setText(String.valueOf(fn - fn));
        }
        if (ae.getSource() == b15) {
            String str1 = t1.getText();
            double fn = Double.parseDouble(str1);
            t1.setText(String.valueOf(fn * fn));
        }
        if (ae.getSource() == b16) {
            String str1 = t1.getText();
            double fn = Double.parseDouble(str1);
            t1.setText(String.valueOf(fn / fn));
        }
        if (ae.getSource() == b17) {
            String str1 = t1.getText();
            double fn = Double.parseDouble(str1);
            t1.setText(String.valueOf(fn % fn));
        }
        if (ae.getSource() == b18) {
            t1.setText(" ");
        }
    }

    public static void main(String[] args) {
        new CalculatorByUsingAwt();
    }

}
