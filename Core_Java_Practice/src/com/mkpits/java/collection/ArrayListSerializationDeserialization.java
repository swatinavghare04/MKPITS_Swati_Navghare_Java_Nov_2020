// WAP to serialize an ArrayList object and then deserialize it.

package src.com.mkpits.java.collection;
import java.io.*;
import java.util.*;

public class ArrayListSerializationDeserialization {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(); //  creating array list
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");

        try{
            //Serialization
            FileOutputStream fos=new FileOutputStream("file");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(list);
            fos.close();
            oos.close();
            //Deserialization
            FileInputStream fis=new FileInputStream("file");
            ObjectInputStream ois=new ObjectInputStream(fis);
            ArrayList  list1=(ArrayList)ois.readObject();
            System.out.println(list1);

        }
        catch(Exception e){

            System.out.println(e);
        }
    }
}
