// WAP in java to read data from the file using fileReader.

import java.io.FileReader;

public class ReadDataFromFileUseFileReader {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("D:\\testout.txt");
            int i;
            while ((i = fr.read()) != -1)
                System.out.println((char) i);
            fr.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
