// WAP in java to simultaneous writing and reading data from File.

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
public class SimultaneousWriteAndReadFromFile {
    public static void main(String[] args){
        try{
            // Data to write in File using PrintWriter
            PrintWriter pw = null;
            pw = new PrintWriter(new File("D:\\testout12.txt"));
            pw.write("Oracle Microsoft  Java vc.");
            pw.flush();
            pw.close();

            // to read data
            FileReader fr = new FileReader("D:\\testout12.txt");
            int i;
            while ((i=fr.read())!=-1)
                System.out.println((char) i);
            fr.close();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
