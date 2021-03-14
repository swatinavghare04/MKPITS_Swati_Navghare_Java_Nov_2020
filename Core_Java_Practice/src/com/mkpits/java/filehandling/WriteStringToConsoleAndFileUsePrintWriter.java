// WAP in java to write some string to console and into the file using PrintWriter class.

import java.io.File;
import java.io.PrintWriter;

public class WriteStringToConsoleAndFileUsePrintWriter {
    public static void main(String[] args) throws Exception {
        // Data o write on console Using PrintWriter
        PrintWriter pw = new PrintWriter(System.out);
        pw.write("mkpits provides tutorials of all technology.");
        pw.flush();
        pw.close();

        // Data to write in File using PrintWriter
        PrintWriter pw1 = null;
        pw1 = new PrintWriter(new File("D:\\testin.txt"));
        pw1.write("Like Java,Spring,Hibernate,Android,PHP etc.");
        pw1.flush();
        pw1.close();
    }
}