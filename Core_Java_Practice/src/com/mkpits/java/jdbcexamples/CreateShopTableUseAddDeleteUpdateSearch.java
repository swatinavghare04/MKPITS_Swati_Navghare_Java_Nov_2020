package com.mkpits.java.jdbcexamples;

import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class shop{

    int shopno;
    String city;
    String owner;
    String address;

    Connection con = null;
    Statement stmt =null;

    public void connect(){
        try{
             Class.forName("org.postgresql.Driver");
             con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mkpits01","postgres","sa");

        } catch(Exception ee){
            System.out.println(ee.toString());
        }
    }

    public String addShop(int shopno, String city,String owner,String address){
        this.shopno=shopno;
        this.city=city;
        this.owner=owner;
        this.address=address;

        try{
            connect();
            String str = "insert into shop values("+shopno+",'"+city+"','"+owner+"','"+address+"')";
            stmt = con.createStatement();
            stmt.executeUpdate(str);
            stmt.close();
            con.close();
            return "Shop added successfully";
        } catch(Exception ee){
            return ee.toString();
        }
    }

    public  String updateShop(int shopno,String city,String owner,String address) {
        this.shopno=shopno;
        this.city=city;
        this.owner=owner;
        this.address=address;
        try {
            connect();
            String str = "update shop set city='" + city + "',owner='" + owner + "',address='" + address + "' where shopno="+shopno+"";
            stmt = con.createStatement();
            stmt.executeUpdate(str);
            stmt.close();
            con.close();
            return "Shop updated successfully";

        }catch ( Exception ee) {
            return  ee.toString();
        }
    }
    public  String removeShop(int shopno) {
        this.shopno=shopno;
        try {
            connect();
            String str = "delete from shop where shop_no="+shopno+"";
            stmt = con.createStatement();
            stmt.executeUpdate(str);
            stmt.close();
            con.close();
            return "Shop removed successfully";

        }catch ( Exception ee) {
            return  ee.toString();
        }
    }

    public  String searchShop(int shopno) {
        this.shopno=shopno;
        int flag=0;
        String res=null;
        try {
            connect();
            String str = "select * from shop where shopno="+shopno+"";
            stmt = con.createStatement();
            ResultSet rs=   stmt.executeQuery(str);
            while (rs.next()) {
                flag=1;
                this.city=rs.getString("city");
                this.owner=rs.getString("owner");
                this.address=rs.getString("address");
            }
            rs.close();
            stmt.close();
            con.close();
            if(flag==0) {
                res="No record found";
            }
            return res;

        }catch ( Exception ee) {
            return  ee.toString();
        }

    }

}
public class CreateShopTableUseAddDeleteUpdateSearch extends JFrame {
    JLabel l1, l2, l3, l4, l5;
    JTextField t1, t2, t3, t4;
    JButton b1, b2, b3, b4;

    Connection con = null;
    Statement stmt = null;
    shop s1 = null;
    CreateShopTableUseAddDeleteUpdateSearch() {
        s1 = new shop();
        l1 = new JLabel("shop no.");
        l1.setBounds(20, 50, 200, 20);
        add(l1);
        t1 = new JTextField();
        t1.setBounds(230, 50, 200, 20);
        add(t1);
        l2 = new JLabel("City.");
        l2.setBounds(20, 100, 200, 20);
        add(l2);
        t2 = new JTextField();
        t2.setBounds(230, 100, 200, 20);
        add(t2);

        l3 = new JLabel("Owner.");
        l3.setBounds(20, 150, 200, 20);
        add(l3);
        t3 = new JTextField();
        t3.setBounds(230, 150, 200, 20);
        add(t3);

        l4 = new JLabel("Address.");
        l4.setBounds(20, 200, 200, 20);
        add(l4);
        t4 = new JTextField();
        t4.setBounds(230, 200, 200, 20);
        add(t4);

        b1 = new JButton("Save");
        b1.setBounds(100, 250, 100, 30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String result= s1.addShop(Integer.parseInt(t1.getText()),t2.getText(),t3.getText(),t4.getText());
                    l5.setText(result);
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");

                } catch(Exception ee){

                    l5.setText(ee.toString());
                }
            }
        });
        add(b1);

        b2 = new JButton("Update");
        b2.setBounds(220, 250, 100, 30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    String result= s1.updateShop(Integer.parseInt(t1.getText()),t2.getText(),t3.getText(),t4.getText());
                    l5.setText(result);
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
        b3.setBounds(330, 250, 100, 30);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String result= s1.removeShop(Integer.parseInt(t1.getText()));
                    l5.setText(result);
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

        b4 = new JButton("Search");
        b4.setBounds(450, 50, 100, 30);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String r=s1.searchShop(Integer.parseInt(t1.getText()));
                    t2.setText(s1.city);
                    t3.setText(s1.owner);
                    t4.setText(s1.address);
                    l5.setText(r);


                } catch (Exception ee) {
                    l5.setText(ee.toString());
                }
            }
        });
        add(b4);

        l5 = new JLabel("Status.");
        l5.setBounds(10, 300, 400, 20);
        add(l5);
        setTitle("shop entry form");
        setSize(600, 400);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args){
        new CreateShopTableUseAddDeleteUpdateSearch();
    }
}