// WAP in java to demonstrate how to make a registration form using AWT.

package com.mkpits.java.awtexamples;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm extends Frame{
    Label l1,l2,l3,l4,l5;
    TextField tf;
    Button b1;

    RegistrationForm(){
        l1 = new Label("Register Yourself");
        l1.setBounds(150,50,100,50);
        add(l1);

        l2 = new Label("Your Name");
        l2.setBounds(10,120,100,30);
        add(l2);

        tf = new TextField();
        tf.setBounds(130,120,100,30);
        add(tf);

        l3 = new Label("Course Selected");
        l3.setBounds(10,170,100,50);
        add(l3);

        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox checkbox1  = new Checkbox("C++",cbg,false);
        checkbox1.setBounds(130,170,50,50);

        Checkbox checkbox2 = new Checkbox("Java",cbg,true);
        checkbox2.setBounds(180,170,50,50);
        add(checkbox1);
        add(checkbox2);

        l4 = new Label("Select Gender");
        l4.setBounds(10,210,100,50);
        add(l4);

        CheckboxGroup cbg1 = new CheckboxGroup();
        Checkbox checkbox11  = new Checkbox("Male",cbg1,false);
        checkbox11.setBounds(120,210,50,50);

        Checkbox checkbox22 = new Checkbox("Female",cbg1,true);
        checkbox22.setBounds(180,210,60,50);
        add(checkbox11);
        add(checkbox22);

        l5 = new Label("Select City");
        l5.setBounds(10,260,100,20);
        add(l5);

        Choice c = new Choice();
        c.setBounds(130,260,100,75);
        c.add("Nagpur");
        c.add("Amravati");
        c.add("Pune");
        add(c);

        Label l6 = new Label("Name :");
        l6.setBounds(10,390,200,30);
        add(l6);

        Label l7 = new Label("Course Selected :");
        l7.setBounds(10,430,200,30);
        add(l7);

        Label l8 = new Label("Gender :");
        l8.setBounds(10,470,200,30);
        add(l8);

        Label l9 = new Label("City :");
        l9.setBounds(10,510,200,30);
        add(l9);

        b1 = new Button("Click me");
        b1.setBounds(100,330,100,50);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l6.setText("Name :" + tf.getText());
                StringBuilder sb = new StringBuilder();
                sb.append("Course Selected :");
                if(checkbox1.getState()==true){
                    sb.append("C++");
                }
                if(checkbox2.getState()==true){
                    sb.append("Java");
                }
                l7.setText(sb.toString());

                StringBuilder sb1 = new StringBuilder();
                  sb1.append("Gender :");
                if(checkbox11.getState()==true){
                    sb1.append("Male");
                }
                if (checkbox22.getState()==true){
                    sb1.append("Female");
                }
                l8.setText(sb1.toString());
                l9.setText("City :" + c.getItem(c.getSelectedIndex()));
            }
        });
        add(b1);

        setSize(400,600);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args){
        new RegistrationForm();
    }
}
