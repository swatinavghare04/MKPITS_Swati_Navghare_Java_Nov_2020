// WAP to demonstrate how to use search button.

package src.com.mkpits.java.jdbcexamples;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.*;

public class UseOfSearchButton extends JFrame{
        JRadioButton rb1,rb2;
        //JCheckBox cb1,cb2;
        ButtonGroup bg;
       // JComboBox city;
        JPasswordField pf1;
    UseOfSearchButton(){

        JLabel l14 = new JLabel("Registration Form");
        l14.setBounds(100,40,240,25);
        add(l14);

        JLabel l1 = new JLabel("username");
        l1.setBounds(10,80,240,25);
        add(l1);
        JTextField tf1 = new JTextField();
        tf1.setBounds(260,80,240,25);
        add(tf1);

        JLabel l2 = new JLabel("password");
        l2.setBounds(10,120,240,25);
        add(l2);
        pf1 = new JPasswordField();
        pf1.setBounds(260,120,240,25);
        add(pf1);

        JLabel l3 = new JLabel("gender");
        l3.setBounds(10,160,240,25);
        add(l3);
        rb1 = new JRadioButton("Male");
        rb1.setBounds(260,160,100,25);
        add(rb1);
        rb2 = new JRadioButton("Female");
        rb2.setBounds(400,160,100,25);
        add(rb2);
        bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        JLabel l21 = new JLabel("Status");
        l21.setBounds(10,400,240,25);
        add(l21);

        JButton b1 = new JButton("Register");
        b1.setBounds(100,360,80,20);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        add(b1);

        JButton s1 =  new JButton("Search");
        s1.setBounds(510,80,100,25);
        s1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String un = tf1.getText();
                Connection connect = null;
                Statement st = null;
                String str = null;
                try{
                    Class.forName("org.postgresql.Driver");
                    connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432:/mkpits01","postgres","sa");
                    st = connect.createStatement();
                    String sql = "select * from register where username = '"+ un +"'";
                    ResultSet rs = st.executeQuery(sql);
                    while(rs.next()){
                        pf1.setText(rs.getString("pwd"));
                        String g = rs.getString("gender");
                        if(g.equals("Male"))
                            rb1.setSelected(true);
                        else if(g.equals("Female"))
                            rb2.setSelected(true);
                    }
                    rs.close();
                    st.close();
                    connect.close();

                }catch(Exception ee){
                    str = ee.toString();

                }
                finally {
                }
            }
        });

        add(s1);

        setSize(700,500);
        setTitle("Mkpits");
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args){

        UseOfSearchButton sb = new UseOfSearchButton();
    }
}
