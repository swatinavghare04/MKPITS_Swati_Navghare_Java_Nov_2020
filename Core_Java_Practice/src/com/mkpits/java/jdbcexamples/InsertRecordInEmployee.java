// program to insert records in our employee table created.

package src.com.mkpits.java.jdbcexamples;
import java.sql.*;
import java.util.Scanner;

public class InsertRecordInEmployee {
    public static void main(String[] args) {
        Connection con=null;
        Statement stmt=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter empno");
        int empid=sc.nextInt();
        System.out.println("enter empname");
        String empname=sc.next();
        System.out.println("enter empaddress");
        String empaddress=sc.next();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits1","root","");
            System.out.println("connected successfully ");
            stmt =con.createStatement();
            String str="insert into employee(empid,empname,empaddress) values("+empid+",'"+empname+"','"+empaddress+"')";
            stmt.executeUpdate(str);
            System.out.println("record inserted successfully");
            con.close();
        }catch (Exception ee) {
            //code to connect java with mysql database
            System.out.println(ee.toString());
        }
    }

}
