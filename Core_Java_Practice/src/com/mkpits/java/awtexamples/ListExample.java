package com.mkpits.java.awtexamples;

import java.awt.*;
import java.awt.event.*;

public class ListExample extends Frame {

    ListExample() {
        final Label label = new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(500,100);

        Button b = new Button("Show");
        b.setBounds(200,150,80,30);

        final  List l1 = new List(4,false);
        l1.setBounds(100,100,70,70);
        l1.add("C");
        l1.add("C++");
        l1.add("Java");
        l1.add("PHP");

        final List l2 = new List(4,false);
        l2.setBounds(100,200,70,70);
        l2.add("Spring");
        l2.add("Hibernate");
        l2.add(".Net");
        l2.add("CodeIgniter");

        add(label);
        add(b);
        add(l1);
        add(l2);

        setSize(450,450);
        setLayout(null);
        setVisible(true);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = "Programming language selected :" + l1.getItem(l1.getSelectedIndex());
                data += ",Framework Selected :";
                for (String Frame : l2.getSelectedItems()){
                    data += Frame + ".";
                }
                label.setText(data);
            }
        });

    }
    public static void main(String[] args){
        new ListExample();
    }

}
