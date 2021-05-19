// WAP to demonstrate example of ByteArrayOutputStream to write data.

package src.com.mkpits.java.practiceprogram;

import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;

public class ByteArrayOutputSteamToWrite {
    public static void main(String[] args){

        String data = "This is a line of text inside the string.";

        try{
            // create an output stream
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] array = data.getBytes();

            // Write data to the output stream
            out.write(array);

            // Retrives data from the output stream in string formate
            String streamData = out.toString();
            System.out.println("Output stream : " + streamData);

            out.close();
        }
        catch (Exception e){
            e.getStackTrace();
        }
    }
}
