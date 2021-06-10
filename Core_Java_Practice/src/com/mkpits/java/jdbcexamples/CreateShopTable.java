// WAP to demonstrate how to create shop table.

package src.com.mkpits.java.jdbcexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateShopTable {
    public static void main(String[] args){
        Connection con = null;
        Statement stmt = null;
        try{
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mkpits01","postgres","sa");
            stmt = con.createStatement();
            String str = "create table shop(shopno int primary key, city varchar(50), owner varchar(50),address varchar(50))";
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
