// create a swing form to insert  ,update and delete and search records  into shop table.

package src.com.mkpits.java.jdbcexamples;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EmployeeDetails extends JFrame {
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3;
    JButton b1,b2,b3;

    Connection con = null;
    Statement stmt = null;

    EmployeeDetails(){
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

                try {
                    Class.forName("org.postgresql.Driver");
                    con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mkpits01", "postgres", "sa");
                    stmt = con.createStatement();
                    String str = "insert into employee values('"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"')";
                    stmt.executeUpdate(str);
                    con.close();

                    l4.setText("record inserted successfully");

                    t1.setText("");
                    t2.setText("");
                    t3.setText("");


                } catch(Exception ee){

                    l4.setText(ee.toString());
                }
            }
        });
        add(b1);


    }

    public static void main(String[] args){
        new EmployeeDetails();
    }

}
