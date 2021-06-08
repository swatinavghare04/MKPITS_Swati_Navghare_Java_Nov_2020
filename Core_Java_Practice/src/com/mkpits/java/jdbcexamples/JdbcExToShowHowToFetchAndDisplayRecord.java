//Java program to shows how we can fetch and display records from our COMPANY table.

package src.com.mkpits.java.jdbcexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;

public class JdbcExToShowHowToFetchAndDisplayRecord {
    public static void main(String[] args){

        Connection c = null;
        Statement stmt = null;
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mkpits01","postgres","sa");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("select * from company;");

            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String address = rs.getString("address");
                float salary = rs.getFloat("salary");
                System.out.println("ID = " + id);
                System.out.println("Name ="+ name);
                System.out.println("Age ="+ age);
                System.out.println("Address ="+ address);
                System.out.println("Salary ="+ salary);
                System.out.println();
            }
            rs.close();
            stmt.close();
            c.commit();
            c.close();

        } catch(Exception e){
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened Database Successfully");
    }
}
