//WAP in java to accept name using console object.

import java.io.Console;

public class AcceptNameUseConsoleObject {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("Enter your name");
        String s = c.readLine();
        System.out.println("Welcome" + s);
    }
}
