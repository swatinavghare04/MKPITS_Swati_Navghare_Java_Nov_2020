// WAP in java where we are writing a common data to four files a.txt,b.txt,c.txt,d.txt using CharArrayWriter.

import java.io.CharArrayWriter;
import java.io.FileWriter;

public class WriteCommonDataToFilesUseCharArrayWriter {
    public static void main(String[] args) {
        try {
            CharArrayWriter caw = new CharArrayWriter();
            caw.write("Welcome in java programming language ");
            FileWriter fw1 = new FileWriter("D:\\a.txt");
            FileWriter fw2 = new FileWriter("D:\\b.txt");
            FileWriter fw3 = new FileWriter("D:\\c.txt");
            FileWriter fw4 = new FileWriter("D:\\d.txt");
            caw.writeTo(fw1);
            caw.writeTo(fw2);
            caw.writeTo(fw3);
            caw.writeTo(fw4);
            fw1.close();
            fw2.close();
            fw3.close();
            fw4.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Success...");
    }
}

