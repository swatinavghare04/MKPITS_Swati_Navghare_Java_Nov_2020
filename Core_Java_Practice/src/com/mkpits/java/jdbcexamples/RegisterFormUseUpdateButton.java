// WAP to demonstrate how to use update button.

package src.com.mkpits.java.jdbcexamples;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class RegisterFormUseUpdateButton extends JFrame{
    JRadioButton rb1,rb2;
    JCheckBox cb1,cb2;
    ButtonGroup bg;
    //JComboBox city;
    JPasswordField t2;

    RegisterFormUseUpdateButton() {
       JLabel l14 = new JLabel("Registration Form");
       l14.setBounds(100,40,240,25);
       add(l14);

       JLabel l1 = new JLabel("username");
       l1.setBounds(10,80,240,25);
       add(l1);
       JTextField t1 = new JTextField();
       t1.setBounds(260,80,240,25);
       add(t1);

        JLabel l2 = new JLabel("password");
        l2.setBounds(10,120,240,25);
        add(l2);
        t2 = new JPasswordField();
        t2.setBounds(260,120,240,25);
        add(t2);

        JLabel l3 = new JLabel("gender");
        l3.setBounds(10,160,240,25);
        add(l3);
        rb1 = new JRadioButton("Male");
        rb1.setBounds(260,160,240,25);
        add(rb1);
        rb2 = new JRadioButton("Female");
        rb2.setBounds(400,160,240,25);
        add(rb2);
        bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        JLabel lc = new JLabel("course");
        lc.setBounds(10,200,240,25);
        add(lc);
        cb1 = new JCheckBox("Java");
        cb1.setBounds(260,200,100,25);
        add(cb1);
        cb2 = new JCheckBox("Sql");
        cb2.setBounds(400,200,100,25);
        add(cb2);

        JLabel l21 = new JLabel("Status");
        l21.setBounds(10,400,240,25);
        add(l21);

        JButton b1 = new JButton("register");
        b1.setBounds(100,360,80,20);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        add(b1);

        JButton ub = new JButton("update");
        ub.setBounds(200,360,80,20);
        ub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String u = t1.getText();
                String p = t2.getText();
                String g = null;
                if(rb1.isSelected())
                    g="male";
                else if (rb2.isSelected())
                    g="female";
//System.out.println("gender " +g);
                String course=null;
                if(cb1.isSelected())
                    course="java";
                if (cb2.isSelected())
                    course = course + " mysql";

                //   register.setcourse(course);
                //String city1=city.getSelectedItem().toString();

                Connection con=null;
                Statement st=null;
                String str=null;
                try {
                    Class.forName("org.postgresql.Driver");
                    con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mkpits01", "postgres", "sa");
                    //System.out.println("connected");
                    st = con.createStatement();

                    String sql = "update register01 set password='"+p+"',gender='"+g+"',course='"+course+"' where username='"+u+"'"   ;
                    st.executeUpdate(sql);
                    l21.setText("updated");
                    st.close();
                    con.close();
                }catch ( Exception ee)
                {
                    str=ee.toString();
                }
                finally {

                }
            }
        });
        add(ub);

        setSize(700,500);
        setTitle("mkpits");
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
    }
    public  static  void main(String[] arg)
    {
        RegisterFormUseUpdateButton f=new RegisterFormUseUpdateButton();
    }
}

