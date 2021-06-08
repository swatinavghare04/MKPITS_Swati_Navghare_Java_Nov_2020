//  WAP to demonstrate example of ByteArrayInputStream to read data.

package src.com.mkpits.java.practiceprogram;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamToReadData {
    public static void main(String[] args){

        // create an array of byte
        byte[] array = {1,2,3,4};
        try{
            ByteArrayInputStream input = new ByteArrayInputStream(array);
            System.out.println("The bytes read from the input stream : ");
            for(int i=0;i<array.length;i++){

                // reads the bytes
                int data = input.read();
                System.out.println(data + ",");
            }
            input.close();
        }
        catch (Exception ee){
            ee.getStackTrace();
        }
    }
}
