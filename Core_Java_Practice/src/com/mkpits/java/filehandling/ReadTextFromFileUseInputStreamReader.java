// WAP in java to read text from the file using InputStreamReader class.

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReadTextFromFileUseInputStreamReader {
    public static void main(String[] args){
        try{
            InputStream stream = new FileInputStream("D:\\a.txt");
            Reader reader = new InputStreamReader(stream);
            int data = reader.read();
            while (data!=-1){
                System.out.println( (char)data);
                data = reader.read();
            }
        }
        catch (Exception ee){
            System.out.println(ee);
        }
    }
}
