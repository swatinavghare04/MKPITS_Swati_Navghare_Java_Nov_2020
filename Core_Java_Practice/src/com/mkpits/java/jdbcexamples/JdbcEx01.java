// WAP to establish a connection between postgresql and Java.

package src.com.mkpits.java.jdbcexamples;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcEx01 {
    public static void main(String[] args) {
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mkpits01",
                    "postgres", "sa");
            System.out.println("connected");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
    }
}