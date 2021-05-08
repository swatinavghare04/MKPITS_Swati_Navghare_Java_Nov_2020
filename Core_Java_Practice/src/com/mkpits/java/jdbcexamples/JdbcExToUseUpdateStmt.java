/* Java code to shows how we can use the UPDATE statement to update any record and then fetch and display
  updated records from our COMPANY table −
 */

package src.com.mkpits.java.jdbcexamples;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.*;

public class JdbcExToUseUpdateStmt {
    public static void main(String[] args){
        Connection c = null;
        Statement stmt = null;
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mkpits01","postgres","sa");
            c.setAutoCommit(false);
            System.out.println("Opened Database Successfully");
            stmt = c.createStatement();
            String sql1 = "update company set name = 'swati' where id = 1";
            stmt.executeUpdate(sql1);
            c.commit();

            ResultSet rs1 = stmt.executeQuery("select * from company;");
            while(rs1.next()){
                int id = rs1.getInt("id");
                String name = rs1.getString("name");
                System.out.println("ID ="+ id);
                System.out.println("Name ="+ name);
                System.out.println();
            }
            rs1.close();
            stmt.close();
            c.close();
        } catch(Exception e){
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

        System.out.println("Operation done Successfully");
    }
}
