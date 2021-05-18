// WAP to create another table i.e. student having fields id,studname,age,address, email and insert data into it.


package src.com.mkpits.java.jdbcexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;

public class CreateStudentTableAndInsertData {
    public static void main(String[] args) {

        Connection c = null;
        Statement stmt = null;

        try {

            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mkpits01", "postgres", "sa");
            stmt = c.createStatement();

            String sql = "create table student01(id int, studname varchar(50),age int,address varchar(50),email varchar(50))";
            stmt.executeUpdate(sql);

            String sql1 = "insert into student01(id, studname ,age,address,email) values(1,'Swapnil',28,'Nagpur','swapnilkhedkar11@gmail.com')";
            stmt.executeUpdate(sql1);

            sql1 = "insert into student01(id, studname ,age,address,email) values(2,'Dhiru',22,'Nagpur','dhiru1234@gmail.com')";
            stmt.executeUpdate(sql1);

            stmt.close();
            c.commit();
            c.close();

        } catch (Exception ee) {

           // ee.printStackTrace();
            System.err.println(ee.getClass().getName() + ": "+ ee.getMessage());
            System.exit(0);
        }
        System.out.println("Records are created");
    }
}
