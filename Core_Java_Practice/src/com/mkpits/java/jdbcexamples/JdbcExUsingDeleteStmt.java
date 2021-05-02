/* Java code to shows how we can use the DELETE statement to delete any record and then fetch and display
 remaining records from our COMPANY table
 */

package src.com.mkpits.java.jdbcexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;

public class JdbcExUsingDeleteStmt {
    public static void main(String[] args){
        Connection c = null;
        Statement stmt = null;
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mkpits01","postgres","sa");
            c.setAutoCommit(false);
            System.out.println("Opened Database Successfully");

            stmt = c.createStatement();
            String sql1 = "delete from company where id = 1";
            stmt.executeUpdate(sql1);
            c.commit();

            ResultSet rs = stmt.executeQuery("select * from company;");
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println("ID ="+ id);
                System.out.println("Name ="+ name);
                System.out.println();
            }

            rs.close();
            stmt.close();
            c.close();

        } catch(Exception e){
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

        System.out.println("Operation done Successfully");
    }

}