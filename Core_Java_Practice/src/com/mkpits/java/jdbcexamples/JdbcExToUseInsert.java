//Java program to shows how we can create records in our COMPANY table.

package src.com.mkpits.java.jdbcexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;

public class JdbcExToUseInsert {
    public static void main(String[] args){
        Connection c = null;
        Statement stmt = null;
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mkpits01","postgres","sa");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");
            stmt = c.createStatement();
            String sql = "insert into company(id, name) values(2,'Neha')";
            stmt.executeUpdate(sql);

            sql = "insert into company(id, name) values(3,'Sonu');";
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            c.close();

        } catch(Exception e){
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

        System.out.println("Record created Successfully");
    }
}