// WAP to demonstrate how to create product table.

package src.com.mkpits.java.jdbcexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateProductTable {
    public static void main(String[] args){
        Connection con = null;
        Statement stmt = null;
        try{
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mkpits01","postgres","sa");
            stmt = con.createStatement();
            String str = "create table product(pid int primary key,pname varchar(50),pqty int, sp float, batchname varchar(50),mfgdate varchar(50), expdate varchar(50))";
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
