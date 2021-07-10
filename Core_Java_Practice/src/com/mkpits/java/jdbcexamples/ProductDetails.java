// create a swing form to insert  ,update and delete and search records  into product table.

package src.com.mkpits.java.jdbcexamples;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ProductDetails extends JFrame {
    JLabel l1, l2, l3, l4, l5, l6, l7, l8;
    JTextField t1, t2, t3, t4, t5, t6, t7;
    JButton b1, b2, b3, b4;

    Connection con = null;
    Statement stmt = null;

    ProductDetails() {
        l1 = new JLabel("Product Id");
        l1.setBounds(20, 50, 200, 20);
        add(l1);
        t1 = new JTextField();
        t1.setBounds(230, 50, 200, 20);
        add(t1);

        l2 = new JLabel("Product Name");
        l2.setBounds(20, 100, 200, 20);
        add(l2);
        t2 = new JTextField();
        t2.setBounds(230, 100, 200, 20);
        add(t2);

        l3 = new JLabel("Product Quantity");
        l3.setBounds(20, 150, 200, 20);
        add(l3);
        t3 = new JTextField();
        t3.setBounds(230, 150, 200, 20);
        add(t3);

        l4 = new JLabel("Selling Price");
        l4.setBounds(20, 200, 200, 20);
        add(l4);
        t4 = new JTextField();
        t4.setBounds(230, 200, 200, 20);
        add(t4);

        l5 = new JLabel("Batch Name");
        l5.setBounds(20, 250, 200, 20);
        add(l5);
        t5 = new JTextField();
        t5.setBounds(230, 250, 200, 20);
        add(t5);

        l4 = new JLabel("Mfg Date");
        l4.setBounds(20, 300, 200, 20);
        add(l4);
        t4 = new JTextField();
        t4.setBounds(230, 300, 200, 20);
        add(t4);

        l4 = new JLabel("Expiry Date");
        l4.setBounds(20, 350, 200, 20);
        add(l4);
        t4 = new JTextField();
        t4.setBounds(230, 350, 200, 20);
        add(t4);

        b1 = new JButton("Save");
        b1.setBounds(100, 400, 100, 30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    Class.forName("org.postgresql.Driver");
                    con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mkpits01", "postgres", "sa");
                    stmt = con.createStatement();
                    String str = "insert into product values('" + t1.getText() + "','" + t2.getText() + "','" + t3.getText() + "','" + t4.getText() + "','" + t5.getText() + "','" + t6.getText() + "','" + t7.getText() + "')";
                    stmt.executeUpdate(str);
                    con.close();
                    l8.setText("record inserted successfully");
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");
                    t5.setText("");
                    t6.setText("");
                    t7.setText("");

                } catch (Exception ee) {

                    l8.setText(ee.toString());
                }
            }
        });
        add(b1);
        b2 = new JButton("Update");
        b2.setBounds(220, 400, 100, 30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("org.postgresql.Driver");
                    con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mkpits01", "postgres", "sa");
                    stmt = con.createStatement();
                    String str = "update product set pname='" + t2.getText() + "',pqty='" + t3.getText() + "',sp='" + t4.getText() + "',batchname ='" + t5.getText() + "',mfgdate ='" + t6.getText() + "',expdate ='" + t7.getText() + "' where pid='" + t1.getText() + "'";
                    stmt.executeUpdate(str);
                    con.close();
                    l8.setText("record updated successfully");
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");
                    t5.setText("");
                    t6.setText("");
                    t7.setText("");

                } catch (Exception ee) {
                    l8.setText(ee.toString());
                }
            }
        });
        add(b2);
        b3 = new JButton("Delete");
        b3.setBounds(330, 400, 100, 30);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("org.postgresql.Driver");
                    con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mkpits01", "postgres", "sa");
                    stmt = con.createStatement();
                    String str = "delete from product where pid='" + t1.getText() + "'";
                    stmt.executeUpdate(str);
                    con.close();
                    l8.setText("record deleted successfully");
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");
                    t5.setText("");
                    t6.setText("");
                    t7.setText("");

                } catch (Exception ee) {
                    l5.setText(ee.toString());
                }

            }
        });
        add(b3);

        b4 = new JButton("Search");
        b4.setBounds(450, 50, 100, 30);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("org.postgresql.Driver");
                    con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mkpits01", "postgres", "sa");
                    stmt = con.createStatement();
                    String str = "select * from product where pid='" + t1.getText() + "'";
                    ResultSet rs = stmt.executeQuery(str);
                    int flag = 0;
                    while (rs.next()) {
                        flag = 1;
                        t2.setText(rs.getString("Product Name"));
                        t3.setText(rs.getString("Product Quantity"));
                        t4.setText(rs.getString("Selling Price"));
                        t5.setText(rs.getString("Batch Name"));
                        t6.setText(rs.getString("Mfg Date"));
                        t7.setText(rs.getString("Expiry Date"));
                    }
                    if (flag == 0) {
                        l8.setText("record not found");
                        t2.setText("");
                        t3.setText("");
                        t4.setText("");
                        t5.setText("");
                        t6.setText("");
                        t7.setText("");
                    }
                    rs.close();
                    con.close();


                } catch (Exception ee) {
                    l5.setText(ee.toString());
                }
            }
        });
        add(b4);

        l8 = new JLabel("Status.");
        l8.setBounds(10, 500, 400, 20);
        add(l8);
        setTitle("product entry form");
        setSize(600, 600);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ProductDetails();
    }

}
