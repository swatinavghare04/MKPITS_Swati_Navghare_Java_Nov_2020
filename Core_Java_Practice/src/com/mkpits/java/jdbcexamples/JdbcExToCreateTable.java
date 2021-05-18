// Write a simple program to create table.

package src.com.mkpits.java.jdbcexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;

public class JdbcExToCreateTable {
    public static void main(String[] args) {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mkpits01",
                    "postgres", "sa");
            //System.out.println("Opened database successfully");

            stmt = c.createStatement();
            String sql = "create table Company(id int primary key not null,name varchar(20), age int, address varchar(50),salary float)";
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Table created successfully");
    }
}
