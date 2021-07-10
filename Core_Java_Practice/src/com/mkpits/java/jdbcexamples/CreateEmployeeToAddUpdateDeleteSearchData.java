// WAP to demonstrate example, how to add, update, delete and search data from the table.

package com.mkpits.java.jdbcexamples;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class CreateEmployeeToAddUpdateDeleteSearchData extends JFrame{

    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3;
    JButton b1,b2,b3;

    Connection con = null;
    Statement stmt = null;

    Employee e1 = null;

    public CreateEmployeeToAddUpdateDeleteSearchData(){
        e1 = new Employee();

        l1 = new JLabel("empid");
        l1.setBounds(20,50,200,20);
        add(l1);
        t1 = new JTextField();
        t1.setBounds(230,50,200,20);
        add(t1);

        l2 = new JLabel("empname");
        l2.setBounds(20,100,200,20);
        add(l2);
        t2 = new JTextField();
        t2.setBounds(230,100,200,20);
        add(t2);

        l3 = new JLabel("empaddress");
        l3.setBounds(20,150,200,20);
        add(l3);
        t3 = new JTextField();
        t3.setBounds(230,150,200,20);
        add(t3);

        b1 = new JButton("Save");
        b1.setBounds(100,250,100,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                String result = e1.addEmployee(Integer.parseInt(t1.getText()), t2.getText(), t3.getText());
                l4.setText(result);
                t1.setText("");
                t2.setText("");
                t3.setText("");
            } catch(Exception ee){
                     l4.setText(ee.toString());
                }
            }
        });
        add(b1);

        b2 = new JButton("Update");
        b2.setBounds(220,250,100,30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String result = e1.updateEmployee(Integer.parseInt(t1.getText()), t2.getText(), t3.getText());
                    l4.setText(result);
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                } catch(Exception ee){
                    l4.setText(ee.toString());
                }
            }
        });
        add(b2);

        b3 = new JButton("Delete");
        b3.setBounds(330,250,100,30);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String result = e1.removeEmployee(Integer.parseInt(t1.getText()));
                    l4.setText(result);
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");

                }catch(Exception ee){
                    l4.setText(ee.toString());
                }
            }
        });
        add(b3);

        JButton b4 = new JButton("Search");
        b4.setBounds(450,50,100,30);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String r = e1.searchEmployee(Integer.parseInt(t1.getText()));

                    t2.setText(e1.empname);
                    t3.setText(e1.empaddress);
                    l4.setText(r);
                } catch(Exception ee){
                    l4.setText(ee.toString());
                }
            }
        });
        add(b4);


        l4 = new JLabel("status");
        l4.setBounds(10,300,100,30);
        add(l4);

        setTitle("Employee Entry Form");
        setLayout(null);
        setSize(700,500);
        setVisible(true);
    }
    public static void main(String[] args){
        new CreateEmployeeToAddUpdateDeleteSearchData();
    }
}
