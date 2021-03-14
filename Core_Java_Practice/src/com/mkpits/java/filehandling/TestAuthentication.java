/* WAP in java to accept username and password and print "authentication successful" if user entered username
 as admin and password as admin otherwise print "Invalid credentials".
 */

import java.io.*;
import java.nio.charset.StandardCharsets;
public class TestAuthentication {
    public static void main(String[] args){
        try{
            Console c = System.console();
            System.out.println("enter username: ");
            String un = c.readLine();
            System.out.println("enter password: ");
            char[] ch = c.readPassword();
            String pass = String.valueOf(ch); // converting char array into string
            if(un.equals("admin") && pass.equals("admin")){
                System.out.println("authentication successful");
            }
            else {
                System.out.println("Invalid credentials");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
