//WAP in java to write some string into file using BufferedOutputStream class.

import java.io.*;

public class WriteStingIntoFileUseBufferedOutputStream {
    public static void main(String[] args) throws Exception {
        FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String s = "Welcome to mkpits.";
        byte b[] = s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("success");
    }
}
