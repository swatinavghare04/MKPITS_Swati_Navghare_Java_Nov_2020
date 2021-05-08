// WAP for registration form by creating another register class.

package src.com.mkpits.java.jdbcexamples;

import javafx.stage.WindowEvent;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class Registerclass {
    private String username, password, gender, course, city;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    public void setgender(String gender) {
        this.gender = gender;
    }

    public void setcourse(String course) {
        this.course = course;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String saveregister() {

        Connection c = null;
        Statement st = null;

        String str = null;

        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mkpits01", "postgres", "sa");
            st = c.createStatement();

            String sql = "insert into register01(username,password,gender,course,city) values('" + username + "','" + password + "','" + gender + "','" + course + "','" + city + "')";
            st.executeUpdate(sql);
            str = "registered Successfully";
            st.close();
            c.close();
        } catch (Exception e) {
            str = e.toString();
        } finally {
        }
        return str;
    }

}

public class JdbcExOfRegisterFormByCreatingRegisterClass extends JFrame {

    JRadioButton rb1,rb2;
    ButtonGroup bg;
    JCheckBox cb1,cb2;
    JComboBox city;

    JdbcExOfRegisterFormByCreatingRegisterClass()
    {

        JLabel l14 = new JLabel("Register Form");
        l14.setBounds(100,40,240,25);
        add(l14);

        JLabel l1= new JLabel("username");
        l1.setBounds(10,80,240,25);
        add(l1);
        JTextField t1 = new JTextField();
        t1.setBounds(260,80,240,25);
        add(t1);

        JLabel l2 = new JLabel("password");
        l2.setBounds(10,120,240,25);
        add(l2);
        JPasswordField t2 = new JPasswordField();
        t2.setBounds(260,120,240,25);
        add(t2);

        JLabel lg = new JLabel("gender");
        lg.setBounds(10,160,240,25);
        add(lg);

        rb1 = new JRadioButton("Male");
        rb1.setBounds(260,160,100,25);
        add(rb1);
        rb2 = new JRadioButton("Female");
        rb2.setBounds(400,160,100,25);
        add(rb2);

        bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        JLabel lc = new JLabel("Course");
        lc.setBounds(10,200,240,25);
        add(lc);

        cb1 = new JCheckBox("Java");
        cb1.setBounds(260,200,100,25);
        add(cb1);
        cb2 = new JCheckBox("Sql");
        cb2.setBounds(400,200,100,25);
        add(cb2);

        JLabel lct = new JLabel("City");
        lct.setBounds(10,240,240,25);
        add(lct);
        String[] ct = {"Nagpur","Mumbai","Pune"};
        city = new JComboBox(ct);
        city.setBounds(260,240,100,25);
        add(city);

        JLabel l21 = new JLabel("status");
        l21.setBounds(10,400,240,25);
        add(l21);

        JButton b1 = new JButton("register");
        b1.setBounds(100,360,80,20);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Registerclass register01 = new Registerclass();
                register01.setUsername(t1.getText());
                register01.setpassword(t2.getText());
                String g = null;
                if(rb1.isSelected())
                    register01.setgender("Male");
                else if(rb2.isSelected())
                    register01.setgender("Female");

                String course = null;
                if(cb1.isSelected())
                    course = "Java";
                else if(cb2.isSelected())
                    course = course + "Sql";
                register01.setcourse(course);
                String city1 = city.getSelectedItem().toString();
                register01.setCity(city1);

                String result = register01.saveregister();
                l21.setText(result);
                t1.setText("");
                t2.setText("");

            }
        });
        add(b1);
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
    public static void main(String[] args){

        new JdbcExOfRegisterFormByCreatingRegisterClass();
    }
}