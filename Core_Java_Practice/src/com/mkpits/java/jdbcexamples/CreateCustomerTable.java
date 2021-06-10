// WAP to demonstrate how to create customer table.

package src.com.mkpits.java.jdbcexamples;
import java.sql.*;

public class CreateCustomerTable {
    public static void main(String[] args){
        Connection con = null;
        Statement stmt = null;


        try{
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mkpits01","postgres","sa");
            stmt = con.createStatement();
            String str = "create table Customer(id int primary Key,custname varchar(50),custaddr varchar(50),mobno varchar(50))";
            stmt.executeUpdate(str);

            con.close();
            stmt.close();

        } catch(Exception ee){

            System.out.println(ee.toString());
        }
        System.out.println("Table created successfully");
    }
}

