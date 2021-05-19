// WAP to demonstrate how we can use the objectInputStream classnto read object written by the objectOutputStream.

package src.com.mkpits.java.practiceprogram;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputStreamEx01 {
    public static void main(String[] args){
        int data = 5;
        String data1 = "This is programiz";

        try{
            FileOutputStream file = new FileOutputStream("file.txt");
            ObjectOutputStream output = new ObjectOutputStream(file);

            // Weitting to the file using objectOutputStream
            output.writeInt(data);
            output.writeObject(data1);

            FileInputStream fileStream = new FileInputStream("file.txt");
            // creating an object input stream
            ObjectInputStream objStream = new ObjectInputStream(fileStream);

            // using the readInt() method
            System.out.println("Integer data :" + objStream.readInt());

            // using the readObject() method
            System.out.println("String data : "+ objStream.readObject());

            output.close();
            objStream.close();
        }
        catch (Exception e){
            e.getStackTrace();
        }
    }
}
