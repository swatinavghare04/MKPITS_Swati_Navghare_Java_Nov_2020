// create a jdbc program to create table into the database.

package src.com.mkpits.java.jdbcexamples;
import java.sql.*;

public class CreateEmployeeTable {
    public static void main(String[] args){
        Connection con = null;
        Statement stmt = null;
        try{
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mkpits01","postgres","sa");
            stmt = con.createStatement();
            String str = "create table Employee(empid int primary key, empname varchar(50),empaddress varchar(50))";
            stmt.executeUpdate(str);

            stmt.close();
            con.close();

        } catch(Exception ee){

            ee.printStackTrace();
            System.out.println(ee.getClass().getName()+":"+ ee.getMessage());
            System.exit(0);
        }
        System.out.println("Table cretaed successfully");
    }
}
