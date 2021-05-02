// WAP to create student registration form using swing.

package src.com.mkpits.java.jdbcexamples;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class JdbcExOnStudentRegistrationForm extends JFrame{

    JRadioButton rb1,rb2;
    ButtonGroup bg;
    JCheckBox cb1,cb2,cb3,cb4;
    JComboBox city;

    JdbcExOnStudentRegistrationForm(){

        JLabel l4 = new JLabel("Student Register Form");
        l4.setBounds(100,40,240,25);
        add(l4);

        JLabel l1 = new JLabel("studentname");
        l1.setBounds(10,80,240,25);
        add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(260,80,240,25);
        add(t1);

        JLabel l2 = new JLabel("address");
        l2.setBounds(10,120,240,25);
        add(l2);

        JTextField t2 = new JTextField();
        t2.setBounds(260,120,240,25);
        add(t2);

        JLabel lg = new JLabel("gender");
        lg.setBounds(10,160,240,25);
        add(lg);

        rb1 = new JRadioButton("Male");
        rb1.setBounds(260,160,100,25);
        add(rb1);
        rb2 = new JRadioButton("female");
        rb2.setBounds(400,160,100,25);
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

        JLabel lh = new JLabel("hobby");
        lh.setBounds(10,240,240,25);
        add(lh);

        cb3 = new JCheckBox("Singing");
        cb3.setBounds(260,240,100,25);
        add(cb3);
        cb4 = new JCheckBox("Dancing");
        cb4.setBounds(400,240,100,25);
        add(cb4);

        JLabel lci = new JLabel("City");
        lci.setBounds(10,280,240,25);
        add(lci);
        String[] ct = {"Nagpur","Amravati","wardha"};
        city = new JComboBox(ct);
        city.setBounds(260,280,100,25);
        add(city);

        Label l21 = new Label("Status");
        l21.setBounds(10,400,240,25);
        add(l21);

        Button b1= new Button("register");
        b1.setBounds(100,360,80,20);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sn = t1.getText();
                String add = t2.getText();
                String g =null;
                if(rb1.isSelected())
                    g="Male";
                else if(rb2.isSelected())
                    g="Female";
                System.out.println("gender" + g);

                String course = null;
                if(cb1.isSelected())
                    course ="Java";
                else if(cb2.isSelected())
                    course = "Sql";
                System.out.println("course" + course);

                String hobby = null;
                if(cb3.isSelected())
                    hobby = "Singing";
                else if(cb4.isSelected())
                    hobby = "Dancing";
                System.out.println("hobby" + hobby);

                String city1 = city.getSelectedItem().toString();

                Connection c = null;
                Statement st = null;
                try{
                    Class.forName("org.postgresql.Driver");
                    c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/mkpits01","postgres","sa");
                    //System.out.println("connected");
                    st=c.createStatement();
                    String sql="insert into student(studentname,address,gender,course,hobby,city) values('"+sn +"','"+add+"','"+g+"','"+course+"','"+hobby+"','"+city1+"')";
                    st.executeUpdate(sql);
                    l21.setText("registered successfully");
                    t1.setText("");
                    t2.setText("");

                    st.close();
                    c.close();
                } catch ( Exception ee)
                {
                    System.out.println(ee.toString());
                }
            }
        });
        add(b1);

        setSize(800,600);
        setTitle("MKPITS");
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
    }
    public static void main(String[] args){
        new JdbcExOnStudentRegistrationForm();
    }

}
