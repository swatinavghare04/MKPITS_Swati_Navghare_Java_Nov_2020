// program on get  and set method of arraylist using Swing.

package src.com.mkpits.java.collection;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.ArrayList;

public class GetAndSetMethodUseSwingEx02 extends JFrame{
    JLabel l1, l2;
    JTextField t1, t2;
    JTextArea ta;
    JButton b1, b2, b3, b4;
    ArrayList<String> plist = new ArrayList<String>();

    GetAndSetMethodUseSwingEx02() {
        l1 = new JLabel("enter product name : ");
        l1.setBounds(10, 50, 200, 30);
        add(l1);
        t1 = new JTextField();
        t1.setBounds(220, 50, 200, 30);
        add(t1);
        b1 = new JButton("Add Product");
        b1.setBounds(100, 150, 150, 30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                plist.add(t1.getText());
                t1.setText("");
            }
        });
        add(b1);
        b2 = new JButton("Display Product");
        b2.setBounds(260, 150, 150, 30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb = new StringBuilder();
                for (String str : plist) {
                    sb.append("Product name :" + str + "\n");
                }
                ta.setText(sb.toString());
            }
        });
        add(b2);
        ta = new JTextArea("Product List");
        ta.setBounds(100, 200, 300, 150);
        add(ta);

        l2 = new JLabel("Enter index number to view ");
        l2.setBounds(10, 360, 200, 30);
        add(l2);
        t2 = new JTextField();
        t2.setBounds(220, 360, 200, 30);
        add(t2);
        b3 = new JButton("get Method");
        b3.setBounds(100, 400, 150, 30);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res = plist.get(Integer.parseInt(t2.getText()));
                ta.setText("Product name at index " + t2.getText() + ":" + res);
            }
        });
        add(b3);

        b4 = new JButton("set Method");
        b4.setBounds(260, 400, 150, 30);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                plist.set(Integer.parseInt(t2.getText()), t1.getText());
            }
        });
        add(b4);

        setLayout(null);
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GetAndSetMethodUseSwingEx02();
    }
}
