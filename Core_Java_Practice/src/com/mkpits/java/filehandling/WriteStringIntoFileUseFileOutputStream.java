//WAP in java to create a file and write some string into it using FileOutputStream class.

import java.io.FileOutputStream;

public class WriteStringIntoFileUseFileOutputStream {
    public static void main(String args[]) {
        try {
            FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
            String s = "Welcome to mkpits.";
            byte b[] = s.getBytes();//converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
