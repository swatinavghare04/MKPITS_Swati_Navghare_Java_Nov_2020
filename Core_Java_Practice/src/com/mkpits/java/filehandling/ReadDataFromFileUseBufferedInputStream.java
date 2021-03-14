//WAP in java to read data from file using BufferedInputStream.

import java.io.*;

public class ReadDataFromFileUseBufferedInputStream {
    public static void main(String args[]) {
        try {
            FileInputStream fin = new FileInputStream("D:\\testout.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i;
            while ((i = bin.read()) != -1) {
                System.out.print((char) i);
            }
            bin.close();
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
