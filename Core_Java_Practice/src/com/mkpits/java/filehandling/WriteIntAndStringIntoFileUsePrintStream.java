// WAP in jva to write integer and some string into file using printstream class.

import java.io.FileOutputStream;
import java.io.PrintStream;

public class WriteIntAndStringIntoFileUsePrintStream {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
            PrintStream pout = new PrintStream(fout);
            pout.println(2016);
            pout.println("Hello Java");
            pout.println("Welcome to Java");
            pout.close();
            fout.close();

        } catch (Exception ee) {
            System.out.println(ee);
        }
        System.out.println("Success");
    }
}
