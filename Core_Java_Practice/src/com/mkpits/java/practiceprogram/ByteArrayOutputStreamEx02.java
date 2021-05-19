// WAP to demonstrate how we can access data from ByteArrayOutputStream.

package src.com.mkpits.java.practiceprogram;

import java.io.ByteArrayOutputStream;

public class ByteArrayOutputStreamEx02 {
    public static void main(String[] args){

        String data = "This is data.";

        try{
            // create an output stream
            ByteArrayOutputStream out = new ByteArrayOutputStream();

            // Write data to the output stream
            out.write(data.getBytes());

           // Returns an array of bytes
           byte[] byteData = out.toByteArray();
           System.out.print("Data using toByteArray() : ");
           for(int i=0; i<byteData.length;i++){
               System.out.println((char)byteData[i]);
           }

           // Returns a string
            String stringData = out.toString();
           System.out.println("\n Data using toString(): " + stringData);

            out.close();
        }
        catch (Exception e){
            e.getStackTrace();
        }
    }
}
