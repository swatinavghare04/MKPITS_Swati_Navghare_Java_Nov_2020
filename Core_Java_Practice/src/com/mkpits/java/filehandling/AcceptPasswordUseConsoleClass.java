// WAP in java to accept password using console class.

import java.io.Console;

public class AcceptPasswordUseConsoleClass {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("Enter password :");
        char[] ch = c.readPassword();
        String pass = String.valueOf(ch); // converting character array into string
        System.out.println("Password is :" + pass);
    }
}
