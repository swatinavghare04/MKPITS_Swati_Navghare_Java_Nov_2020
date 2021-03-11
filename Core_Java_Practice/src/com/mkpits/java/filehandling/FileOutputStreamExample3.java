package src.com.mkpits.java.filehandling;

import java.io.FileOutputStream;
public class FileOutputStreamExample3 {
    public static void main(String args[]) {
        try {
            FileOutputStream fout = new FileOutputStream("D:\\testin.txt");
            String s = "Welcome to learn java Program.";
            byte b[] = s.getBytes();//converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
