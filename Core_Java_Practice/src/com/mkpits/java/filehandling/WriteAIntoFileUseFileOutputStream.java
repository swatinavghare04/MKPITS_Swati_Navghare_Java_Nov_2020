// WAP in java to write capital A in a file named testout.txt using FileOutputStream class.

import java.io.FileOutputStream;
public class WriteAIntoFileUseFileOutputStream {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("e:\\testout.txt");
            fout.write(65);
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }


}
