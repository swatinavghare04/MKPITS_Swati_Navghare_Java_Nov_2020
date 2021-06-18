// create a swing form to insert  ,update and delete and search records  into product table.

package src.com.mkpits.java.jdbcexamples;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CustomerDetails extends JFrame {
    JLabel l1, l2, l3, l4, l5;
    JTextField t1, t2, t3, t4;
    JButton b1, b2, b3, b4;

    Connection con = null;
    Statement stmt = null;

    CustomerDetails() {
        l1 = new JLabel("Customer Id");
        l1.setBounds(20, 50, 200, 20);
        add(l1);
        t1 = new JTextField();
        t1.setBounds(250, 50, 200, 20);
        add(t1);

        l2 = new JLabel("Customer Name");
        l2.setBounds(20, 100, 200, 20);
        add(l2);
        t2 = new JTextField();
        t2.setBounds(250, 100, 200, 20);
        add(t2);

        l3 = new JLabel("Customer Address");
        l3.setBounds(20, 150, 200, 20);
        add(l3);
        t3 = new JTextField();
        t3.setBounds(250, 150, 200, 20);
        add(t3);

        l4 = new JLabel("Mobile No.");
        l4.setBounds(20, 200, 200, 20);
        add(l4);
        t4 = new JTextField();
        t4.setBounds(250, 200, 200, 20);
        add(t4);

        b1 = new JButton("Save");
        b1.setBounds(100, 260, 100, 30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("org.postgresql.Driver");
                    con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mkpits01", "postgres", "sa");
                    stmt = con.createStatement();
                    String str = "insert into customer values('" + t1.getText() + "','" + t2.getText() + "','" + t3.getText() + "','" + t4.getText() + "')";
                    stmt.executeUpdate(str);
                    con.close();

                    l5 = new JLabel("record save successfully");
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");

                } catch (Exception ee) {
                    l5.setText(ee.toString());
                }
            }
        });
        add(b1);

        b2 = new JButton("Update");
        b2.setBounds(230, 260, 100, 30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("org.postgresql.Driver");
                    con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mkpits01", "postgres", "sa");
                    stmt = con.createStatement();
                    String str = "update customer set custname='" + t2.getText() + "',custaddr='" + t3.getText() + "',mobno='" + t4.getText() + "' where id = '"+t1.getText()+"'";
                    stmt.executeUpdate(str);
                    con.close();

                    l5 = new JLabel("record updated successfully");
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");

                } catch (Exception ee) {
                    l5.setText(ee.toString());
                }
            }
        });
        add(b2);

        b3 = new JButton("Delete");
        b3.setBounds(340, 260, 100, 30);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("org.postgresql.Driver");
                    con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mkpits01", "postgres", "sa");
                    stmt = con.createStatement();
                    String str = "delete from customer where id = '" + t1.getText() + "'";
                    stmt.executeUpdate(str);
                    con.close();
                    l5 = new JLabel("record deleted successfully");
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");

                } catch (Exception ee) {
                    l5.setText(ee.toString());
                }
            }
        });
        add(b3);

        b4 = new JButton("search");
        b4.setBounds(470, 50, 100, 30);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("org.postgresql.Driver");
                    con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mkpits01", "postgres", "sa");
                    stmt = con.createStatement();
                    String str = "select * from customer where id = '" + t1.getText() + "'";
                    ResultSet rs = stmt.executeQuery(str);
                    int flag = 0;
                    while (rs.next()) {
                        flag = 1;

                        t2.setText(rs.getString("custname"));
                        t3.setText(rs.getString("custaddr"));
                        t4.setText(rs.getString("mobno"));
                    }
                    if (flag == 0) {
                        l5 = new JLabel("record not found");
                        t2.setText("");
                        t3.setText("");
                        t4.setText("");
                    }
                    rs.close();
                    con.close();

                } catch (Exception ee) {
                    l5.setText(ee.toString());
                }
            }
        });
        add(b4);

        l5 = new JLabel("Status");
        l5.setBounds(10,310,400,30);
        add(l5);

        setTitle("Customer Table");
        setLayout(null);
        setSize(600, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CustomerDetails();
    }
}
