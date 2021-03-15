// WAP in java to write some string into a file using FileWriter.

import java.io.FileWriter;
public class WriteStringIntoFileUseFileWriter {
    public static void main(String[] args){
        try{
            FileWriter fw = new FileWriter("D:\\testout.txt");
            fw.write("Welcome to MKPITS.");
            fw.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Success");
    }
}
